package App;

import Info.Information;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Information information;
		
		System.out.println("Número da conta");
		int num = sc.nextInt();
		
		System.out.println("Nome da conta");
		String cont = sc.next();
		
		System.out.println("Deseja fazer um depósito inicial? (s/n) ");
		char quest = sc.next().charAt(0);
		
		if (quest == 's' || quest == 'S') {
			
			System.out.println("Valor depósito: ");
			double value = sc.nextDouble();
			
			information = new Information(num, cont, value);
			
		} else {
			information = new Information(num, cont);
		};
		
		System.out.println(information);
		
		System.out.println("");
		
		System.out.println("Valor a ser depositado");
		double deposito = sc.nextDouble();
		
		information.desposit(deposito);
		
		System.out.println(information);
		
		System.out.println("");
		
		System.out.println("Valor a ser sacado");
		double saque = sc.nextDouble();
		
		if (saque >= information.valor) {
			System.out.println("Erro!");
		}else {
			information.saq(saque);
			
			System.out.println(information);
		} ;
		

		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
