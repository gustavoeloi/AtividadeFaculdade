package util;

import entities.Hospede;
import java.util.Scanner;

public class Calculadora {
		
	Scanner sc = new Scanner(System.in);
	
	public void emitirPrecoTotal(Hospede hospede, int diasHospedados, double valorDiaria) {
		hospede.setValorTotal(valorDiaria + diasHospedados);
		for(int i = 1; i <= diasHospedados; i++) {
			System.out.printf("Digite o valor do consumo no %dº dia: $", i);
			hospede.setValorTotal(sc.nextDouble());
		}
	}
}
