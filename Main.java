package calculadoraJulia;

public class Main {

	public static void main(String[] args) {

		Operacoes operacao = new Operacoes();

		operacao.mostrarMenu();

		switch (operacao.op) {

		case 1:
			operacao.somar();
			break;
		case 2:
			operacao.subtrair();
			break;
		case 3:
			operacao.dividir();
			break;
		case 4:
			operacao.multiplicar();
			break;
		case 5:
			operacao.elevar();
			break;
		case 6:
			operacao.calcularPorcentagem();
			break;
		case 7:
			operacao.calcularRaiz();
			break;
		}

		operacao.mostrarResultado();

	}
}
