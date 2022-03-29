package calculadora.main;

//import java.util.List;
import java.util.Scanner;

import calculadora.calc.Calc;

public class Main {

	public static void main(String[] args) {
		Calc calcular = new Calc();
		Scanner leitura = new Scanner(System.in);
		/*double calcularSoma = calcular.soma(9, 3);
		System.out.println("Soma: " + calcularSoma);
		
		double calcularSubtracao = calcular.subtracao(8, 4);
		System.out.println("Subtracao: " + calcularSubtracao);
		
		double calcularMultiplicacao = calcular.multiplicacao(5, 6);
		System.out.println("Multiplicacao: " + calcularMultiplicacao);
		
		double calcularDivisao = calcular.divisao(12, 4);
		System.out.println("Divisao: " + calcularDivisao);
		System.out.println();
		
		List<String> operations = calcular.getLastOperations();
		System.out.println("Operações realizadas");
		for(String operation : operations) {
			System.out.println(operation);
		}*/
		
		int opcao;
		double num1;
		double num2;
		do {
			System.out.println("1- Soma");
			System.out.println("2- Subtracao");
			System.out.println("3- Multiplicacao");
			System.out.println("4- Divisao");
			System.out.println("5- Sair");
			opcao = leitura.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite o primeiro numero: ");
				num1 = leitura.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = leitura.nextDouble();
				double soma = calcular.soma(num1, num2);
				System.out.println("Soma: " + soma);
				break;
			case 2:
				System.out.println("Digite o primeiro numero: ");
				num1 = leitura.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = leitura.nextDouble();
				double subtracao = calcular.subtracao(num1, num2);
				System.out.println("Subtracao: " + subtracao);
				break;
			case 3:
				System.out.println("Digite o primeiro numero: ");
				num1 = leitura.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = leitura.nextDouble();
				double multiplicacao = calcular.multiplicacao(num1, num2);
				System.out.println("Multiplicacao: " + multiplicacao);
				break;
			case 4:
				System.out.println("Digite o primeiro numero: ");
				num1 = leitura.nextDouble();
				System.out.println("Digite o segundo numero: ");
				num2 = leitura.nextDouble();
				double divisao = calcular.divisao(num1, num2);
				System.out.println("Divisao: " + divisao);
				break;
			case 5:
				System.out.println("Saindo...");
			}
			
		}while(opcao!=5);
		leitura.close();
	}
	

}
