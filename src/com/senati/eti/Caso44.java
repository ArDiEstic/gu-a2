package com.senati.eti;

import java.util.Scanner;
public class Caso44 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese tercer n�mero: ");
		int n3 = sc.nextInt();
		
		System.out.print("Ingrese cuarto n�mero: ");
		int n4 = sc.nextInt();
		
		String estado = "";
		if (n1 == n2 && n1 == n3 && n3 == n4)
			estado = "Los n�meros son iguales";
		else if (n2 > n1 && n3 > n1 && n4 > n1)
			estado = "El primer n�mero " + n1 + " es el menor";
		else if (n1 > n2 && n3 > n2 && n4 > n2)
			estado = "El segundo n�mero " + n2 + " es el menor";
		else if (n2 > n3 && n1 > n3 && n4 > n3)
			estado = "El tercer n�mero " + n3 + " es el menor";
		else if (n2 > n4 && n3 > n4 && n1 > n4)
			estado = "El cuarto n�mero " + n4 + " es el menor";
		else if (n1 == n2 && n3 > n1 && n4 > n2)
			estado = "El primer y segundo n�mero " + n1 + " son los menores";
		else if (n1 == n3 && n2 > n1 && n4 > n3)
			estado = "El primer y tercer n�mero " + n1 + " son los menores";
		else if (n1 == n4 && n3 > n1 && n2 > n4)
			estado = "El primer y cuarto n�mero " + n1 + " son los menores";
		else if (n2 == n3 && n1 > n2 && n4 > n3)
			estado = "El segundo y tercer n�mero " + n2 + " son los menores";
		else if (n2 == n4 && n3 > n2 && n1 > n4)
			estado = "El segundo y cuarto n�mero " + n2 + " son los menores";
		else if (n3 == n4 && n1 > n3 && n2 > n4)
			estado = "El tercer y cuarto n�mero " + n3 + " son los menores";
		else if (n1 == n2 && n1 == n3 && n4 > n3)
			estado = "El primer, segundo y tercer n�mero " + n1 + " son los menores";
		else if (n1 == n2 && n1 == n4 && n3 > n4)
			estado = "El primer, segundo y cuarto n�mero " + n1 + " son los menores";
		else if (n1 == n4 && n1 == n3 && n2 > n3)
			estado = "El primer, tercer y cuarto n�mero " + n1 + " son los menores";
		else if (n2 == n3 && n2 == n4 && n1 > n4)
			estado = "El segundo, tercer y cuarto n�mero " + n2 + " son los menores";
		
		System.out.println("\n======= Resultado =======");
		System.out.println("Estado: " + estado);

	}

}
