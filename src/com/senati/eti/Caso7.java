package com.senati.eti;

import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Sueldo: ");
		float sueldo = sc.nextInt();
		
		float impuesto = 0;
		
		if (sueldo <= 15000)
			impuesto = 0.03f * sueldo;
		else if (sueldo > 1500 && sueldo <= 300)
			impuesto = 0.08f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		System.out.println("\n=======Resultado=======");
		System.out.println("Impuesto Aplicado: " + impuesto);
	}

}
