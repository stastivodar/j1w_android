package com.just1word.database.dao;

public interface BibleSchema {
	
	static final String BIBLE_TABLE = "bibles";
	static final String ID = "_id";
	static final String BOOKSTORE_CATEGORY_ID = "bookstore_category_id";
	static final String DISTRIBUTED_AS = "distributed_as";
	static final String TRACK_FREE = "track_free";
	static final String TRACK_PAID = "track_paid";
	static final String TRANSLATION_ID = "translation_id";
	static final String NAME = "name";
	static final String NAME_ABBREVIATED = "name_abbreviated";
	static final String PUBLISHER = "publisher";
	static final String TITLE = "title";
	static final String INFO = "info";
	static final String TITLE_FOR_FREE = "title_for_free";
	static final String INFO_FOR_FREE = "info_for_free";
	static final String COPYRIGHT = "copyright";
	static final String COPYRIGHT_ABBREVIATED = "copyright_abbreviated";
	static final String SPLASH_INFO = "splash_info";
	static final String PUBLISHER_URL = "publisher_url";
	static final String TRANSLATION_URL = "translation_url";
	static final String LANGUAGE = "language";
	static final String DOWNLOAD_AVAILABLE = "download_available";
	static final String COST = "cost";
	static final String PRODUCT_IDENTIFIER = "product_identifier";
	static final String CREATED_AT = "created_at"; //datatime
	static final String UPDATED_AT = "updated_at"; //datatime
	static final String OFFLINE_UPDATED_AT = "offline_updated_at"; //datatime
	static final String SPLASH_NOTICE = "splash_notice";
	static final String OFFLINE_ONLY = "offline_only"; //boolean 0(false) and 1(true) 
	static final String ACTIVE = "active";  //boolean
	static final String LEGACY = "legacy"; //boolean
	static final String DELETED = "deleted"; //boolean
	static final String FREE = "free"; //boolean
	static final String THUMBNAIL = "thumbnail"; 
	static final String COVER_UPDATED_AT = "cover_updated_at"; //datatime
	
	static final String BIBLES_TABLE_CREATE = " CREATE TABLE " + 
				BIBLE_TABLE + " ( " +
				ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
				BOOKSTORE_CATEGORY_ID + " INTEGER, " +
				DISTRIBUTED_AS + " INTEGER, " +
				TRACK_FREE + " INTEGER, " +
				TRACK_PAID + " INTEGER, " +
				TRANSLATION_ID + " INTEGER, " +
				NAME + " TEXT, " +
				NAME_ABBREVIATED + " TEXT, " +
				PUBLISHER + " TEXT, " +
				TITLE + " TEXT, " +
				INFO + " TEXT, " +
				TITLE_FOR_FREE + " TEXT, " +
				INFO_FOR_FREE + " TEXT, " +
				COPYRIGHT + " TEXT, " +
				COPYRIGHT_ABBREVIATED + " TEXT, " +
				SPLASH_INFO + " TEXT, " +
				PUBLISHER_URL + " TEXT, " +
				TRANSLATION_URL + " TEXT, " +
				LANGUAGE + " TEXT, " +
				DOWNLOAD_AVAILABLE + " TEXT, " +
				COST + " TEXT, " +
				PRODUCT_IDENTIFIER + " TEXT, " +
				CREATED_AT + " TEXT, " + 
				UPDATED_AT + " TEXT, " + 
				OFFLINE_UPDATED_AT + " TEXT, " + 
				SPLASH_NOTICE + " TEXT, " +
				OFFLINE_ONLY + " INTEGER, " + 
				ACTIVE + " INTEGER, " + 
				LEGACY + " INTEGER, " + 
				DELETED + " INTEGER, " +
				FREE + " INTEGER, " +
				THUMBNAIL + " TEXT, " + 
				COVER_UPDATED_AT + " TEXT);";

}
