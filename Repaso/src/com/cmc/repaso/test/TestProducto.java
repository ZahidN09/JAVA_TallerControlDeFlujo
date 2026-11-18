package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Computadora",0);
		
		p1.setPrecio(-100);
		double descuento = 20;
		double precioFinal = p1.calcularPrecioPromo(descuento);
		
		System.out.println("El producto " + p1.getNombre() + ",");
		System.out.println("tiene el precio de " + p1.getPrecio() + "USD,");
		System.out.println("pero con un descuento del " + descuento + "%,");
		System.out.println("tiene un precio final de " + precioFinal + "USD");
	}

}
