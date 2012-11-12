package com.just1word.database.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper implements BibleSchema{
	
	final String LOG_TAG = "DatabaseLogs";
	static final int DB_VERSION = 1;
	
	private static String DB_PATH = "/data/data/com.just1word/databases/";
	private static String DB_NAME = "j1w.jpg";
	
	private SQLiteDatabase myDataBase;
	private final Context myContext;
	 
	public DatabaseHelper(Context context) { 
 		super(context, DB_NAME, null, 1);
		this.myContext = context;
	}	
	 
	public void createDataBase() throws IOException {
		boolean dbExist = checkDataBase();
		 
		if(dbExist){
			Log.d(LOG_TAG, "dbExist");
		} 
		else {
			
			this.getReadableDatabase();
			Log.d(LOG_TAG, "getReadableDatabase");
			try {
				copyDataBase();
				Log.d(LOG_TAG, "copy database");
			} catch (IOException e) {
				throw new Error("Error copying database");
			}
		}
	}
	private boolean checkDataBase(){
	 
		SQLiteDatabase checkDB = null;
	 
		try{
			String myPath = DB_PATH + DB_NAME;
			checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
		}catch(SQLiteException e){
			Log.e(LOG_TAG, e.getLocalizedMessage());
			//database does't exist yet. 
		}
		if(checkDB != null){
			checkDB.close();
		}
		return checkDB != null ? true : false;
	}

	private void copyDataBase() throws IOException{
	 
		InputStream myInput = myContext.getAssets().open(DB_NAME);
		Log.d("database", "open");
		String outFileName = DB_PATH + DB_NAME;	
		OutputStream myOutput = new FileOutputStream(outFileName);
		
		Log.d(LOG_TAG, "write file"); 
		byte[] buffer = new byte[1024];
		int length;
		while ((length = myInput.read(buffer)) > 0) {
			myOutput.write(buffer, 0, length);
		}
		
		//Close the streams
		myOutput.flush();
		myOutput.close();
		myInput.close();
	 
	}
	 
	public void openDataBase() throws SQLException{
		String myPath = DB_PATH + DB_NAME;
		myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
	}
	 
	@Override
	public synchronized void close() {
		if(myDataBase != null)
			myDataBase.close(); 
		super.close();
	}
	 
	@Override
	public void onCreate(SQLiteDatabase db) {
	}
	 
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
}