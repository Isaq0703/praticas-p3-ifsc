package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.PessoaDAO;
import modelo.Pessoa;

public class MainExemplo {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		PessoaDAO bancoPessoa = PessoaDAO.getInstancia();
		while (opcaoSelecionada != 0) {

			/**
			 * Esta é so uma proposta de menu de sistema.
			 * 
			 * Voce nao precisa seguir esta ordem, desde que seu sistema respeite a logica
			 * de incluir, alterar, listar e excluir de alguma forma.
			 */
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR");
			System.out.println("2 ALTERAR");
			System.out.println("3 EXCLUIR");
			System.out.println("4 LISTAR");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Pessoa p = new Pessoa();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
				// fazer validacao
				System.out.println("Cpf:");
				String cpf = leitura.nextLine();
				// fazer validacao
				p.setNome(nome);

				/**
				 * Exemplo de validacao
				 * 
				 */
				if (!cpf.isEmpty()) {
					p.setCpf(Long.valueOf(cpf));
				} else {
					System.out.println("Erro");
				}

				bancoPessoa.inserir(p);
				break;
			}
			case 2: {
				System.out.println("Digite o codigo da pessoa que deseja alterar:");
				Long cpf;
				cpf = Long.valueOf(leitura.nextLine());
				Pessoa p = new Pessoa();
				System.out.println("Digite o novo nome:");
				p.setNome(leitura.nextLine());
				bancoPessoa.alterar(p,cpf);
				// finalizar codigo
				break;
			}
			case 3: {
				System.out.println("Digite o codigo da pessoa que deseja excluir:");
				Long cpf;
				cpf = Long.valueOf(leitura.nextLine());
				Pessoa n = new Pessoa();
				bancoPessoa.excluir(cpf);
				System.out.println("Pessoa excluída.");
				break;
			}
			case 4: {
				ArrayList<Pessoa> lista = bancoPessoa.listarPessoas();
				for (Pessoa pessoa : lista) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
				}
				break;
			}

			}

		}

		leitura.close();
	}
}
