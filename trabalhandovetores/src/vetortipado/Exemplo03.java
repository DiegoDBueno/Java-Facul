package vetortipado;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Usuario[] usuarios = new Usuario[5];
		
		//Forma 1 - Colocando o objeto em cada posição
		usuarios[0] = new Usuario("Maria Silva", "msilva","ms123");
		usuarios[1] = new Usuario("José Carlos", "jcalos","jc123");
		usuarios[2] = new Usuario("Katia Ramos", "kramos","kr123");
		usuarios[3] = new Usuario("Flario torres", "ftorres","ft123");
		usuarios[4] = new Usuario("Marcelo Nogueira","mnogueira","mn123");
		
		//Mostrando o objeto
		for(int i=0;i < usuarios.length;i++) {
			usuarios[i].mostrarUsuario();
		}
		
		System.out.println("=========================");
		System.out.println("Total de Usuários: " + Usuario.getTotalUsuarios()); 
	}
}
