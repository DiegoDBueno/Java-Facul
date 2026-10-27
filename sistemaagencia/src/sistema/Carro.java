package sistema;

class Carro {
	//Propriedades ou Atributos (Características)
	private String marca;
	private String modelo;
	private String cor;
	private int km;
	private int capacidadeTanque;
	private int kmPorLitro;
	private double preco;
	private double valorComDesconto;
	
	//Método inserir(SETTER) e pegar(GETTER)

	//Métodos
	int calcularKm() {
		return capacidadeTanque * kmPorLitro;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public int getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(int kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	double calcularDesconto(double percentualDescontoVendedor, double percentualDescontoGerente) {
		if(percentualDescontoVendedor<0) {
			percentualDescontoGerente =0;
		}else if (percentualDescontoVendedor>4) {
			percentualDescontoVendedor=2;
		}
			
		if(percentualDescontoGerente<0) {
			percentualDescontoGerente = 0;
		}else if(percentualDescontoGerente>2) {
			percentualDescontoGerente=2;
		}
	
	
	double desconto = this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente / 100));
	this.valorComDesconto = preco - desconto;
	
	return desconto;
	
}
}
	
	
	
