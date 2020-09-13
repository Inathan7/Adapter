package adaptador;

import pedido.Endereco;
import pedido.ItemCompra;
import transporte.Carga;

/*
 * TODO ADAPTER.03 
 * 1. Altere a declaracao da classe para usar object ou classe adapter (vai depender do tipo imposto pela classe preexistente).
 * de acordo com a situacao criada pelo TODO.ADAPTER.02.3. 
 * 2. implemente um construtor apropriado parametrizando um objeto da classe Adaptada ou estenda a Adaptada. Analise a melhor opcao.
 */
public class AdaptadorCarga extends Carga{
	
	private ItemCompra itemCompra;
	
	public AdaptadorCarga(ItemCompra itemCompra) {
		this.itemCompra = itemCompra;
	}

	/*
	 * TODO ADAPTER.04 
	 * 1. implemente os metodos esperados pelo tipo imposto pela classe preexistente
	 * 2. nas implementacoes desses metodos, reuse a classe adaptada por heranca ou por composicao: 
	 * depende do que foi escolhido em TODO.ADAPTER.03.2.
	 */

	public String getIdentificadorRastreio() { 
		return itemCompra.getProduto().getNome();
	}

	public void setIdentificadorRastreio(String identificadorRastreio) {
		itemCompra.getProduto().setNome(identificadorRastreio);
	}

	public float getValorReais() {
		return itemCompra.getValorReais();
	}

	public void setValorReais(float valorReais) {
		itemCompra.setValorReais(valorReais);
	}

	public float getPesoKg() {
		return itemCompra.getProduto().getPesoEmKg();
	}

	public void setPesoKg(float pesoKg) {
		itemCompra.getProduto().setPesoEmKg(pesoKg);
	}

	public float getAltura() {
		return itemCompra.getProduto().getDimensoesCm()[0];
	}

	public void setAltura(float altura) {
		itemCompra.getProduto().getDimensoesCm()[0] = altura;
	}

	public float getLargura() {
		return itemCompra.getProduto().getDimensoesCm()[1];
	}

	public void setLargura(float largura) {
		itemCompra.getProduto().getDimensoesCm()[1] = largura;
	}

	public float getProfundidade() {
		return itemCompra.getProduto().getDimensoesCm()[2];
	}

	public void setProfundidade(float profundidade) {
		itemCompra.getProduto().getDimensoesCm()[2] = profundidade;
	}

	public Endereco getEnderecoEntrega() {
		return itemCompra.getPedido().getEndereco();
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		itemCompra.getPedido().setEndereco(enderecoEntrega);
	}

	public String getConteudo() {
		return itemCompra.getProduto().getNome();
	}

	public void setConteudo(String conteudo) {
		itemCompra.getProduto().setNome(conteudo);
	}
	
	
}