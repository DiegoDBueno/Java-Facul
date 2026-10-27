package vetortipado;

import java.util.ArrayList;

public class Exemplo04 {

	public static void main(String[] args) {

		ArrayList<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Maria Silva","msilva","ms123"));
		usuarios.add(new Usuario("José Carlos", "jcalos","jc123"));
		
		for (Usuario usuario:usuarios) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println();
		}
		
		System.out.println("------- ADICIONADO MAIS USUÁRIOS -------");
		usuarios.add(new Usuario("Katia Ramos", "kramos","kr123"));
		usuarios.add(new Usuario("Flario torres", "ftorres","ft123"));
		
		for (Usuario usuario:usuarios) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println();
		}
		
		System.out.println("-------- REMOVENDO O USUÁRIO DA POSIÇÃO --------");
		usuarios.remove(2);
		
		for(Usuario usuario:usuarios) {
			usuario.mostrarUsuario();
		
		}
	}

}
