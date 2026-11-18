package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item i1 = new Item("Lentes",20);
		
		i1.imprimir();
		i1.vender(15);
		i1.imprimir();
		i1.devolver(5);
		i1.imprimir();
		
		Item i2 = new Item("Cascos",100);
		
		i2.imprimir();
		i2.vender(45);
		i2.imprimir();
		i2.devolver(20);
		i2.imprimir();
	}

}
