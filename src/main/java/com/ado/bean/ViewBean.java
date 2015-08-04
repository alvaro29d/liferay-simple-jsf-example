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

import com.ado.service.EjemploService;

@ManagedBean(name = "viewBean")
@ViewScoped
public class ViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8299331666116632406L;
	
	@ManagedProperty(value = "#{dataManagerBean}")
	private DataManagerBean manager;
	
	@ManagedProperty("#{ejemploServiceImpl}")
	private EjemploService ejemploService;
	
	private String idUser;
	
	@PostConstruct
	public void init() {
		idUser="dsadsa";
		loadCod();
	}

	public String aceptar() {
		System.out.println("dsadsad");
		this.getManager().setCod(this.getEjemploService().llamada());
		return "view2";
	}
	
	public String volver() {
		return "view2";
	}
	
	
	public String getJsfVersion() {
		return FacesContext.class.getPackage().getImplementationVersion();
	}
	
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

	protected void loadCod() {
		System.out.println("1");
	}

	public DataManagerBean getManager() {
		return manager;
	}
	
	public void setManager(DataManagerBean manager) {
		this.manager = manager;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public EjemploService getEjemploService() {
		return ejemploService;
	}

	public void setEjemploService(EjemploService ejemploService) {
		this.ejemploService = ejemploService;
	}
	
	

}
