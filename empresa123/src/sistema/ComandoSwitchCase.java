package sistema;
import java.util.*;

public class ComandoSwitchCase {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("****** MENU PRINCIPAL ******");
		System.out.println("1 - CADASTRAR CLIENTE");
		System.out.println("2 - MOSTRAR CLIENTE");
		System.out.println("3 - EXCLUIR CLIENTE");
		System.out.println("4 - ALTERAR CLIENTE");
		System.out.println("5 - SAIR DO SISTEMA");
		System.out.println("ESCOLHA A OPÇÃO DESEJADA: ");
		
		int opcao = leitor.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("****** CADASTRANDO ******");
				break;
			case 2:
				System.out.println("****** MOSTRANDO ******");
				break;
			case 3:
				System.out.println("****** EXCLUINDO ******");
				break;
			case 4:
				System.out.println("****** ALTERANDO ******");
				break;
			case 5:
				System.out.println("****** FINALIZANDO O SISTEMA ******");
				break;
			default:
				System.out.println("****** Opção Inválida ******");
				break;
		}

	}

}
