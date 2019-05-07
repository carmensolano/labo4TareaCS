package com.uca.capas.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(message="La longitud debe ser entre 4 y 30 caracteres",min=4,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="La longitud debe ser entre 4 y 30 caracteres",min=4,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")	
	private String marca;
	
	@Size(message="La longitud debe ser entre 4 y 30 caracteres",min=4,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@Size(message="La longitud debe ser entre 4 y 30 caracteres",min=4,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String categoria;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Positive(message= "no puede ingresar precios negativos")
	private String precio;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Future(message= "la fecha tiene que ser en futuro")
	private String fvencimiento;
	
	
	
	public Producto() {
		
	}
	
	public Producto(String nombre, String marca, String descripcion) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFvencimiento() {
		return fvencimiento;
	}

	public void setFvencimiento(String fvencimiento) {
		this.fvencimiento = fvencimiento;
	}

}
