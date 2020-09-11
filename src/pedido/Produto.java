package pedido;

public class Produto {

	private String nome;
	
	private float pesoEmKg;
	
	//posicao [0] altura, [1] largura, [2] profundidade
	private float[] dimensoesCm = new float[3];
	
	private float valorReais;
 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPesoEmKg() {
		return pesoEmKg;
	}

	public void setPesoEmKg(float pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}

	public float[] getDimensoesCm() {
		return dimensoesCm;
	}

	public void setDimensoesCm(float[] dimensoesCm) {
		this.dimensoesCm = dimensoesCm;
	}

	public float getValorReais() {
		return valorReais;
	}

	public void setValorReais(float valorReais) {
		this.valorReais = valorReais;
	}
	
	
}
