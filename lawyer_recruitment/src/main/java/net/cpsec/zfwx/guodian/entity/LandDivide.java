package net.cpsec.zfwx.guodian.entity;

import java.io.Serializable;

public class LandDivide implements Serializable {

	
	private String code;
	private String name;
	private String superior;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuperior() {
		return superior;
	}
	public void setSuperior(String superior) {
		this.superior = superior;
	}
	
	
}
