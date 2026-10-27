package sistema;

public class Exemplo02 {

	public static void main(String[] args) {
		
		//INSERÇÃO DE DADOS DENTRO DO VETOR
		String[] nomes = {"José","Maria","Roberto","Marcia","Francisca","Pedro"};
		
	/*	System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		System.out.println(nomes[3]);
		System.out.println(nomes[4]);
	*/
		
		//MOSTRANDO TODOS OS DADOS DO VETOR (FOR TRADICIONAL)
		for(int i=0;i<nomes.length;i++) {
			System.out.println("Posição " + i + ": " + nomes[i]);
		}
		
		System.out.println();
		
		//MOSTRANDO TODOS OS DADOS DO VETOR UTILIZANDO O foreach (para cada)
		for(String nome:nomes) {
			System.out.println("Nome: " + nome);
		}
	}

}
