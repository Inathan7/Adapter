package pedido;
public class ItemCompra {

	private int quantidade;
	
	private float valorReais;
	
	private Pedido pedido;
	
	private Produto produto;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorReais() {
		return valorReais;
	}

	public void setValorReais(float valorReais) {
		this.valorReais = valorReais;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
	
}
