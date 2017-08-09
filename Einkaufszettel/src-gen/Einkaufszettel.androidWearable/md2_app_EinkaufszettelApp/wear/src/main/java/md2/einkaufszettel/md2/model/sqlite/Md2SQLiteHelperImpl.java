// generated in de.wwu.md2.framework.generator.android.lollipop.model.SQLite.generateSQLiteHelper()
package md2.einkaufszettel.md2.model.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import md2.einkaufszettel.md2.model.sqlite.Md2DataContract.ArtikelEntry;
import md2.einkaufszettel.md2.model.sqlite.Md2DataContract.__ReturnStepStackEntry;
import md2.einkaufszettel.md2.model.sqlite.Md2DataContract.__ProcessChainControllerStateEntry;

import de.uni_muenster.wi.md2library. model.dataStore.interfaces.Md2SQLiteHelper;

public class Md2SQLiteHelperImpl extends SQLiteOpenHelper implements Md2SQLiteHelper {
	private static final String DATABASE_NAME = "einkaufszettelapp.db";
	private static final int DATABASE_VERSION = (int) 1.0;
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	private static final String SQL_CREATE_ARTIKEL_ENTRIES =
		"CREATE TABLE " + ArtikelEntry.TABLE_NAME + " (" +
		ArtikelEntry._ID + " INTEGER PRIMARY KEY" +
		COMMA_SEP +
		ArtikelEntry.COLUMN_NAME_BEZEICHNUNG + TEXT_TYPE + COMMA_SEP +
		ArtikelEntry.COLUMN_NAME_ANZAHL + TEXT_TYPE + COMMA_SEP +
		ArtikelEntry.COLUMN_NAME_STATUS
 + TEXT_TYPE +		" )";
								
		private static final String SQL_DELETE_ARTIKEL_ENTRIES =
			"DROP TABLE IF EXISTS " + ArtikelEntry.TABLE_NAME;
						
		private final String[] allArtikelColumns = {
		ArtikelEntry.COLUMN_NAME_BEZEICHNUNG, 
		ArtikelEntry.COLUMN_NAME_ANZAHL, 
		ArtikelEntry.COLUMN_NAME_STATUS
		};
	private static final String SQL_CREATE___RETURNSTEPSTACK_ENTRIES =
		"CREATE TABLE " + __ReturnStepStackEntry.TABLE_NAME + " (" +
		__ReturnStepStackEntry._ID + " INTEGER PRIMARY KEY" +
		COMMA_SEP +
		__ReturnStepStackEntry.COLUMN_NAME_RETURNSTEP + TEXT_TYPE + COMMA_SEP +
		__ReturnStepStackEntry.COLUMN_NAME_RETURNANDREVERSESTEP + TEXT_TYPE + COMMA_SEP +
		__ReturnStepStackEntry.COLUMN_NAME_RETURNANDPROCEEDSTEP + TEXT_TYPE + COMMA_SEP +
		__ReturnStepStackEntry.COLUMN_NAME_TAIL
 + TEXT_TYPE +		" )";
								
		private static final String SQL_DELETE___RETURNSTEPSTACK_ENTRIES =
			"DROP TABLE IF EXISTS " + __ReturnStepStackEntry.TABLE_NAME;
						
		private final String[] all__ReturnStepStackColumns = {
		__ReturnStepStackEntry.COLUMN_NAME_RETURNSTEP, 
		__ReturnStepStackEntry.COLUMN_NAME_RETURNANDREVERSESTEP, 
		__ReturnStepStackEntry.COLUMN_NAME_RETURNANDPROCEEDSTEP, 
		__ReturnStepStackEntry.COLUMN_NAME_TAIL
		};
	private static final String SQL_CREATE___PROCESSCHAINCONTROLLERSTATE_ENTRIES =
		"CREATE TABLE " + __ProcessChainControllerStateEntry.TABLE_NAME + " (" +
		__ProcessChainControllerStateEntry._ID + " INTEGER PRIMARY KEY" +
		COMMA_SEP +
		__ProcessChainControllerStateEntry.COLUMN_NAME_CURRENTPROCESSCHAINSTEP + TEXT_TYPE + COMMA_SEP +
		__ProcessChainControllerStateEntry.COLUMN_NAME_LASTEVENTFIRED
 + TEXT_TYPE +		" )";
								
		private static final String SQL_DELETE___PROCESSCHAINCONTROLLERSTATE_ENTRIES =
			"DROP TABLE IF EXISTS " + __ProcessChainControllerStateEntry.TABLE_NAME;
						
		private final String[] all__ProcessChainControllerStateColumns = {
		__ProcessChainControllerStateEntry.COLUMN_NAME_CURRENTPROCESSCHAINSTEP, 
		__ProcessChainControllerStateEntry.COLUMN_NAME_LASTEVENTFIRED
		};

   public Md2SQLiteHelperImpl(Context context) {
       super(context, DATABASE_NAME, null, DATABASE_VERSION);
   }


    @Override
    public void onCreate(SQLiteDatabase database) {
    	database.execSQL(SQL_CREATE_ARTIKEL_ENTRIES);
    	database.execSQL(SQL_CREATE___RETURNSTEPSTACK_ENTRIES);
    	database.execSQL(SQL_CREATE___PROCESSCHAINCONTROLLERSTATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    	db.execSQL(SQL_DELETE_ARTIKEL_ENTRIES);
    	db.execSQL(SQL_DELETE___RETURNSTEPSTACK_ENTRIES);
    	db.execSQL(SQL_DELETE___PROCESSCHAINCONTROLLERSTATE_ENTRIES);
        onCreate(db);		
    }

    @Override
    public SQLiteDatabase open(boolean writeAccess) {
        return (writeAccess) ? this.getWritableDatabase() : this.getReadableDatabase();
    }

    @Override
    public String[] getAllColumns(String typeName) {
        switch (typeName) {
        	case "Artikel": {
        		return this.allArtikelColumns;
        	}
        	case "__ReturnStepStack": {
        		return this.all__ReturnStepStackColumns;
        	}
        	case "__ProcessChainControllerState": {
        		return this.all__ProcessChainControllerStateColumns;
        	}
        }
        return null;
    }
}
