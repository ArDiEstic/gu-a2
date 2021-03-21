package com.senati.eti;

import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		int n2 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2)
			estado = "Los números son iguales";
		else if(n1 > n2)
			estado = "El primer número " + n1 + " es mayor";
		else
			estado = "El segundo número " + n2 + " es mayor";
		
		System.out.println("\n=======Resultado=======");
		System.out.println("Estado: " + estado);
	}

}
