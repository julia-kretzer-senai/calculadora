package calculadoraJulia;

import java.util.Scanner;

public class Operacoes {

	Scanner Sc = new Scanner(System.in);
	
	public int op, amount;

	public double result = 0;
	
	public void mostrarMenu() {

		System.out.println("Menu de op��es: \n1. Soma \n2. Subtra��o \n3. Divis�o \n4. Multiplica��o "
				+ "\n5. Potencia��o \n6. Porcentagem \n7. Raiz quadrada");
		op = Sc.nextInt();

		System.out.println("Insira a quantidade de n�meros: ");
		amount = Sc.nextInt();

	}

	public void somar() {
		for (int i = 0; i < amount; i++) {
			System.out.println("Insira um n�mero: ");
			double x = Sc.nextDouble();
			result += x;
		}
	}

	public void subtrair() {
		for (int i = 0; i < amount; i++) {
			System.out.println("Insira um n�mero: ");
			double x = Sc.nextDouble();
			if (i == 0) {
				result = x;
			} else {
				result -= x;
			}

		}
	}

	public void dividir() {
		for (int i = 0; i < amount; i++) {
			System.out.println("Insira um n�mero: ");
			double x = Sc.nextDouble();
			if (i == 0) {
				result = x;
			} else {
				result /= x;
			}

		}
	}

	public void multiplicar() {
		for (int i = 0; i < amount; i++) {
			System.out.println("Insira um n�mero: ");
			double x = Sc.nextDouble();
			if (i == 0) {
				result = x;
			} else {
				result *= x;
			}

		}
	}

	public void elevar() {
		for (int i = 0; i < amount; i++) {
			System.out.println("Insira um n�mero: ");
			double x = Sc.nextDouble();

			if (i == 0) {
				result = x;
			} else {
				result = Math.pow(result, x);
			}
		}

	}

	public void calcularPorcentagem() {
		for (int i = 0; i < amount; i++) {
			System.out.println("Insira um n�mero: ");
			double x = Sc.nextDouble();

			if (i == 0) {
				result = x;
			} else {
				result = result * x / 100;
			}
		}

	}

	public void calcularRaiz() {
		System.out.println("Insira o n�mero: ");
		double x = Sc.nextDouble();

		result = Math.sqrt(x);

	}
	
	public void mostrarResultado() {
		System.out.println("Resultado: " + result);
	}
}
