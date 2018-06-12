package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "entidad")
public class Entidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private int telefono;
	
	@ManyToMany(mappedBy="listaEmpleados")
	private List<Empleado> listaempleados;
	
	@ManyToMany(mappedBy="listaClientes")
	private List<Cliente> listaclientes;
	
	@ManyToMany(mappedBy="listaProductos")
	private List<Producto> listaproductos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Empleado> getListaempleados() {
		return listaempleados;
	}

	public void setListaempleados(List<Empleado> listaempleados) {
		this.listaempleados = listaempleados;
	}

	public List<Cliente> getListaclientes() {
		return listaclientes;
	}

	public void setListaclientes(List<Cliente> listaclientes) {
		this.listaclientes = listaclientes;
	}

	public List<Producto> getListaproductos() {
		return listaproductos;
	}

	public void setListaproductos(List<Producto> listaproductos) {
		this.listaproductos = listaproductos;
	}

	@Override
	public String toString() {
		return "Entidad [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono
				+ ", listaclientes=" + listaclientes + ", listaproductos=" + listaproductos + "]";
	}

	
}

