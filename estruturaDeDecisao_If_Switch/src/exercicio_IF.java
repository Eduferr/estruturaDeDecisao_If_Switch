import java.util.Scanner;

public class exercicio_IF {

	static final Double NOTA_MÍNIMA_TOTAL = 150.0;
	static final Double NOTA_MÍNIMA_POR_MATERIA = 60.0;

	public static void main(String[] args) {
		/*
		 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas
		 * materias de sua prova. Serão dois parâmetros para receber um para receber a
		 * nota de português e outro para receber as de matemática. A prova, no total,
		 * vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é
		 * igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que
		 * 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em
		 * português e 100 em matemática (totalizando uma nota maior do que o total
		 * necessário que é 150) ele não conseguirá a vaga.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("Informe as notas para por matéria da prova");
		System.out.print("Digite a nota de português: ");
		Double n_Portugues = sc.nextDouble();
		System.out.print("Digite a nota de matemática: ");
		Double n_Matematica = sc.nextDouble();
		System.out.println("-------------------------------");

		Boolean n_PortuguesPassou = (n_Portugues >= NOTA_MÍNIMA_POR_MATERIA);
		Boolean n_MatematicaPassou = (n_Matematica >= NOTA_MÍNIMA_POR_MATERIA);

		Double notaObtida = (n_Portugues + n_Matematica);
		Boolean notaFinal = notaObtida >= NOTA_MÍNIMA_TOTAL;

		Boolean alcancoTotalMinimo = n_PortuguesPassou && n_MatematicaPassou && notaFinal;

		if (alcancoTotalMinimo) {
			System.out.println("Passou");
		} else {
			System.out.println("Não passou");
		}

		sc.close();
	}

}
