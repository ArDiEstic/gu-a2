package com.senati.eti;

import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota: ");
		int nota = sc.nextInt();
		
		String estado = "";
		
		if (nota >= 0 && nota <= 7)
			estado = "Sin Palabras";
		else if (nota >= 8 && nota <= 10)
			estado = "Malo";
		else if (nota >= 11 && nota <= 14)
			estado = "Regular";
		else if (nota >= 15 && nota <= 17)
			estado = "Notable";
		else if (nota >= 18 && nota <= 20)
			estado = "Excelente";
		
		System.out.println("\n======== RESULTADO ========");
		System.out.println("Nota.....: " + nota);
		System.out.println("Estado...: " + estado);
		
			

	}

}
