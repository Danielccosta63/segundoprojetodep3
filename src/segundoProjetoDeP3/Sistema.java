package segundoProjetoDeP3;

import java.util.*;

public class Sistema {
	static Scanner scan = new Scanner(System.in);

	static List<Projeto> projetos = new ArrayList<Projeto>();
	static List<Professor> Professores = new ArrayList<Professor>();
	static List<AlunoGraduacao> alunosG = new ArrayList<AlunoGraduacao>();
	static List<AlunoMestrado> alunosM = new ArrayList<AlunoMestrado>();
	static List<AlunoDoutorado> alunosD = new ArrayList<AlunoDoutorado>();
	static List<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();

	public static void addProjeto(List<Projeto> projetos, List<Professor> professores) {
		Projeto novoprojeto = new Projeto();
		Professor novoprofessor = new Professor();
		System.out.println("Digite o Nome do Projeto");
		scan.nextLine();
		novoprojeto.titulo = scan.nextLine();
		System.out.println("Dia:");
		novoprojeto.dataDeInicio[0] = scan.nextInt();
		System.out.println("Mês:");
		novoprojeto.dataDeInicio[1] = scan.nextInt();
		System.out.println("Ano:");
		novoprojeto.dataDeInicio[2] = scan.nextInt();
		System.out.print("Agência Financiadora ");
		scan.nextLine();
		novoprojeto.agenciaFinanciadora = scan.nextLine();
		System.out.print("\nValor Financiado: ");
		novoprojeto.valorFinanciado = scan.nextDouble();
		System.out.print("\nObjetivo: ");
		scan.nextLine();
		novoprojeto.objetivo = scan.nextLine();
		System.out.print("\nDescrição ");
		novoprojeto.descricao = scan.nextLine();
		System.out.print("\nProfessor Responsável: ");
		novoprojeto.professor = scan.nextLine();
		novoprofessor.nome = novoprojeto.professor;
		System.out.println("E-mail do Professor");
		novoprofessor.email = scan.nextLine();

		professores.add(novoprofessor);
		projetos.add(novoprojeto);
	}

