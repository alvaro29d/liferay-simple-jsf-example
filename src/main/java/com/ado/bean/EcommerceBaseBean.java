package com.ado.bean;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

// Metodos base de JSF //TODO: documentar
public abstract class EcommerceBaseBean {

//	@ManagedProperty(value = "#{dataManagerBean}")
	private DataManagerBean manager;
	
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

//	protected void loadCod() {
//		try {
//			HttpServletRequest req = getRequest();
//			String parameter = req.getParameter("cod");
//			if (parameter == null) {
//				parameter = this.getManager().getCod();
//			}
//			this.getManager().setCod(null);
//			this.setIdUser(parameter);
//		} catch (ReflectiveOperationException e) {
//			this.setIdUser(null);
//			e.printStackTrace();
//		}
//	}
//
//
//	private HttpServletRequest getRequest() throws ReflectiveOperationException {
//		PortletRequest pr = (javax.portlet.PortletRequest) FacesContext
//				.getCurrentInstance().getExternalContext().getRequestMap()
//				.get("javax.portlet.request");
//		Method method = pr.getClass()
//				.getMethod("getOriginalHttpServletRequest");
//		HttpServletRequest req = (HttpServletRequest) method.invoke(pr,
//				new Object[] {});
//		return req;
//	}

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

}
