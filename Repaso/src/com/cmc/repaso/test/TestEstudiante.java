package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("José");
		
		double nota = 7;
		e1.calificar(nota);
		System.out.println("Nota 1: " + e1.getNota());
		System.out.println("Resultado 1: " + e1.getResultado());
		
		nota = 8;
		e1.calificar(nota);
		System.out.println("Nota 2: " + e1.getNota());
		System.out.println("Resultado 2: " + e1.getResultado());
		
		nota = 9;
		e1.calificar(nota);
		System.out.println("Nota 3: " + e1.getNota());
		System.out.println("Resultado 3: " + e1.getResultado());

	}

}
