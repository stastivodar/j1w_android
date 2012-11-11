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
	public boolean insert(Bible bible) {
		ContentValues cv = setContentValue(bible);
		db.insert(BIBLE_TABLE, null, cv);
		return true;
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
	
	public String sizeDataBase(){
		Cursor mCursor = db.query(DatabaseHelper.BIBLE_TABLE, null, null, null, null, null, null);
		mCursor.moveToLast();
		return mCursor.getString(1);
	}
	private ContentValues setContentValue(Bible b) {
		ContentValues cv = new ContentValues();
		cv.put(BOOKSTORE_CATEGORY_ID, b.getBookstore_category_id());
		cv.put(DISTRIBUTED_AS, b.getDistributed_as());
		cv.put(TRACK_FREE, b.getTrack_free());
		cv.put(TRACK_PAID, b.getTrack_paid());
		cv.put(TRANSLATION_ID, b.getTranslation_id());
		cv.put(NAME, b.getName());
		cv.put(NAME_ABBREVIATED, b.getName_abbreviated());
		cv.put(PUBLISHER, b.getPublisher());
		cv.put(TITLE, b.getTitle());
		cv.put(INFO, b.getInfo());
		cv.put(TITLE_FOR_FREE, b.getTitle_for_free());
		cv.put(INFO_FOR_FREE, b.getInfo_for_free());
		cv.put(COPYRIGHT, b.getCopyright());
		cv.put(COPYRIGHT_ABBREVIATED, b.getCopyright_abbreviated());
		cv.put(SPLASH_INFO, b.getSplash_info());
		cv.put(PUBLISHER_URL, b.getPublisher_url());
		cv.put(TRANSLATION_URL, b.getTranslation_url());
		cv.put(LANGUAGE, b.getLanguage());
		cv.put(DOWNLOAD_AVAILABLE, b.getDownload_available());
		cv.put(COST, b.getCost());
		cv.put(PRODUCT_IDENTIFIER, b.getProduct_identifier());
		cv.put(CREATED_AT, b.getCreated_at());
		cv.put(UPDATED_AT, b.getUpdated_at());
		cv.put(OFFLINE_UPDATED_AT, b.getOffline_updated_at());
		cv.put(SPLASH_NOTICE, b.getSplash_notice());
		cv.put(OFFLINE_ONLY, b.getOffline_only());
		cv.put(ACTIVE, b.getActive());
		cv.put(LEGACY, b.getLegacy());
		cv.put(DELETED, b.getDeleted());
		cv.put(FREE, b.getFree());
		cv.put(THUMBNAIL, b.getThumbnail());
		cv.put(COVER_UPDATED_AT, b.getCover_updated_at());
		return cv;
	}
	private Bible cursorToEntity(Cursor cursor) {
		Bible b = new Bible();
		b.setBookstore_category_id(cursor.getInt(colum_bookstore_category_id));
		b.setDistributed_as(cursor.getInt(colum_distributed_as));
		return b;
	}
}
