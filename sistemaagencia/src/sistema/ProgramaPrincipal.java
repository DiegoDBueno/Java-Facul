package sistema;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//---------------------------1---------------------------
		
		Carro novoCarro = new Carro(); //Obj é criado (instanciado)
		novoCarro.marca = "VW";
		novoCarro.modelo = "Fox";
		novoCarro.cor = "Azul";
		novoCarro.km = 15560;
		
		/*novoCarro = null;
		System.gc();*/
		
		System.out.println("Marca.: " + novoCarro.marca);
		System.out.println("modelo: " + novoCarro.modelo);
		System.out.println("cor...: " + novoCarro.cor);
		System.out.println("km....: " + novoCarro.km);
		
		//---------------------------2---------------------------
		
		Carro novoCarro2 = new Carro();
		novoCarro2.marca = "Chevrolet";
		novoCarro2.modelo = "Onix";
		novoCarro2.cor = "Preto";
		novoCarro2.km = 22350;
		
		System.out.println("\nMarca.: " + novoCarro2.marca);
		System.out.println("modelo: " + novoCarro2.modelo);
		System.out.println("cor...: " + novoCarro2.cor);
		System.out.println("km....: " + novoCarro2.km);
		
		//---------------------------3---------------------------
		
		Carro novoCarro3 = new Carro();
		novoCarro3.marca = "Fiat";
		novoCarro3.modelo = "Palio";
		novoCarro3.cor = "Prata";
		novoCarro3.km = 0;
		
		System.out.println("\nMarca.: " + novoCarro3.marca);
		System.out.println("modelo: " + novoCarro3.modelo);
		System.out.println("cor...: " + novoCarro3.cor);
		System.out.println("km....: " + novoCarro3.km);
	}

}
