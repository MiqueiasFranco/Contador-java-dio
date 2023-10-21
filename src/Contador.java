import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = scanner.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = scanner.nextInt();
			scanner.close();
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parametro precisa ser MAIOR que o primeiro!");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int valor = 1; valor <= contagem; valor++) {
			System.out.println("imprimindo " + valor);
		}
	}
}