package com.ado.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dataManagerBean")
@SessionScoped
public class DataManagerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7037940415813476206L;
	
	private String cod;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}


}
