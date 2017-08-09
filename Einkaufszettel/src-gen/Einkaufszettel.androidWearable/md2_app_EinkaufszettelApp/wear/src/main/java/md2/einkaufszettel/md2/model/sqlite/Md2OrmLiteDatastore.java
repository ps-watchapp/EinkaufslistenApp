package md2.einkaufszettel.md2.model.sqlite;
//package md2.einkaufszettel.EinkaufszettelApp;

import android.content.Context;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


import de.uni_muenster.wi.md2library.model.dataStore.implementation.AbstractMd2OrmLiteDatastore;
import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Entity;
import md2.einkaufszettel.EinkaufszettelApp;

/**
 * Created by felix_000 on 19.05.2017.
 */


public  class Md2OrmLiteDatastore<T extends  Md2Entity> extends AbstractMd2OrmLiteDatastore {

private String entityType;
private DatabaseHelper databaseHelper;

Dao<T , Integer> myDao;

public Md2OrmLiteDatastore(String entity){
this.entityType=entity;
    initDatabaseHelper(EinkaufszettelApp.getAppContext());
}

public void initDatabaseHelper(Context context){
    databaseHelper = OpenHelperManager.getHelper(context,DatabaseHelper.class);
}

public DatabaseHelper getHelper() {

return databaseHelper;
}



public Dao<T, Integer> getMyDao(){
   if(myDao==null) {
   myDao= this.getHelper().getDaoByName(entityType);
   }
  return myDao;	   
}



public List<T> loadAll(){
    List<T> all= new ArrayList<T>();
        try {
           all=  getMyDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return all;
    }


}





