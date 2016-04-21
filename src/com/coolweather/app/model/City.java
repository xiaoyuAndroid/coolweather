package com.coolweather.app.model;

/*
 * City（城市） 表的实体类
 * 	生成数据库表对应字段的 get 和 set 方法
 * 
 * */
public class City {
	private int id;	// 主键
	private String cityName;	// 城市名
	private String cityCode;	// 市级代号
	private int provinceId;	// City表关联Province表的外键

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getPorvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

}
