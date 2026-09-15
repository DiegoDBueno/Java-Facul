package sistema;

public class FormasOperadoresAritmeticos {

	public static void main(String[] args) {
		
		int valor = 10;
		int resultado = 0;
		
		//SOMA
		resultado = valor + 1; //Primeira Forma
		System.out.println("Resultado 1: " + resultado);
		
		resultado = valor += 1; //Segunda Forma
		System.out.println("Resultado 2: " + resultado);
		
		resultado = valor ++; //Terceira Forma
		System.out.println("Resultado 3: " + resultado);

	}

}
