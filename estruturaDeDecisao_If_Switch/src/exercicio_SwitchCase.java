import java.util.Scanner;

public class exercicio_SwitchCase {

	public static void main(String[] args) {
		/*
		 * Crie um programa que vai receber um número que será referente ao dia da
		 * semana (de 1 até 7). Dependendo do número informado você deve imprimir o nome
		 * desse dia. Se o número 1 for informado, então deverá ser impresso "domingo",
		 * se 2, então "segunda-feira" e por ai vai.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero referente ao dia da semana: ");
		Integer diaDaSemana = sc.nextInt();

		String dia;
		switch (diaDaSemana) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "INVÁLIDO";
			break;
		}
		System.out.println("O dia escolhido foi: " + dia);

		sc.close();

	}

}
