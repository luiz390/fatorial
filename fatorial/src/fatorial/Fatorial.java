package fatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// MOSTRAR O FATORIAL:
		Scanner sc = new Scanner(System.in);
		int n;
		int fat = 1;
		
		System.out.println("DIGITE UM NUMERO ");
		n=sc.nextInt();
		
		if(n > 0) {
			for(int c = 1;c <= n;c++) {
				fat = fat*c;
			}
			System.out.print("O FATORIAL DE "+ n +" É "+ fat);
		}
		else {
			System.out.println("ESSE NUMERO NÃO É POSITIVO");
		}
	}

}
