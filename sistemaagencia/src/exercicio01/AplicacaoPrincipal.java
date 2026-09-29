package exercicio01;

public class AplicacaoPrincipal {

	public static void main(String[] args) {
		
		//--------Clientes--------
		System.out.println("Clientes");
		System.out.println();
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Laura";
		cliente1.email = "laura@gmail.com";
		cliente1.idade = 25;
		cliente1.sexo = 'F';
		
		System.out.println("Cliente: " + cliente1.nome);
		System.out.println("Email..: " + cliente1.email);
		System.out.println("Idade..: " + cliente1.idade);
		System.out.println("Sexo...: " + cliente1.sexo);
		
		System.out.println();
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Diego";
		cliente2.email = "diego@gmail.com";
		cliente2.idade = 18;
		cliente2.sexo = 'M';
		
		System.out.println("Cliente: " + cliente2.nome);
		System.out.println("Email..: " + cliente2.email);
		System.out.println("Idade..: " + cliente2.idade);
		System.out.println("Sexo...: " + cliente2.sexo);
		
		System.out.println("------------------------------------------");
		
		//--------Produtos--------
		System.out.println("Produtos");
		System.out.println();
		
		Produto produto1 = new Produto();
		produto1.produto = "Mouse";
		produto1.quantidade = 5;
		produto1.preco = 25;
		
		System.out.println("Produto.....: " + produto1.produto);
		System.out.println("Quantidade..: " + produto1.quantidade);
		System.out.println("Preço.......: " + produto1.preco);
		
		System.out.println();
		
		
		Produto produto2 = new Produto();
		produto2.produto = "Teclado";
		produto2.quantidade = 5;
		produto2.preco = 25;
		
		System.out.println("Produto.....: " + produto2.produto);
		System.out.println("Quantidade..: " + produto2.quantidade);
		System.out.println("Preço.......: " + produto2.preco);
		
		System.out.println("------------------------------------------");
		
		//--------Projeto--------
		System.out.println("Projetos");
		System.out.println();
		
		Projeto projeto1 = new Projeto();
		projeto1.nomeProjeto = "Primeiro Projeto";
		projeto1.descricao = "Esse pojeto é ruim";
		projeto1.dataInicio = "1/1/2000";
		projeto1.dataFim = "1/1/2026";
		
		System.out.println("Nome do projeto....: " + projeto1.nomeProjeto);
		System.out.println("Descrição..........: " + projeto1.descricao);
		System.out.println("Data de inicio.....: " + projeto1.dataInicio);
		System.out.println("Data fim...........: " + projeto1.dataFim);
		
		System.out.println();
		
		System.out.println("Projetos");
		System.out.println();
		
		Projeto projeto2 = new Projeto();
		projeto2.nomeProjeto = "Segundo Projeto";
		projeto2.descricao = "Esse pojeto é pio que o pimeiro";
		projeto2.dataInicio = "2/1/2000";
		projeto2.dataFim = "2/1/2026";
		
		System.out.println("Nome do projeto....: " + projeto2.nomeProjeto);
		System.out.println("Descrição..........: " + projeto2.descricao);
		System.out.println("Data de inicio.....: " + projeto2.dataInicio);
		System.out.println("Data fim...........: " + projeto2.dataFim);
	}

}
