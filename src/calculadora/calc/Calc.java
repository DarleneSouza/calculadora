package calculadora.calc;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	
	private List<String> lastOperations = new ArrayList<String>();
	
	public  double soma(double num1, double num2) {
		double soma = num1 + num2;
		saveOperation('+', num1, num2, soma);
		return soma;
	}
	public double subtracao(double num1, double num2) {
		double subtracao = num1 - num2;
		saveOperation('-', num1, num2, subtracao);
		return subtracao;
	}
	public double multiplicacao(double num1, double num2) {
		double multiplicacao = num1 * num2;
		saveOperation('*', num1, num2, multiplicacao);
		return multiplicacao;
	}
	public double divisao(double num1, double num2) {
		double divisao = num1 / num2;
		saveOperation('/', num1, num2, divisao);
		return divisao;
	}
	
	public List<String> getLastOperations(){
		List<String> copyLastOperations = new ArrayList<String>();
		
		for(String operation : lastOperations) {
			copyLastOperations.add(operation);
		}
		return copyLastOperations;
	}
	private void saveOperation(char operation, Number num1, Number num2, Number result) {
		String formattedResult = String.format("%.2f %s %.2f = %.2f", 
				num1.doubleValue(), operation, num2.doubleValue(),result);
		
		lastOperations.add(formattedResult);
	}
	
	

}
