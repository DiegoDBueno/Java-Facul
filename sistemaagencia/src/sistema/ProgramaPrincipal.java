package sistema;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//---------------------------1---------------------------
		
		Carro novoCarro = new Carro(); //Obj é criado (instanciado)
		novoCarro.marca = "VW";
		novoCarro.modelo = "Fox";
		novoCarro.cor = "Azul";
		novoCarro.capacidadeTanque = 50;
		novoCarro.kmPorLitro = 12;
		novoCarro.km = 15560;
		novoCarro.preco = 50000;
		
		/*novoCarro = null;
		System.gc();*/
		
		System.out.println("Marca...............: " + novoCarro.marca);
		System.out.println("Modelo..............: " + novoCarro.modelo);
		System.out.println("Cor.................: " + novoCarro.cor);
		System.out.println("Capacidade do tanque: " + novoCarro.capacidadeTanque);
		System.out.println("Km por litro........: " + novoCarro.kmPorLitro);
		System.out.println("Km..................: " + novoCarro.km);
		System.out.println("Rodagem.............: " + novoCarro.calcularKm());
		System.out.println("Preço...............: " + novoCarro.preco);
		System.out.println("Desconto............: " + novoCarro.CalcularDesconto(10));
		
		System.out.println();
		//---------------------------2---------------------------
		
		Carro novoCarro2 = new Carro();
		novoCarro2.marca = "Chevrolet";
		novoCarro2.modelo = "Onix";
		novoCarro2.cor = "Preto";
		novoCarro2.capacidadeTanque = 45;
		novoCarro2.kmPorLitro = 10;
		novoCarro2.km = 22350;
		novoCarro2.preco = 75000;
		
		System.out.println("Marca...............: " + novoCarro2.marca);
		System.out.println("Modelo..............: " + novoCarro2.modelo);
		System.out.println("Cor.................: " + novoCarro2.cor);
		System.out.println("Capacidade do tanque: " + novoCarro2.capacidadeTanque);
		System.out.println("Km por litro........: " + novoCarro2.kmPorLitro);
		System.out.println("Km..................: " + novoCarro2.km);
		System.out.println("Rodagem.............: " + novoCarro2.calcularKm());
		System.out.println("Preço...............: " + novoCarro2.preco);
		System.out.println("Desconto............: " + novoCarro2.CalcularDesconto(10));
		
		System.out.println();
		
		//---------------------------3---------------------------
		
		Carro novoCarro3 = new Carro();
		novoCarro3.marca = "Fiat";
		novoCarro3.modelo = "Palio";
		novoCarro3.cor = "Prata";
		novoCarro3.capacidadeTanque = 47;
		novoCarro3.kmPorLitro = 14;
		novoCarro3.km = 0;
		novoCarro3.preco = 60000;
		
		System.out.println("Marca...............: " + novoCarro3.marca);
		System.out.println("Modelo..............: " + novoCarro3.modelo);
		System.out.println("Cor.................: " + novoCarro3.cor);
		System.out.println("Capacidade do tanque: " + novoCarro3.capacidadeTanque);
		System.out.println("Km por litro........: " + novoCarro3.kmPorLitro);
		System.out.println("km..................: " + novoCarro3.km);
		System.out.println("Rodagem.............: " + novoCarro3.calcularKm());
		System.out.println("Preço...............: " + novoCarro3.preco);
		System.out.println("Desconto............: " + novoCarro3.CalcularDesconto(10));
	}

}
