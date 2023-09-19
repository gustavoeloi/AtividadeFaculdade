package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculadora;

import entities.Hospede;

public class Main {
	public static void main(String[] args) {
		//Iniciando Variáveis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double valorTotalDaHospedagem = 0.0;
		
		
		System.out.println("--- CHECKOUT CLIENTE ----");
		
		
		System.out.print("Digite o nome do Hóspede -> ");
		String nome = sc.nextLine();
		System.out.print("Digite o CPF do cliente -> ");
		String cpf = sc.nextLine();
		System.out.printf("A hospedagem do %s durou quantos dias? ", nome);
		int diasHospedados = sc.nextInt();
		
		Hospede hospede = new Hospede(nome, cpf, diasHospedados);
		Calculadora calculadora = new Calculadora();
		
		
		System.out.print("- Qual o valor da diária? R$");
		double valorDiaria = sc.nextDouble();
		
		calculadora.emitirPrecoTotal(hospede, diasHospedados, valorDiaria);
		
		System.out.println("--- NOTA EMITIDA ---");
		System.out.println(hospede);
		
		
		sc.close();
	}
}
