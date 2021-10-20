package es.studium.suma;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1,numero2,suma;
		System.out.println("Dame un numero entero ");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese otro numero entero ");
		numero2 = teclado.nextInt();
		suma = numero1 + numero2;
		System.out.println("La suma de ambos numeros es " + suma);
		teclado.close();
	}

}
