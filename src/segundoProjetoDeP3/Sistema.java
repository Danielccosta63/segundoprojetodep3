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
	
	public static void Ordenado() {
		for (Professor x : Professores) {
			x.projetoA.sort((p1, p2) -> Integer.compare(p2.dataDeInicio[2], p1.dataDeInicio[2]));
			x.publicacoesA.sort((s1, s2) -> Integer.compare(s1.data[2], s2.data[2]));
			x.Orientacoes.sort((o1, o2) -> Integer.compare(o1.data[2], o2.data[2]));
		}

		for (AlunoGraduacao x : alunosG) {
			x.projetoA.sort((p1, p2) -> Integer.compare(p2.dataDeInicio[2], p1.dataDeInicio[2]));
			x.publicacoesA.sort((s1, s2) -> Integer.compare(s1.data[2], s2.data[2]));
		}
		for (AlunoMestrado x : alunosM) {			
			x.projetoA.sort((p1, p2) -> Integer.compare(p2.dataDeInicio[2], p1.dataDeInicio[2]));
			x.publicacoesA.sort((s1, s2) -> Integer.compare(s1.data[2], s2.data[2]));
		}
		for (AlunoDoutorado x : alunosD) {
			x.projetoA.sort((p1, p2) -> Integer.compare(p2.dataDeInicio[2], p1.dataDeInicio[2]));
			x.publicacoesA.sort((s1, s2) -> Integer.compare(s1.data[2], s2.data[2]));
		}
		for (Pesquisador x : pesquisadores) {
			x.projetoA.sort((p1, p2) -> Integer.compare(p2.dataDeInicio[2], p1.dataDeInicio[2]));
			x.publicacoesA.sort((s1, s2) -> Integer.compare(s1.data[2], s2.data[2]));
		}
	}

	public static void addProjeto(List<Projeto> projetos, List<Professor> professores) {
		Projeto novoprojeto = new Projeto();
		Professor novoprofessor = new Professor();
		System.out.println("Digite o Nome do Projeto");		
		novoprojeto.titulo = scan.nextLine();
		System.out.println("Dia:");
		novoprojeto.dataDeInicio[0] = Input.lerInteiro();
		System.out.println("Mês:");
		novoprojeto.dataDeInicio[1] = Input.lerInteiro();
		System.out.println("Ano:");
		novoprojeto.dataDeInicio[2] = Input.lerInteiro();
		System.out.println("Agência Financiadora ");
		novoprojeto.agenciaFinanciadora = scan.nextLine();;
		System.out.println("Valor Financiado: ");
		novoprojeto.valorFinanciado = Input.lerDouble();
		System.out.println("Objetivo: ");
		novoprojeto.objetivo = scan.nextLine();
		System.out.println("Descrição: ");
		novoprojeto.descricao = scan.nextLine();
		System.out.println("Professor Responsável: ");
		novoprojeto.professor = scan.nextLine();
		novoprofessor.nome = novoprojeto.professor;
		System.out.println("E-mail do Professor");
		novoprofessor.email = scan.nextLine();

		professores.add(novoprofessor);
		projetos.add(novoprojeto);
		System.out.println("");
		System.out.println(" -----------------------");
		System.out.println("|Adicionado com Sucesso!|");
		System.out.println(" -----------------------");
		System.out.println("");
		System.out.println("");

	}

	public static void addPessoa(List<Professor> professores, List<AlunoGraduacao> alunosG, List<AlunoMestrado> alunosM,
			List<AlunoDoutorado> alunosD, List<Pesquisador> pesquisadores) {
		int op;

		System.out.println(
				"Selecione uma Opção\n1-Aluno Graduação\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		op = Input.lerInteiro();

		if (op == 1) {
			AlunoGraduacao aluno = new AlunoGraduacao();
			System.out.println("Digite o Nome do Aluno");
			aluno.nome = scan.nextLine();;
			System.out.println("Digite o E-Mail");
			aluno.email = scan.nextLine();;
			alunosG.add(aluno);
		} else if (op == 2) {
			AlunoMestrado aluno = new AlunoMestrado();
			System.out.println("Digite o Nome do Aluno");
			aluno.nome = scan.nextLine();;
			System.out.println("Digite o E-Mail");
			aluno.email = scan.nextLine();;
			alunosM.add(aluno);
		} else if (op == 3) {
			AlunoDoutorado aluno = new AlunoDoutorado();
			System.out.println("Digite o Nome do Aluno");
			aluno.nome = scan.nextLine();;
			System.out.println("Digite o E-Mail");
			aluno.email = scan.nextLine();;
			alunosD.add(aluno);
		} else if (op == 4) {
			Professor professor = new Professor();
			System.out.println("Digite o Nome do Professor");
			professor.nome = scan.nextLine();;
			System.out.println("Digite o E-Mail");
			professor.email = scan.nextLine();;
			professores.add(professor);
		} else if (op == 5) {
			Pesquisador pesquisador = new Pesquisador();
			System.out.println("Digite o Nome do Pesquisador");
			pesquisador.nome = scan.nextLine();;
			System.out.println("Digite o E-Mail");
			pesquisador.email = scan.nextLine();;
			pesquisadores.add(pesquisador);
		}
		System.out.println("");
		System.out.println(" -----------------------");
		System.out.println("|Adicionado com Sucesso!|");
		System.out.println(" -----------------------");
		System.out.println("");
		System.out.println("");

	}

	public static void alocarColaborador(List<Projeto> projetos, List<Professor> professores,
			List<AlunoGraduacao> alunosG, List<AlunoMestrado> alunosM, List<AlunoDoutorado> alunosD,
			List<Pesquisador> pesquisadores) {

		int op;
		String nome, projeto;

		System.out.println("Digite o Titulo do Projeto");
		projeto = scan.nextLine();
		
		
		for (Projeto z : projetos) {
			if (z.titulo.equals(projeto)) {
				if (z.status == 2) {
					System.out.println(
							"Selecione uma Opção\n1-Aluno Graduação\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
					op = Input.lerInteiro();

					if (op == 1) {
						System.out.println("Digite o Nome do Aluno");
						nome = scan.nextLine();;

						for (AlunoGraduacao x : alunosG) {
							if (x.nome.equals(nome)) {
								if (x.countProjetos < 2) {
									for (Projeto y : projetos) {
										if (y.titulo.equals(projeto)) {
											y.participantes.add(x);
											x.countProjetos++;
											x.projetosA.add(y);
											break;
										}
									}
								} else {
									System.out.println("Aluno com excesso de Projetos ou Não existente");
									break;
								}
								if (x.nome.equals(nome)) {
									break;
								}
							}
						}

					} else if (op == 2) {
						System.out.println("Digite o Nome do Aluno");
						nome = scan.nextLine();;

						for (AlunoMestrado x : alunosM) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										x.projetosA.add(y);
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
						nome = scan.nextLine();;

						for (AlunoDoutorado x : alunosD) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										x.projetosA.add(y);
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
						nome = scan.nextLine();;

						for (Professor x : professores) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										x.projetosA.add(y);
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
						nome = scan.nextLine();;

						for (Pesquisador x : pesquisadores) {
							if (x.nome.equals(nome)) {
								for (Projeto y : projetos) {
									if (y.titulo.equals(projeto)) {
										y.participantes.add(x);
										x.projetosA.add(y);
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
		System.out.println("");
		System.out.println(" -----------------------");
		System.out.println("|Alocado com Sucesso!|");
		System.out.println(" -----------------------");
		System.out.println("");
		System.out.println("");
	}

	public static void alterarStatus(List<Projeto> projetos) {
		String projeto;
		int op;
		System.out.println("Digite o nome do projeto");
		projeto = scan.nextLine();;

		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				System.out.println("Escolha o novo status\n1- Em elaboração\n2- Em andamento\n3- Concluido");
				op = Input.lerInteiro();
				x.status = op;

				if (op == 3) {
					System.out.println("Digite a data de conclusão:");
					System.out.println("Dia:");
					x.dataDeTermino[0] = Input.lerInteiro();
					System.out.println("Mês:");
					x.dataDeTermino[1] = Input.lerInteiro();
					System.out.println("Dia:");
					x.dataDeTermino[2] = Input.lerInteiro();
				}
			}
		}
	}

	public static void addPublicacao(List<Projeto> projetos) {
		String projeto, nome;
		int op;
		Publicacao novapublicacao = new Publicacao();

		System.out.println(
				"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		
		op = Input.lerInteiro();

		System.out.println("Digite o nome do Projeto");
		projeto =scan.nextLine();;
		System.out.println("Digite o Dia");
		novapublicacao.data[0] = Input.lerInteiro();
		System.out.println("Digite o Mês");
		novapublicacao.data[1] = Input.lerInteiro();
		System.out.println("Digite o Ano");
		novapublicacao.data[2] = Input.lerInteiro();
		System.out.println("Digite o Autor");
		nome = scan.nextLine();;
		novapublicacao.projeto = projeto;
		novapublicacao.autor = nome;
		System.out.println("Digite o Titulo");
		novapublicacao.titulo = scan.nextLine();;
		System.out.println("Digite a Publicação");
		novapublicacao.publicacao = scan.nextLine();;

		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				x.Publicacoes.add(novapublicacao);
			}
		}

		if (op == 1) {
			for (AlunoGraduacao al : alunosG) {
				if (al.nome.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		} else if (op == 2) {
			for (AlunoMestrado al : alunosM) {
				if (al.nome.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}
		}
		if (op == 3) {
			for (AlunoDoutorado al : alunosD) {
				if (al.nome.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		} else if (op == 4) {
			for (Professor al : Professores) {
				if (al.nome.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		} else if (op == 5) {
			for (Pesquisador al : pesquisadores) {
				if (al.nome.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		}
		System.out.println("");
		System.out.println(" -----------------------");
		System.out.println("|Adicionado com Sucesso!|");
		System.out.println(" -----------------------");
		System.out.println("");
		System.out.println("");
	}

	public static void addOrientacao(List<Projeto> projetos, List<Professor> professores) {
		String projeto, nome;
		System.out.println("Digite o nome do Projeto");
		projeto = scan.nextLine();;
		System.out.println("Digite o Autor");
		nome = scan.nextLine();;

		Orientacao novaOrientacao = new Orientacao();
		System.out.println("Digite o Dia");
		novaOrientacao.data[0] = Input.lerInteiro();
		System.out.println("Digite o Mês");
		novaOrientacao.data[1] = Input.lerInteiro();
		System.out.println("Digite o Ano");
		novaOrientacao.data[2] = Input.lerInteiro();
		novaOrientacao.autor = nome;
		System.out.println("Digite o Titulo");
		novaOrientacao.titulo = scan.nextLine();;
		System.out.println("Digite a Publicação");
		novaOrientacao.orientacao = scan.nextLine();

		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				
				x.Orientacoes.add(novaOrientacao);
			}
		}

		for (Professor x : professores) {
			if (x.nome.equals(nome)) {
				
				x.Orientacoes.add(novaOrientacao);
			}
		}
		System.out.println("");
		System.out.println(" -----------------------");
		System.out.println("|Adicionado com Sucesso!|");
		System.out.println(" -----------------------");
		System.out.println("");
		System.out.println("");
	}

	public static void consultarColaborador(List<Professor> professores, List<AlunoGraduacao> alunosG,
			List<AlunoMestrado> alunosM, List<AlunoDoutorado> alunosD, List<Pesquisador> pesquisadores) {
		int op;

		Ordenado();

		String nome;
		System.out.println(" -------------------------- ");
		System.out.println(
				"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		System.out.println(" -------------------------- ");
		op = Input.lerInteiro();

		if (op == 1) {
			System.out.printf("Digite o nome do aluno: ");
			nome = scan.nextLine();;
			for (AlunoGraduacao x : alunosG) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\nE-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetosA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println(" ");
					System.out.println("Publicações: ");
					for (Publicacao w : x.publicacoesA) {
						System.out.printf("%s\n", w.titulo);
					}
				}
			}

		} else if (op == 2) {
			System.out.printf("Digite o nome do aluno: ");
			nome = scan.nextLine();
			for (AlunoMestrado x : alunosM) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\nE-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetosA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println(" ");
					System.out.println("Publicações: ");
					for (Publicacao w : x.publicacoesA) {
						System.out.printf("%s\n", w.titulo);
					}
				}
			}

		}
		if (op == 3) {
			System.out.printf("Digite o nome do aluno: ");
			nome = scan.nextLine();
			for (AlunoDoutorado x : alunosD) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\nE-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetosA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println(" ");
					System.out.println("Publicações: ");
					for (Publicacao w : x.publicacoesA) {
						System.out.printf("%s\n", w.titulo);
					}
				}
			}

		} else if (op == 4) {
			System.out.printf("Digite o nome do Professor: ");
		
			nome = scan.nextLine();
			for (Professor x : professores) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\nE-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetosA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println(" ");
					System.out.println("Publicações: ");
					for (Publicacao w : x.publicacoesA) {
						System.out.printf("%s\n", w.titulo);
					}
					System.out.println(" ");
					System.out.println("Orientacao");
					for (Orientacao w : x.Orientacoes) {
						System.out.printf("%s\n", w.titulo);
					}
				}
			}

		} else if (op == 5) {
			System.out.printf("Digite o nome do Pesquisador: ");
		
			nome = scan.nextLine();;
			for (Pesquisador x : pesquisadores) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\nE-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetosA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println(" ");
					System.out.println("Publicações: ");
					for (Publicacao w : x.publicacoesA) {
						System.out.printf("%s\n", w.titulo);
					}
				}
			}

		}

	}

	public static void relatorio(List<Projeto> projetos, List<Professor> professores, List<AlunoGraduacao> alunosG,
			List<AlunoMestrado> alunosM, List<AlunoDoutorado> alunosD, List<Pesquisador> pesquisadores) {
		int count1 = 0, count2 = 0, count3 = 0;
		System.out.println("\n ------------------- ");
		System.out.printf(
				"|    COLABORADORES  |\n|Professores:      %d|\n|Alunos Graduação: %d|\n|Alunos Mestrado:  %d|\n|Alunos Doutorado: %d|\n|Pesquisadores:    %d|\n|Total-------------%d|\n",
				professores.size(), alunosG.size(), alunosM.size(), alunosD.size(), pesquisadores.size(),
				professores.size() + alunosG.size() + alunosM.size() + alunosD.size() + pesquisadores.size());
		System.out.println("|      PROJETOS:    |");
		for (Projeto x : projetos) {
			if (x.status == 1) {
				count1++;
			} else if (x.status == 3) {
				count2++;
			} else if (x.status == 2) {
				count3++;
			}
		}
		System.out.printf(
				"|Elaboração:       %d|\n|Andamento:        %d|\n|Concluidos:       %d|\n|Total-------------%d|",
				count1, count3, count2, count1 + count2 + count3);
		count1 = 0;
		count2 = 0;
		for (Projeto y : projetos) {
			count1 += y.Orientacoes.size();
			count2 += y.Publicacoes.size();
		}
		System.out.printf("\n|ORIENTAÇÕES:      %d|\n|PUBLICAÇÕES:      %d|\n", count1, count2);
		System.out.println(" ------------------- ");
		System.out.println("\n\n");

	}

	public static void listarProjetos(List<Projeto> projetos) {
		for (Projeto x : projetos) {
			System.out.printf("=============Titulo:%s============\n", x.titulo);
			if (x.status == 2)
				System.out.println("Status: Em andamento");
			if (x.status == 1)
				System.out.println("Status: Em elaboração");
			else
				System.out.printf("Status: Concluido\n");
			System.out.printf("Data de inicio: %d/", x.dataDeInicio[0]);
			System.out.printf("%d/", x.dataDeInicio[1]);
			System.out.printf("%d\n", x.dataDeInicio[2]);
			System.out.printf("Data de Término: %d/", x.dataDeTermino[0]);
			System.out.printf("%d/", x.dataDeTermino[1]);
			System.out.printf("%d\n", x.dataDeTermino[2]);
			System.out.printf("Agencia financiadora%s\n", x.agenciaFinanciadora);
			System.out.printf("Valor fananciado: %.2f\n", x.valorFinanciado);
			System.out.printf("Objetivo: %s\n", x.objetivo);
			System.out.printf("Descrição: %s\n", x.descricao);
			System.out.printf("Professor Responsavel:%s\n", x.professor);
			System.out.println("Colaboradores:");
			for (Pessoa y : x.participantes) {
				System.out.printf("Nome: %s\n", y.nome);
			}
			System.out.println("\nPublicações:");
			for (Publicacao y : x.Publicacoes) {
				System.out.printf("Nome da publicação: %s\n", y.titulo);
			}
			System.out.print("\n\nOrientações:");
			for (Orientacao y : x.Orientacoes) {
				System.out.printf("\nNome da Orientação: %s", y.titulo);
			}
			System.out.println("\n==================================");
		}
	}
	
	public static void listarPublicacoes(List<Projeto> projetos){
		String nome;
		System.out.println("Digite o nome do projeto");
		nome=scan.nextLine();
		
		for(Projeto x: projetos){
			if(x.titulo.equals(nome)){
				for(Publicacao y: x.Publicacoes){
					System.out.printf("---------------------------------------------");
					System.out.printf("\nTitulo: %s", y.titulo);
					System.out.printf("\nAutor: %s", y.autor);
					System.out.printf("\nData: %d/%d/%d", y.data[0], y.data[1], y.data[2]);
					System.out.printf("\n%s", y.publicacao);
					System.out.printf("\n----------------------------------------------");
				}
			}
		}
	}
	
	public static void listarOrientacoes(List<Projeto> projetos){
		String nome;
		System.out.println("Digite o nome do projeto");
		nome=scan.nextLine();
		
		for(Projeto x: projetos){
			if(x.titulo.equals(nome)){
				for(Orientacao y: x.Orientacoes){
					System.out.printf("---------------------------------------------");
					System.out.printf("\nTitulo: %s", y.titulo);
					System.out.printf("\nAutor: %s", y.autor);
					System.out.printf("\nData: %d/%d/%d", y.data[0], y.data[1], y.data[2]);
					System.out.printf("\n%s", y.orientacao);
					System.out.printf("\n----------------------------------------------");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int op = 0;

		System.out.println("===========Bem vindo ao Sistema Academico=============");

		do {
			System.out.println(" -------------------------- ");
			System.out.println("|   Selecione uma Opção    |");
			System.out.println("|--------------------------| ");
			System.out.println("|1- Adicionar novo projeto |");
			System.out.println("|2- Adicionar Pessoa       |");
			System.out.println("|3- Alocar Colaborador     |");
			System.out.println("|4- Adicionar Publicação   |");
			System.out.println("|5- Adicionar Orientação   |");
			System.out.println("|6- Consultar Colaborador  |");
			System.out.println("|7- Listar Projetos        |");
			System.out.println("|8- Alterar Status         |");
			System.out.println("|9- Relatorio              |");
			System.out.println("|10- Listar Publicações    |");
			System.out.println("|11- Listar Orientações    |");
			System.out.println("|0- SAIR                   |");
			System.out.println(" -------------------------- ");

			op = Input.lerInteiro();

			if (op == 1)
				addProjeto(projetos, Professores);
			else if (op == 2)
				addPessoa(Professores, alunosG, alunosM, alunosD, pesquisadores);
			else if (op == 3)
				alocarColaborador(projetos, Professores, alunosG, alunosM, alunosD, pesquisadores);
			else if (op == 4)
				addPublicacao(projetos);
			else if (op == 5)
				addOrientacao(projetos, Professores);
			else if (op == 6)
				consultarColaborador(Professores, alunosG, alunosM, alunosD, pesquisadores);
			else if (op == 7)
				listarProjetos(projetos);
			else if (op == 8)
				alterarStatus(projetos);
			else if (op == 9)
				relatorio(projetos, Professores, alunosG, alunosM, alunosD, pesquisadores);
			else if (op == 10)
				listarPublicacoes(projetos);
			else if(op == 11)
				listarOrientacoes(projetos);
		} while (op != 0);

	}

}
