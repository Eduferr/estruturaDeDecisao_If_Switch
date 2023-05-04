import java.util.Scanner;

public class estrutura_IF_Encadeado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		Double peso = sc.nextDouble();

		// Primeira Solução
//		Boolean pesoLeve = peso <= 60;
//		if (pesoLeve) {
//			System.out.println("O lutador é peso leve");
//		} else {
//			Boolean pesoMedio = (peso > 60) && (peso <= 90);
//			if (pesoMedio) {
//				System.out.println("O lutador é peso médio");
//			} else {
//				Boolean pesoPesado = peso > 90;
//				if (pesoPesado) {
//					System.out.println("O lutador é peso pesado");
//				}
//			}
//		}

		// Segunda Solução (melhor compreensão)
		Boolean pesoLeve = (peso > 50) && (peso <= 60);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;

		if (pesoLeve) {
			System.out.println("O lutador é peso leve");
		} else if (pesoMedio) {
			System.out.println("O lutador é peso médio");
		} else if (pesoPesado) {
			System.out.println("O lutador é peso pesado");
		} else {
			System.out.println("O lutador não se encaixa em categoria alguma");
		}

		sc.close();

	}

}
