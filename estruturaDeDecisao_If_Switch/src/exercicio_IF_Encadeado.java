import java.util.Scanner;

public class exercicio_IF_Encadeado {

	static final Double META_FATURAMENTO_ANUAL = 50000.0;

	public static void main(String[] args) {
		/*
		 * Pense em uma empresa que todo o mês de Janeiro premia seus funcionários com
		 * um bônus, caso a meta seja alcançada.
		 * 
		 * Crie um programa que receba 3 parâmetros. O primeiro será a meta de
		 * faturamento anual da empresa para o ano que passou. Depois, ((receba o
		 * parâmetro)) referente ao faturamento real da empresa no ultimo ano. Por
		 * último, receba a média salarial do funcionário(a) para o ano anterior (não
		 * precisa fazer cálculo de média salarial, já que estamos trabalhando com um
		 * algoritmo fictício - na hora de informar esse parâmetro, invente um valor
		 * qualquer para representar essa média salarial).
		 * 
		 * Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta
		 * de faturamento anual, então os funcionários ganharam um bônus que será igual
		 * a média salarial deles no último ano.
		 * 
		 * Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do
		 * valor da meta, então eles receberão também 80% de sua média salarial.
		 * 
		 * No final, mostre de quanto será o prêmio desse funcionário(a).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o faturamento real da empresa no último ano: ");
		Double FaturamentoAtual = sc.nextDouble();
		System.out.print("Qual a média salarial do funcionário no ano anterior: ");
		Double mediaSalarioAnualFuncionario = sc.nextDouble();

		Boolean AtingiuAMeta = FaturamentoAtual >= META_FATURAMENTO_ANUAL;
		Double oitentaPorCentoDaMeta = (META_FATURAMENTO_ANUAL * 80) / 100;
		Boolean AtingiuOitentaPorCento = FaturamentoAtual >= oitentaPorCentoDaMeta;

		if (AtingiuAMeta) {
			System.out.println("Você tem direito à 100% do bonus, no valor de R$" + mediaSalarioAnualFuncionario);
		} else if (AtingiuOitentaPorCento) {
			Double proporcionalAoSalario = (mediaSalarioAnualFuncionario * 80) / 100;
			System.out.println("Você tem direito à 80% do bonus, no valor de R$" + proporcionalAoSalario);
		} else {
			System.out.println("Você não tem direito a receber o bonus");
		}
		sc.close();

	}

}
