package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="proveedores")
public class Proveedores implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nit;

	@NotEmpty
	private String nombreProveedor;
	
	@NotEmpty
	@Email
	private String emailProveedor;

	@OneToMany(mappedBy="producto")
	private List<Producto> listaProductos = new ArrayList<Producto>();

	public Proveedores(Long nit, String nombreProveedor, String emailProveedor, List<Producto> listaProductos) {
		super();
		this.nit = nit;
		this.nombreProveedor = nombreProveedor;
		this.emailProveedor = emailProveedor;
		this.listaProductos = listaProductos;
	}

	public Long getNit() {
		return nit;
	}

	public void setNit(Long nit) {
		this.nit = nit;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getEmailProveedor() {
		return emailProveedor;
	}

	public void setEmailProveedor(String emailProveedor) {
		this.emailProveedor = emailProveedor;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Proveedores [nit=" + nit + ", nombreProveedor=" + nombreProveedor + ", emailProveedor=" + emailProveedor
				+ ", listaProductos=" + listaProductos + "]";
	}
}
