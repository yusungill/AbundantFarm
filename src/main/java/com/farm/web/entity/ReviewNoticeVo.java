package com.farm.web.entity;

public class ReviewNoticeVo extends Review{

	private String uid;
	private String name;
	private String image;
	
	public ReviewNoticeVo(String uid, String name, String image) {
		super();
		this.uid = uid;
		this.name = name;
		this.image = image;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
}
