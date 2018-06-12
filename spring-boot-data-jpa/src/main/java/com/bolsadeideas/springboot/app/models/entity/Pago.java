/**
 * 
 */
package com.bolsadeideas.springboot.app.models.entity;

import java.util.Calendar;

/**
 * @author Usuario
 *
 */
public class Pago {
	private Factura fact;	
	private Calendar fechapago;
	private String observacion;
	/**
	 * @param fact
	 * @param total
	 * @param client
	 * @param fecha
	 * @param observacion
	 */
	public Factura getFact() {
		return fact;
	}
	public void setFact(Factura fact) {
		this.fact = fact;
	}
	public Calendar getFechapago() {
		return fechapago;
	}
	public void setFechapago(Calendar fechapago) {
		this.fechapago = fechapago;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	/**
	 * @param fact
	 * @param fechapago
	 * @param observacion
	 */
	public Pago(Factura fact, Calendar fechapago, String observacion) {
		super();
		this.fact = fact;
		this.fechapago = fechapago;
		this.observacion = observacion;
	}
	
}