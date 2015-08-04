package com.ado.serviceimpl;

import java.io.Serializable;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cardif.canales.codegen.cotizacion.Cotizacion;
import ar.com.cardif.canales.codegen.cotizacion.CotizarImpl;

import com.ado.service.EjemploService;

@Service(value = "ejemploServiceImpl")
public class EjemploServiceImpl implements EjemploService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 608027616273962345L;

	@Autowired
	private CotizarImpl cotizarImpl;
	
	private String idProduct;
	
	private String idPlan;
	
	private String idContracting;
	
	private XMLGregorianCalendar birthDate;
	
	@Override
	public String llamada() {
		Cotizacion cotizacion = null;
		
	//	cargarProducto();
		
		try {
			cotizacion = this.getCotizarImpl().doCotizar(idProduct, idPlan, idContracting, birthDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (cotizacion != null) {
			return "El precio cotizado es: " + cotizacion.getTprice();
		}
		return "falla al cotizar";
	}


	public CotizarImpl getCotizarImpl() {
		return cotizarImpl;
	}

	public void setCotizarImpl(CotizarImpl cotizarImpl) {
		this.cotizarImpl = cotizarImpl;
	}

}
