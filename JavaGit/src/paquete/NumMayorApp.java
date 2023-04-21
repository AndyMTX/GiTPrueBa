package paquete;

import java.util.Scanner;

public class NumMayorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		int a, b;
		NumMayor compara=new NumMayor();
		a=2;
		b=69;
		if(compara.isA(a, b)) {
			System.out.println(a + " es mayor que "+ b);
		}else if(compara.isB(a, b)){
			System.out.println(b + " es mayor que "+ a);
		}else {
			System.out.println("Ambos números son iguales");
		}
	}

}
