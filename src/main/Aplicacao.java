package main;

import java.util.ArrayList;

import adaptador.AdaptadorCarga;
import pedido.Endereco;
import pedido.ItemCompra;
import pedido.Pedido;
import pedido.Produto;
import transporte.Carga;
import transporte.RotaTransporte;
import transporte.UnidadeMedida;

public class Aplicacao {

	public static void main(String[] args) {
		Aplicacao.usandoClasseJaEsperadaPelaClassePreexistente(); 
		Aplicacao.usandoClasseIncompativelComAdaptadorNaClassePreexistente();   //Aqui tu roda um por vez
	}

	public static void usandoClasseJaEsperadaPelaClassePreexistente() {
		/* 
		 * TODO ADAPTER.01 
		 * 
		 * 1. crie um objeto da classe RotaTransporte.
		 * 2. crie um objeto da classe Carga e adicione-o no objeto RotaTransporte.
		 * 3. calcule o ICMS, via metodo do objeto RotaTransporte.
		 * 4. mostre todas as cargas, via metodo do objeto RotaTransporte.
		 */
		
		RotaTransporte rotaTransporte = new RotaTransporte();
		Carga carga = new Carga();
		Endereco enderecoEntrega = new Endereco();
		
		enderecoEntrega.setBairro("Centro");
		enderecoEntrega.setCEP("58500-000");
		enderecoEntrega.setCidade("Monteiro");
		enderecoEntrega.setLogradouro("Rua Andrelino Rafael");
		
		carga.setAltura(10f);
		carga.setConteudo("Celular");
		carga.setEnderecoEntrega(enderecoEntrega);
		carga.setIdentificadorRastreio("Celular");
		carga.setLargura(5f);
		carga.setPesoKg(200f);
		carga.setProfundidade(1f);
		carga.setUnidadeMedida(UnidadeMedida.CENTIMETROS);
		carga.setValorReais(1.700f);
		
		rotaTransporte.addCarga(carga);
		
		System.out.println(rotaTransporte.calcularICMSCarga(carga.getIdentificadorRastreio()));
		System.out.println(rotaTransporte.mostrarCargas());
		
	}

	public static void usandoClasseIncompativelComAdaptadorNaClassePreexistente() {
		/* TODO ADAPTER.02
		 * 		 
		 * 1. crie um objeto da classe RotaTransporte.
		 * 2. crie um objeto da classe Pedido com 2 objetos da classe ItemCompra, cada um para um Produto diferente.
		 * 3. adicione o objeto pedido no objeto RotaTransporte como se fosse um objeto Carga. 
		 * nao altere nenhuma linha de codigo das classes ja existentes.
		 * 4. calcule o ICMS, via metodo do objeto RotaTransporte.  
		 * 5. mostre todas as cargas, via metodo do objeto RotaTransporte.
		 */
		
		RotaTransporte rotaTransporte = new RotaTransporte();
		
		Pedido pedido = new Pedido();
		
		ItemCompra itemCompra1 = new ItemCompra();
		ItemCompra itemCompra2 = new ItemCompra();
		
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		
		Endereco enderecoEntrega = new Endereco();
		
		enderecoEntrega.setBairro("Centro");
		enderecoEntrega.setCEP("58500-000");
		enderecoEntrega.setCidade("Monteiro");
		enderecoEntrega.setLogradouro("Rua Andrelino Rafael");;
				
		itemCompra1.setPedido(pedido);
		itemCompra1.setProduto(produto1);
		itemCompra1.setQuantidade(1);
		itemCompra1.setValorReais(1.700f);
		
		itemCompra2.setPedido(pedido);
		itemCompra2.setProduto(produto2);
		itemCompra2.setQuantidade(1);
		itemCompra2.setValorReais(1.500f);
		
		ArrayList<ItemCompra> itensCompra = new ArrayList<ItemCompra>();
		itensCompra.add(itemCompra1);
		itensCompra.add(itemCompra2);
		
		pedido.setItensCompra(itensCompra);
		
		Carga cargaAdaptada = new AdaptadorCarga(pedido, 0);
		
		cargaAdaptada.setAltura(10f);
		cargaAdaptada.setLargura(5f);
		cargaAdaptada.setProfundidade(1f);
		cargaAdaptada.setConteudo("Celular");
		cargaAdaptada.setEnderecoEntrega(enderecoEntrega);
		cargaAdaptada.setIdentificadorRastreio("Celular");
		cargaAdaptada.setPesoKg(200f);
		cargaAdaptada.setUnidadeMedida(UnidadeMedida.CENTIMETROS);
		cargaAdaptada.setValorReais(1.700f);
		
//		cargaAdaptada.setAltura(17f);
//		cargaAdaptada.setLargura(7f);
//		cargaAdaptada.setProfundidade(1f);
//		cargaAdaptada.setConteudo("Tablet");
//		cargaAdaptada.setEnderecoEntrega(enderecoEntrega);
//		cargaAdaptada.setIdentificadorRastreio("Tablet");
//		cargaAdaptada.setPesoKg(500f);
//		cargaAdaptada.setUnidadeMedida(UnidadeMedida.CENTIMETROS);
//		cargaAdaptada.setValorReais(1.500f);
		
		rotaTransporte.addCarga(cargaAdaptada);
		
		System.out.println(rotaTransporte.calcularICMSCarga(cargaAdaptada.getIdentificadorRastreio())); 

		System.out.println(rotaTransporte.mostrarCargas());
		
	}

}
