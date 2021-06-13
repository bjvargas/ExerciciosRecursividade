public class DesafioModulo3 {
	private Integer posicaoDoValor;
	private Integer[] arranjoOrdenado;

	public Integer pesquisaBinaria(Integer[] arranjo, Integer valorProcurado, Integer inferior, Integer superior,
			Integer media) {

		if (inferior <= superior) {
			media = (inferior + superior) / 2;
			if (arranjo[media] == valorProcurado) {
				return media;
			} else if (valorProcurado < arranjo[media]) {
				return this.pesquisaBinaria(arranjo, valorProcurado, inferior, (superior = media - 1), media);
			} else if (valorProcurado > arranjo[media]) {
				return this.pesquisaBinaria(arranjo, valorProcurado, (inferior = media + 1), superior, media);
			}
		}

		return -1;
	}

	public Integer[] ordenarPorSelecao(Integer[] arranjo, Integer indice) {
		if (indice == arranjo.length - 1) {
			return arranjo;
		}

		Integer minimo = indice;

		for (Integer j = indice + 1; j < arranjo.length; j++)
			if (arranjo[j] < arranjo[minimo])
				minimo = j;
		Integer auxiliar = arranjo[indice];
		arranjo[indice] = arranjo[minimo];
		arranjo[minimo] = auxiliar;

		return this.ordenarPorSelecao(arranjo, ++indice);
	}

	public Integer[] ordenarPorInsersao(Integer[] arranjo, Integer indice) {
		if (indice == arranjo.length)
			return arranjo;

		Integer indiceParaVarrer = indice;
		Integer valorQueSeraTrocado = arranjo[indice];

		while (indiceParaVarrer > 0 && arranjo[indiceParaVarrer - 1] > valorQueSeraTrocado) {
			arranjo[indiceParaVarrer] = arranjo[indiceParaVarrer - 1];
			indiceParaVarrer--;
		}
		arranjo[indiceParaVarrer] = valorQueSeraTrocado;

		return this.ordenarPorInsersao(arranjo, ++indice);
	}

	public Integer getPosicaoDoValor() {
		return posicaoDoValor;
	}

	public void setPosicaoDoValor(Integer posicaoDoValor) {
		this.posicaoDoValor = posicaoDoValor;
	}

	public Integer[] getArranjoOrdenado() {
		return arranjoOrdenado;
	}

	public void setArranjoOrdenado(Integer[] arranjoOrdenado) {
		this.arranjoOrdenado = arranjoOrdenado;
	}
}