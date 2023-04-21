package paquete;

import java.util.Scanner;

public class NumMayorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Añadid un scanner sin más 
		Scanner sc=new Scanner(System.in);
		//Para que metáis algo en el proyecto de verdad
		int a, b;
		NumMayor compara=new NumMayor();
		a=0;
		b=2
				;
		//Aqui que otro añada el outprint de introducir a y b
		if(compara.isA(a, b)) {
			System.out.println(a + " es mayor que "+ b);
		}else if(compara.isB(a, b)){
			System.out.println(b + " es mayor que "+ a);
		}else {
			System.out.println("Ambos números son iguales");
		}
	}

}
