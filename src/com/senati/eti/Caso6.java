package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese sueldo: ");
		int sueldo = sc.nextInt();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
			impuesto = sueldo * 0.05f;
		else
			impuesto = sueldo * 0.02f;
		
		System.out.println("\n======= Resultado =======");
		System.out.println("Sueldo......: " + sueldo);
		System.out.println("Impuesto....: "+ df.format(impuesto));
		
		
		
		
			

	}

}
