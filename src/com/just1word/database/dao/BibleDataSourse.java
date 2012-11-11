package com.just1word.database.dao;

import java.util.ArrayList;
import java.util.List;

import com.just1word.database.entities.Bible;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class BibleDataSourse implements BibleSchema{
	private static SQLiteDatabase db;
	private static DatabaseHelper dbHelper;
	
	private static final int colum_id = 0;
	private static final int colum_bookstore_category_id = 1;
	private static final int colum_distributed_as = 2;
	private static final int colum_track_free = 3;
	private static final int colum_track_paid = 4;
	private static final int colum_translation_id = 5;
	private static final int colum_name = 6;
	private static final int colum_name_abbreviated = 7;
	private static final int colum_publisher = 8;
	private static final int colum_title = 9;
	private static final int colum_info = 10;
	private static final int colum_title_for_free = 11;
	private static final int colum_info_for_free = 12;
	private static final int colum_copyright = 13;
	private static final int colum_copyright_abbreviated = 14;
	private static final int colum_splash_info = 15;
	private static final int colum_publisher_url = 16;
	private static final int colum_translation_url = 17;
	private static final int colum_language = 18;
	private static final int colum_download_available = 19;
	private static final int colum_cost = 20;
	private static final int colum_product_identifier = 21;
	private static final int colum_created_at = 22; //datatime
	private static final int colum_updated_at = 23; //datatime
	private static final int colum_offline_updated_at = 24; //datatime
	private static final int colum_splash_notice = 25;
	private static final int colum_offline_only = 26; //bolean 0(false) and 1(true) 
	private static final int colum_active = 27; //boolean
	private static final int colum_legacy = 28;//boolean
	private static final int colum_deleted = 29; //boolean
	private static final int colum_free = 30; //boolean
	private static final int colum_thumbnail = 31;
	private static final int colum_cover_updated_at = 32;//datatime
	
	public BibleDataSourse(Context context) {
		dbHelper = new DatabaseHelper(context);
	}
	
	public void open() throws SQLException {
		db = dbHelper.getWritableDatabase();
	}
	
	public void close() {
		dbHelper.close();
	}
	
	public List<Bible> getAllBibles(){
		Cursor cursor = db.query(BIBLE_TABLE, null, null, null, null, null, null);
		List<Bible> biblesList = new ArrayList<Bible>();
		if(cursor != null){
			cursor.moveToFirst();
			while(!cursor.isAfterLast()){
				cursor.moveToNext();
			}
		}
		
		return null;
	}
	public long insert(){
		ContentValues cv = new ContentValues();
		cv.put("bookstore_category_id", "sdf2");
		return db.insert(DatabaseHelper.BIBLE_TABLE, null, cv);
	}
	public String sizeDataBase(){
		Cursor mCursor = db.query(DatabaseHelper.BIBLE_TABLE, null, null, null, null, null, null);
		mCursor.moveToFirst();
		return mCursor.getString(1);
	}
	
}
