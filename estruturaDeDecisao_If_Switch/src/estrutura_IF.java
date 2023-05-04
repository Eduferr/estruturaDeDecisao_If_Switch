//Um pedido de empréstimo, com requisitos mínimos.
public class estrutura_IF {
	
	// Variável estática que quase não muda
	static final Integer TEMPO_MINIMO_DE_CONTA = 2;

	public static void main(String[] args) {

		// Recebendo dados do solicitantes.
		Double emprestimo = 4000.0;
		Double movimentoMedioConta = 2000.0;
		Integer estaComNomeLimpo = 1;

		// Condições para empréstimo
		Boolean temTempoDeConta = (TEMPO_MINIMO_DE_CONTA >= 2);
		Boolean temNomeLimpo = (estaComNomeLimpo == 1);
		Boolean movimentaMetadeDoValor = (movimentoMedioConta * 2) >= emprestimo;

		// Analisando as condições
		Boolean liberarEmprestimo = movimentaMetadeDoValor && temTempoDeConta && temNomeLimpo;
		/*
		 * A variável do "Boolean liberarEmprestimo" não precisa existir. Sua condição
		 * pode ser feita direto na estrutura IF, como visto abaixo:
		 * if(movimentaMetadeDoValor && temTempoDeConta && estaComNomeLimpo;) Porém para
		 * uma melhor organização e entendimento do código, é uma boa prática criar a
		 * variável, assim teremos uma melhor documentação do algorítmo.
		 */

		// Entregando o valor Booleano para o IF
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode liberar o empréstimo");
		} else {
			System.out.println("Não tem direito");
		}
	}

}
