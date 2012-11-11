package com.just1word.database.entities;

public class Bible {
	
	private int id;
	private int bookstore_category_id;
	private int distributed_as;
	private int track_free;
	private int track_paid;
	private int translation_id; 
	private String name;
	private String name_abbreviated;
	private String publisher;
	private String title;
	private String info;
	private String title_for_free;
	private String info_for_free;
	private String copyright;
	private String copyright_abbreviated;
	private String splash_info;
	private String publisher_url;
	private String translation_url;
	private String language;
	private String download_available;
	private String cost;
	private String product_identifier;
	private String created_at;
	private String updated_at;
	private String offline_updated_at;
	private String splash_notice;
	private int offline_only; 
	private int active; 
	private int legacy;
	private int deleted;
	private int free; 
	private String thumbnail;
	private String cover_updated_at;
	
	public Bible() {
		super();
	}
	public Bible(int bookstore_category_id, int distributed_as, int track_free,
			int track_paid, int translation_id, String name,
			String name_abbreviated, String publisher, String title,
			String info, String title_for_free, String info_for_free,
			String copyright, String copyright_abbreviated, String splash_info,
			String publisher_url, String translation_url, String language,
			String download_available, String cost, String product_identifier,
			String created_at, String updated_at, String offline_updated_at,
			String splash_notice, int offline_only, int active, int legacy,
			int deleted, int free, String thumbnail, String cover_updated_at) {
		super();
		this.bookstore_category_id = bookstore_category_id;
		this.distributed_as = distributed_as;
		this.track_free = track_free;
		this.track_paid = track_paid;
		this.translation_id = translation_id;
		this.name = name;
		this.name_abbreviated = name_abbreviated;
		this.publisher = publisher;
		this.title = title;
		this.info = info;
		this.title_for_free = title_for_free;
		this.info_for_free = info_for_free;
		this.copyright = copyright;
		this.copyright_abbreviated = copyright_abbreviated;
		this.splash_info = splash_info;
		this.publisher_url = publisher_url;
		this.translation_url = translation_url;
		this.language = language;
		this.download_available = download_available;
		this.cost = cost;
		this.product_identifier = product_identifier;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.offline_updated_at = offline_updated_at;
		this.splash_notice = splash_notice;
		this.offline_only = offline_only;
		this.active = active;
		this.legacy = legacy;
		this.deleted = deleted;
		this.free = free;
		this.thumbnail = thumbnail;
		this.cover_updated_at = cover_updated_at;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookstore_category_id() {
		return bookstore_category_id;
	}
	public void setBookstore_category_id(int bookstore_category_id) {
		this.bookstore_category_id = bookstore_category_id;
	}
	public int getDistributed_as() {
		return distributed_as;
	}
	public void setDistributed_as(int distributed_as) {
		this.distributed_as = distributed_as;
	}
	public int getTrack_free() {
		return track_free;
	}
	public void setTrack_free(int track_free) {
		this.track_free = track_free;
	}
	public int getTrack_paid() {
		return track_paid;
	}
	public void setTrack_paid(int track_paid) {
		this.track_paid = track_paid;
	}
	public int getTranslation_id() {
		return translation_id;
	}
	public void setTranslation_id(int translation_id) {
		this.translation_id = translation_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_abbreviated() {
		return name_abbreviated;
	}
	public void setName_abbreviated(String name_abbreviated) {
		this.name_abbreviated = name_abbreviated;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getTitle_for_free() {
		return title_for_free;
	}
	public void setTitle_for_free(String title_for_free) {
		this.title_for_free = title_for_free;
	}
	public String getInfo_for_free() {
		return info_for_free;
	}
	public void setInfo_for_free(String info_for_free) {
		this.info_for_free = info_for_free;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getCopyright_abbreviated() {
		return copyright_abbreviated;
	}
	public void setCopyright_abbreviated(String copyright_abbreviated) {
		this.copyright_abbreviated = copyright_abbreviated;
	}
	public String getSplash_info() {
		return splash_info;
	}
	public void setSplash_info(String splash_info) {
		this.splash_info = splash_info;
	}
	public String getPublisher_url() {
		return publisher_url;
	}
	public void setPublisher_url(String publisher_url) {
		this.publisher_url = publisher_url;
	}
	public String getTranslation_url() {
		return translation_url;
	}
	public void setTranslation_url(String translation_url) {
		this.translation_url = translation_url;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDownload_available() {
		return download_available;
	}
	public void setDownload_available(String download_available) {
		this.download_available = download_available;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getProduct_identifier() {
		return product_identifier;
	}
	public void setProduct_identifier(String product_identifier) {
		this.product_identifier = product_identifier;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getOffline_updated_at() {
		return offline_updated_at;
	}
	public void setOffline_updated_at(String offline_updated_at) {
		this.offline_updated_at = offline_updated_at;
	}
	public String getSplash_notice() {
		return splash_notice;
	}
	public void setSplash_notice(String splash_notice) {
		this.splash_notice = splash_notice;
	}
	public int getOffline_only() {
		return offline_only;
	}
	public void setOffline_only(int offline_only) {
		this.offline_only = offline_only;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getLegacy() {
		return legacy;
	}
	public void setLegacy(int legacy) {
		this.legacy = legacy;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public int getFree() {
		return free;
	}
	public void setFree(int free) {
		this.free = free;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getCover_updated_at() {
		return cover_updated_at;
	}
	public void setCover_updated_at(String cover_updated_at) {
		this.cover_updated_at = cover_updated_at;
	}

	
}
