package vetortipado;

public class Usuario {

	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		Usuario.totalUsuarios++; //totalUsuarios = totalUsuarios + 1
	}
	
	private String nome; //VAI PARA O OBJETO
	private String login; //VAI PARA O OBJETO
	private String senha; //VAI PARA O OBJETO
	private static int totalUsuarios; //FICA NA CLASSE
	
	public String getNome() {
		return nome;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	
	public static int getTotalUsuarios() {
		return totalUsuarios;
	}
	
	public void mostrarUsuario() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Login: " + this.getLogin());
		System.out.println("Senha: " + this.getSenha());
		System.out.println();
	}

}
