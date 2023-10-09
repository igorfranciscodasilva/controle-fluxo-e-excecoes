package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int numUm = scanner.nextInt();
		System.out.println("Digite o segundo numero");
		int numDois = scanner.nextInt();
		
		try {
		    contador(numUm, numDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	static void contador(int numUm, int numDois) throws ParametrosInvalidosException {
	    if (numUm > numDois) { 
	        throw new ParametrosInvalidosException();
	    }else {
	        int numInteração = numDois - numUm;
	        for(int numContador = 0; numContador < numInteração; numContador++) 
	        System.out.println(numContador);
	    }    
	}

}

