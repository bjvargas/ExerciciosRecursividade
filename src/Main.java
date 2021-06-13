public class Main {

	public static void main(String[] args) {
		DesafioModulo3 desafio = new DesafioModulo3();

		Integer[] arranjo1 = { 2, 6, 8, 12, 18, 22 };
		Integer valorProcurado = 12;
		desafio.setPosicaoDoValor(desafio.pesquisaBinaria(arranjo1, valorProcurado, 0, arranjo1.length - 1, 0));
		printarPesquisaBinaria(arranjo1, desafio, valorProcurado);

		Integer[] arranjo2 = { 8, 2, 12, 6, 22, 18 };
		desafio.setArranjoOrdenado(desafio.ordenarPorSelecao(arranjo2, 0));
		printarOrdenacaoSelecaoDireta(desafio);

		Integer[] arranjo3 = { 8, 2, 12, 6, 22, 18 };
		desafio.setArranjoOrdenado(desafio.ordenarPorInsersao(arranjo3, 1));
		printarInsersaoDireta(desafio);

	}

	private static void printarPesquisaBinaria(Integer[] arranjo1, DesafioModulo3 desafio, Integer valorProcurado) {
		System.out.println("****************************");
		System.out.println("M�todo 1 - Pesquisa Bin�ria no Arranjo: ");
		for (Integer numero : arranjo1) {
			System.out.print(numero + "*");

		}
		System.out.println();
		System.out.println("Valor procurado no arranjo: " + valorProcurado);

		if (desafio.getPosicaoDoValor() != -1) {
			System.out.println("Valor encontrado na posi��o: " + desafio.getPosicaoDoValor());
		} else {
			System.out.println("N�o foi encontrado");
		}
	}

	private static void printarOrdenacaoSelecaoDireta(DesafioModulo3 desafio) {
		System.out.println("****************************");
		System.out.println("M�todo 2 - Sele��o Direta:");

		System.out.println("Ordena��o: ");

		for (Integer numeroEmOrdem : desafio.getArranjoOrdenado()) {
			System.out.print("*" + numeroEmOrdem);

		}

	}

	private static void printarInsersaoDireta(DesafioModulo3 desafio) {
		System.out.println();
		System.out.println("****************************");
		System.out.println("M�todo 3 - Inser��o Direta:");

		System.out.println("Ordena��o: ");

		for (Integer numeroEmOrdem : desafio.getArranjoOrdenado()) {
			System.out.print("*" + numeroEmOrdem);

		}

	}

}
