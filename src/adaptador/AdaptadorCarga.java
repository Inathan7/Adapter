package adaptador;

import pedido.Endereco;
import pedido.Pedido;
import transporte.Carga;

/*
 * TODO ADAPTER.03 
 * 1. Altere a declaracao da classe para usar object ou classe adapter (vai depender do tipo imposto pela classe preexistente).
 * de acordo com a situacao criada pelo TODO.ADAPTER.02.3. 
 * 2. implemente um construtor apropriado parametrizando um objeto da classe Adaptada ou estenda a Adaptada. Analise a melhor opcao.
 */
public class AdaptadorCarga extends Carga{
	
	private Pedido pedido;
	private int index;
	
	public AdaptadorCarga(Pedido pedido, int index) {
		this.pedido = pedido;
		this.index = index;
	}

	/*
	 * TODO ADAPTER.04 
	 * 1. implemente os metodos esperados pelo tipo imposto pela classe preexistente
	 * 2. nas implementacoes desses metodos, reuse a classe adaptada por heranca ou por composicao: 
	 * depende do que foi escolhido em TODO.ADAPTER.03.2.
	 */

	public String getIdentificadorRastreio() {
		return pedido.getItensCompra().get(index).getProduto().getNome(); 
	}

	public void setIdentificadorRastreio(String identificadorRastreio) {
		pedido.getItensCompra().get(index).getProduto().setNome(identificadorRastreio);
	}

	public float getValorReais() {
		return pedido.getItensCompra().get(index).getValorReais();
	}

	public void setValorReais(float valorReais) {
		pedido.getItensCompra().get(index).getValorReais();
	}

	public float getPesoKg() {
		return pedido.getItensCompra().get(index).getProduto().getPesoEmKg();
	}

	public void setPesoKg(float pesoKg) {
		pedido.getItensCompra().get(index).getProduto().setPesoEmKg(pesoKg);
	}

	public float getAltura() {
		return pedido.getItensCompra().get(index).getProduto().getDimensoesCm()[0];
	}

	public void setAltura(float altura) {
		pedido.getItensCompra().get(index).getProduto().getDimensoesCm()[0] = altura;
	}

	public float getLargura() {
		return pedido.getItensCompra().get(index).getProduto().getDimensoesCm()[1];
	}

	public void setLargura(float largura) {
		pedido.getItensCompra().get(index).getProduto().getDimensoesCm()[1] = largura;
	}

	public float getProfundidade() {
		return pedido.getItensCompra().get(index).getProduto().getDimensoesCm()[2];
	}

	public void setProfundidade(float profundidade) {
		pedido.getItensCompra().get(index).getProduto().getDimensoesCm()[2] = profundidade;
	}

	public Endereco getEnderecoEntrega() {
		return pedido.getEndereco();
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		pedido.setEndereco(enderecoEntrega);
	}

	public String getConteudo() {
		return pedido.getItensCompra().get(index).getProduto().getNome();
	}

	public void setConteudo(String conteudo) {
		pedido.getItensCompra().get(index).getProduto().setNome(conteudo);
	}
	
	
}