package com.senati.eti;

import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		System.out.print("Imgrese empleado: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas Trabajas: ");
		float hotra = sc.nextFloat();
		
		System.out.print("Tarifa por Hora: ");
		float taho = sc.nextFloat();
		
		System.out.print("Minutos de tardanza: ");
		float mintar = sc.nextFloat();
		
		float importe = hotra * taho;
		float monto = 0;
		float dscto = 0;
		
		if (hotra > 60) 
			monto = 0.13f;
		else 
			monto = 0.04f;
		
		if (mintar > 15)
			dscto = 0.03f;
		else 
			dscto = 0;
		
		float alcan = (hotra * 10) / 7;
		float bono = importe * monto;
		float desc = importe * dscto;
		
		System.out.println("\n========== Resultado ==========");
		System.out.println("Trabajador.........: " + nombre);
		System.out.println("Horas Trabajadas...: " + hotra);
		System.out.println("Tarifa por Horas...: " + taho);
		System.out.println("Importe............: " + importe);
		System.out.println("Bono...............: " + bono);
		System.out.println("Descuento..........: " + desc);
		System.out.println("Meta Alcanzada.....: " + alcan + " %");

	}

}
