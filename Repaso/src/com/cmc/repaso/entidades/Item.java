package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre,int productosActuales){
		this.nombre = nombre;
		if(productosActuales < 0) {
			this.productosActuales = 0;
		}else {
			this.productosActuales = productosActuales;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	public void imprimir() {
		System.out.println("********* Producto '' " + this.nombre +" '' *********");
		System.out.println("Productos Actuales: " + this.productosActuales);
		System.out.println("Productos Devueltos: " + this.productosDevueltos);
		System.out.println("Productos Vendidos: " + this.productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		if(productosVendidos < 0 || productosVendidos > this.productosActuales) return;
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;
	}
	
	public void devolver(int productosDevueltos) {
		if(productosDevueltos < 0 || productosDevueltos > this.productosVendidos) return;
		this.productosActuales += productosDevueltos;
		this.productosVendidos -= productosDevueltos;
		this.productosDevueltos += productosDevueltos;
	}
}