	public static void addPessoa(List<Professor> professores, List<AlunoGraduacao> alunosG, List<AlunoMestrado> alunosM,
			List<AlunoDoutorado> alunosD, List<Pesquisador> pesquisadores) {
		int op;

		System.out.println(
				"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		op = scan.nextInt();

		if (op == 1) {
			AlunoGraduacao aluno = new AlunoGraduacao();
			System.out.println("Digite o Nome do Aluno");
			scan.nextLine();
			aluno.nome = scan.nextLine();
			System.out.println("Digite o E-Mail");
			aluno.email = scan.nextLine();
			alunosG.add(aluno);
		} else if (op == 2) {
			AlunoMestrado aluno = new AlunoMestrado();
			System.out.println("Digite o Nome do Aluno");
			scan.nextLine();
			aluno.nome = scan.nextLine();
			System.out.println("Digite o E-Mail");
			aluno.email = scan.nextLine();
			alunosM.add(aluno);
		} else if (op == 3) {
			AlunoDoutorado aluno = new AlunoDoutorado();
			System.out.println("Digite o Nome do Aluno");
			scan.nextLine();
			aluno.nome = scan.nextLine();
			System.out.println("Digite o E-Mail");
			aluno.email = scan.nextLine();
			alunosD.add(aluno);
		} else if (op == 4) {
			Professor professor = new Professor();
			System.out.println("Digite o Nome do Professor");
			scan.nextLine();
			professor.nome = scan.nextLine();
			System.out.println("Digite o E-Mail");
			professor.email = scan.nextLine();
			professores.add(professor);
		} else if (op == 5) {
			Pesquisador pesquisador = new Pesquisador();
			System.out.println("Digite o Nome do Pesquisador");
			scan.nextLine();
			pesquisador.nome = scan.nextLine();
			System.out.println("Digite o E-Mail");
			pesquisador.email = scan.nextLine();
			pesquisadores.add(pesquisador);
		}

	}

	public static void alocarColaborador(List<Projeto> projetos, List<Professor> professores,
			List<AlunoGraduacao> alunosG, List<AlunoMestrado> alunosM, List<AlunoDoutorado> alunosD,
			List<Pesquisador> pesquisadores) {

		int op;
		String nome, projeto;

		System.out.println("Digite o Titulo do Projeto");
		scan.nextLine();
		projeto = scan.nextLine();

		for (Projeto z : projetos) {
			if (z.titulo.equals(projeto)) {
				if (z.status == 1) {
					System.out.println(
							"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
					op = scan.nextInt();

					if (op == 1) {
						System.out.println("Digite o Nome do Aluno");
						scan.nextLine();
						nome = scan.nextLine();

						for (AlunoGraduacao x : alunosG) {
							if (x.nome.equals(nome)) {
								if (x.countProjetos < 2) {
									for (Projeto y : projetos) {
										if (y.titulo.equals(projeto)) {
											y.participantes.add(x);
											x.countProjetos++;
											break;
										}
									}
								}else{
									System.out.println("Aluno com excesso de Projetos");
									break;
								}
								if (x.nome.equals(nome)) {
									break;
								}
							}
						}

					} else if (op == 2) {
						System.out.println("Digite o Nome do Aluno");
						scan.nextLine();
						nome = scan.nextLine();

						for (AlunoMestrado x : alunosM) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										break;
									}
								}
							}
							if (x.nome.equals(nome)) {
								break;
							}
						}
					} else if (op == 3) {
						System.out.println("Digite o Nome do Aluno");
						scan.nextLine();
						nome = scan.nextLine();

						for (AlunoDoutorado x : alunosD) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										break;
									}
								}
							}
							if (x.nome.equals(nome)) {
								break;
							}
						}
					} else if (op == 4) {
						System.out.println("Digite o Nome do Professor");
						scan.nextLine();
						nome = scan.nextLine();

						for (Professor x : professores) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										break;
									}
								}
							}
							if (x.nome.equals(nome)) {
								break;
							}
						}
					} else if (op == 5) {
						System.out.println("Digite o Nome do Pesquisador");
						scan.nextLine();
						nome = scan.nextLine();

						for (Pesquisador x : pesquisadores) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										break;
									}
								}
							}
							if (x.nome.equals(nome)) {
								break;
							}
						}
					}
				}
			} else {
				System.out.println("O projeto não se encontra em andamento");
				break;
			}
		}

	}

	public static void alterarStatus(List<Projeto> projetos){
		String projeto;
		System.out.println("Digite o nome do projeto");
		projeto=scan.nextLine();
		
		for(Projeto x : projetos){
			if(x.titulo.equals(projeto)){
				System.out.println("Escolha o novo status\n1- em elaboração\n2- em andamento\n3- concluido");
				x.status=scan.nextInt();
			}
		}
	}
	
	public static void addPublicacao(List<Projeto> projetos){
		String projeto;
		System.out.println("Digite o nome do Projeto");
		projeto=scan.nextLine();
		
		for(Projeto x : projetos){
			if(x.titulo.equals(projeto)){
				Publicacao novapublicacao = new Publicacao ();
				System.out.println("Digite o Autor");
				novapublicacao.autor=scan.nextLine();
				System.out.println("Digite o Titulo");
				novapublicacao.titulo=scan.nextLine();
				System.out.println("Digite a Publicação");
				novapublicacao.publicacao=scan.nextLine();
				x.Publicacoes.add(novapublicacao);
			}
		}
	}
	
	public static void listarProjetos(List<Projeto> projetos) {
		for (Projeto x : projetos) {
			System.out.printf("%s\n", x.titulo);
			System.out.printf("%d\n", x.status);
			System.out.printf("%d/", x.dataDeInicio[0]);
			System.out.printf("%d/", x.dataDeInicio[1]);
			System.out.printf("%d\n", x.dataDeInicio[2]);
			System.out.printf("%d/", x.dataDeTermino[0]);
			System.out.printf("%d/", x.dataDeTermino[1]);
			System.out.printf("%d\n", x.dataDeTermino[2]);
			System.out.printf("%s\n", x.agenciaFinanciadora);
			System.out.printf("%f\n", x.valorFinanciado);
			System.out.printf("%s\n", x.objetivo);
			System.out.printf("%s\n", x.descricao);
			System.out.printf("%s\n", x.professor);
			for (Pessoa y : x.participantes) {
				System.out.printf("\nNome: %s", y.nome);
			}
		}
	}

	public static void main(String[] args) {
		int op = 0;

		System.out.println("Bem vindo ao Sistema Academico");

		do {
			System.out.println("Selecione uma Opção");
			System.out.println("1- Adicionar novo projeto");
			System.out.println("2- Adicionar Pessoa");
			System.out.println("3- Alocar Colaborador");
			System.out.println("4- Adicionar Publicação");
			System.out.println("10- Listar Projetos");
			op = scan.nextInt();

			if (op == 1)
				addProjeto(projetos, Professores);
			else if (op == 2)
				addPessoa(Professores, alunosG, alunosM, alunosD, pesquisadores);
			else if (op == 3)
				alocarColaborador(projetos, Professores, alunosG, alunosM, alunosD, pesquisadores);
			else if (op == 10)
				addPublicacao(projetos);
			else if (op == 10)
				listarProjetos(projetos);
		} while (op != 0);

	}

}
