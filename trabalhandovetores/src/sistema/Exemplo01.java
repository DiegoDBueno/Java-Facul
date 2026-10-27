package sistema;

public class Exemplo01 {

	public static void main(String[] args) {


	/*	float dia1; #Não fazer desse jeito!!!
		float dia2;
		float dia3;
		float dia4;
		float dia5;
		float dia6;
		float dia7;
	*/
		
		int[] temperaturas = new int[7];
		temperaturas[0] = 32;
		temperaturas[1] = 25;
		temperaturas[2] = 35;
		temperaturas[3] = 35;
		temperaturas[4] = 12;
		temperaturas[5] = 10;
		temperaturas[6] = 18;
		
		System.out.println("Posição 1: " + temperaturas[0]);
		System.out.println("Posição 2: " + temperaturas[1]);
		System.out.println("Posição 3: " + temperaturas[2]);
		System.out.println("Posição 4: " + temperaturas[3]);
		System.out.println("Posição 5: " + temperaturas[4]);
		System.out.println("Posição 6: " + temperaturas[5]);
		System.out.println("Posição 7: " + temperaturas[6]);
	}

}
