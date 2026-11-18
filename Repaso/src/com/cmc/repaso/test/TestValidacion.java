package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion m1 = new Validacion();
		
		double monto = -1;
		if(m1.validarMonto(monto)) {
			System.out.println("Monto Válido: " + monto);
		}else {
			System.out.println("Monto No Válido: " +  monto);
		}
		
		monto = 0;
		if(m1.validarMonto(monto)) {
			System.out.println("Monto Válido: " + monto);
		}else {
			System.out.println("Monto No Válido: " +  monto);
		}
		
		monto = 1;
		if(m1.validarMonto(monto)) {
			System.out.println("Monto Válido: " + monto);
		}else {
			System.out.println("Monto No Válido: " +  monto);
		}
		
	}
}
