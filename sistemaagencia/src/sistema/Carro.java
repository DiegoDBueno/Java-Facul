package sistema;

class Carro {
	//Propriedades ou Atributos (Características)
	String marca;
	String modelo;
	String cor;
	int km;
	int capacidadeTanque;
	int kmPorLitro;
	double preco;
	
	//Método
	int calcularKm() {
		return capacidadeTanque * kmPorLitro;
	}
	double CalcularDesconto(double percentualDescontoVendedor) {
		return preco * (percentualDescontoVendedor / 100);
	}
}
