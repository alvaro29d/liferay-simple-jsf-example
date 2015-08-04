package com.ado.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "copyOfViewBean")
@ViewScoped
public class CopyOfViewBean implements Serializable {

//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 8299331666116632406L;
//	
////	@ManagedProperty(value = "#{dataManagerBean}")
////	private DataManagerBean manager;
//	
//	@PostConstruct
//	public void init() {
//		loadCod();
//	}
//
//	public String aceptar() {
//		System.out.println("dsadsad");
////		this.getManager().setCod(getIdUser());
//		return "view2";
//	}
//	
//	public String volver() {
////		this.getManager().setCod(getIdUser());
//		return "view2";
//	}
//	
////	public DataManagerBean getManager() {
////		return manager;
////	}
////
////	public void setManager(DataManagerBean manager) {
////		this.manager = manager;
////	}
//
//	private String idUser;
//	
//	/**
//	 * Devuelve la instancia actual del contexto de JSF.
//	 * 
//	 * @return FacesContext.
//	 */
//	protected FacesContext context() {
//		return (FacesContext.getCurrentInstance());
//	}
//
//	/**
//	 * Devuelve el external context de JSF.
//	 * 
//	 * @return
//	 */
//	protected ExternalContext getExternalContext() {
//		return context().getExternalContext();
//	}
//
//	/**
//	 * 
//	 * 
//	 * @return
//	 */
//	protected void addErrorMessage(String msj) {
//		FacesMessage message = new FacesMessage(msj);
//		message.setSeverity(FacesMessage.SEVERITY_ERROR);
//		this.context().addMessage(null, message);
//	}
//
//	/**
//	 * 
//	 * 
//	 * @return
//	 */	
//	public String getMessageFromBundle(final String str) {
//		ResourceBundle bundle = context().getApplication().getResourceBundle(context(), "msg");
//		String message = bundle.getString(str);
//		return message;
//	}
//
//	protected void loadCod() {
//		try {
//			HttpServletRequest req = getRequest();
//			String parameter = req.getParameter("cod");
//			if (parameter == null) {
////				parameter = this.getManager().getCod();
//			}
////			this.getManager().setCod(null);
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
//
//
//	public String getIdUser() {
//		return idUser;
//	}
//
//	public void setIdUser(String idUser) {
//		this.idUser = idUser;
//	}

}
