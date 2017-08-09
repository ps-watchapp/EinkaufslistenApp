	package md2.einkaufszettel.md2.model.sqlite;

import java.sql.SQLException;
import de.uni_muenster.wi.md2library.model.type.interfaces.Md2Entity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import md2.einkaufszettel.R;

import md2.einkaufszettel.md2.model.Artikel;
import md2.einkaufszettel.md2.model.__ReturnStepStack;
import md2.einkaufszettel.md2.model.__ProcessChainControllerState;

 
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
 
/**
 * Database helper which creates and upgrades the database and provides the DAOs for the app.
 * 
 * 
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
 
 
	private static final String DATABASE_NAME = "EinkaufszettelApp.db";
	private static final int DATABASE_VERSION = 1; 
 
	
	private Dao<Artikel, Integer> ArtikelDao;	
	private Dao<__ReturnStepStack, Integer> __ReturnStepStackDao;	
	private Dao<__ProcessChainControllerState, Integer> __ProcessChainControllerStateDao;	
	
 
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
	}
 
 
	@Override
	public void onCreate(SQLiteDatabase sqliteDatabase, ConnectionSource connectionSource) {
		try {
			
			// Create tables. This onCreate() method will be invoked only once of the application life time i.e. the first time when the application starts.
			TableUtils.createTable(connectionSource, Artikel.class);	
			TableUtils.createTable(connectionSource, __ReturnStepStack.class);	
			TableUtils.createTable(connectionSource, __ProcessChainControllerState.class);	
			
		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(), "Unable to create datbases", e);
		}
	}
 
	@Override
	public void onUpgrade(SQLiteDatabase sqliteDatabase, ConnectionSource connectionSource, int oldVer, int newVer) {
		try {
			
			// In case of change in database of next version of application, please increase the value of DATABASE_VERSION variable, then this method will be invoked 
			//automatically. Developer needs to handle the upgrade logic here, i.e. create a new table or a new column to an existing table, take the backups of the
			// existing database etc.
			
			//TableUtils.dropTable(connectionSource, TeacherDetails.class, true);
			//TableUtils.dropTable(connectionSource, StudentDetails.class, true);
			//onCreate(sqliteDatabase, connectionSource);
			
		} catch (Exception e) {
			Log.e(DatabaseHelper.class.getName(), "Unable to upgrade database from version " + oldVer + " to new "
					+ newVer, e);
		}
	}
	
	
	// Create the getDao methods of all database tables to access those from android code.
	// Insert, delete, read, update everything will be happened through DAOs
 
public Dao<Artikel, Integer> getArtikelDao() throws SQLException {
		if (ArtikelDao == null) {
			ArtikelDao = getDao(Artikel.class);
		}
		return ArtikelDao;
	}	
public Dao<__ReturnStepStack, Integer> get__ReturnStepStackDao() throws SQLException {
		if (__ReturnStepStackDao == null) {
			__ReturnStepStackDao = getDao(__ReturnStepStack.class);
		}
		return __ReturnStepStackDao;
	}	
public Dao<__ProcessChainControllerState, Integer> get__ProcessChainControllerStateDao() throws SQLException {
		if (__ProcessChainControllerStateDao == null) {
			__ProcessChainControllerStateDao = getDao(__ProcessChainControllerState.class);
		}
		return __ProcessChainControllerStateDao;
	}	
	
 
 public <T extends Md2Entity> Dao<T, Integer> getDaoByName(String entity){
 final String entityType= entity;
 try{
 switch(entityType){
 case "Artikel": 	if (ArtikelDao == null) {
 			ArtikelDao =  getDao(Artikel.class);
 		}
 		return (Dao<T, Integer>) ArtikelDao;
 case "__ReturnStepStack": 	if (__ReturnStepStackDao == null) {
 			__ReturnStepStackDao =  getDao(__ReturnStepStack.class);
 		}
 		return (Dao<T, Integer>) __ReturnStepStackDao;
 case "__ProcessChainControllerState": 	if (__ProcessChainControllerStateDao == null) {
 			__ProcessChainControllerStateDao =  getDao(__ProcessChainControllerState.class);
 		}
 		return (Dao<T, Integer>) __ProcessChainControllerStateDao;
 default: return null;	
 } 	}
 catch(SQLException e){
 e.printStackTrace();	
 return null;
 }
 
 }
 
 

}
