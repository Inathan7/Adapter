package pedido;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Endereco endereco;
	
	private List<ItemCompra> itensCompra = new ArrayList<ItemCompra>();

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<ItemCompra> getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(List<ItemCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}
	
}
