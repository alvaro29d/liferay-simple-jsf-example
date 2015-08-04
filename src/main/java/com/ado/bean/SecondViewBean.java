package com.ado.bean;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="secondViewBean")
@ViewScoped
public class SecondViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7123384554213064471L;

	@ManagedProperty(value = "#{dataManagerBean}")
	private DataManagerBean manager;

	@PostConstruct
	public void init() {
//		loadCod();
	}


	public String aceptar() {
		this.getManager().setCod(getIdUser());
		return "view";
	}

	public String volver() {
		this.getManager().setCod(getIdUser());
		return "view";
	}

	public DataManagerBean getManager() {
		return manager;
	}

	public void setManager(DataManagerBean manager) {
		this.manager = manager;
	}

	
	private String idUser;
	
	/**
	 * Devuelve la instancia actual del contexto de JSF.
	 * 
	 * @return FacesContext.
	 */
	protected FacesContext context() {
		return (FacesContext.getCurrentInstance());
	}

	/**
	 * Devuelve el external context de JSF.
	 * 
	 * @return
	 */
	protected ExternalContext getExternalContext() {
		return context().getExternalContext();
	}

	/**
	 * 
	 * 
	 * @return
	 */
	protected void addErrorMessage(String msj) {
		FacesMessage message = new FacesMessage(msj);
		message.setSeverity(FacesMessage.SEVERITY_ERROR);
		this.context().addMessage(null, message);
	}

	/**
	 * 
	 * 
	 * @return
	 */	
	public String getMessageFromBundle(final String str) {
		ResourceBundle bundle = context().getApplication().getResourceBundle(context(), "msg");
		String message = bundle.getString(str);
		return message;
	}




	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	

}
