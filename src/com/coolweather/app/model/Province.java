package com.coolweather.app.model;

/*
 * Province��ʡ�ݣ� ����ʵ����
 * 	�������ݿ����Ӧ�ֶε� get �� set ����
 * 
 * */
public class Province {
	private int id;	// ����
	private String provinceName;// ʡ��
	private String provinceCode;// ʡ������

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;

	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}