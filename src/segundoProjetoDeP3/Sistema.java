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

	public void ordenado() {
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
		novoprojeto.titulo = Input.lerString();
		System.out.println("Dia:");
		novoprojeto.dataDeInicio[0] = Input.lerInteiro();
		System.out.println("Mês:");
		novoprojeto.dataDeInicio[1] = Input.lerInteiro();
		System.out.println("Ano:");
		novoprojeto.dataDeInicio[2] = Input.lerInteiro();
		System.out.print("Agência Financiadora ");
		novoprojeto.agenciaFinanciadora = Input.lerString();
		System.out.print("\nValor Financiado: ");
		novoprojeto.valorFinanciado = Input.lerDouble();
		System.out.print("\nObjetivo: ");
		novoprojeto.objetivo = Input.lerString();
		System.out.print("\nDescrição ");
		novoprojeto.descricao = Input.lerString();
		System.out.print("\nProfessor Responsável: ");
		novoprojeto.professor = Input.lerString();
		novoprofessor.nome = novoprojeto.professor;
		System.out.println("E-mail do Professor");
		novoprofessor.email = Input.lerString();

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
				"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		op = Input.lerInteiro();

		if (op == 1) {
			AlunoGraduacao aluno = new AlunoGraduacao();
			System.out.println("Digite o Nome do Aluno");
			aluno.nome = Input.lerString();
			System.out.println("Digite o E-Mail");
			aluno.email = Input.lerString();
			alunosG.add(aluno);
		} else if (op == 2) {
			AlunoMestrado aluno = new AlunoMestrado();
			System.out.println("Digite o Nome do Aluno");
			aluno.nome = Input.lerString();
			System.out.println("Digite o E-Mail");
			aluno.email = Input.lerString();
			alunosM.add(aluno);
		} else if (op == 3) {
			AlunoDoutorado aluno = new AlunoDoutorado();
			System.out.println("Digite o Nome do Aluno");
			aluno.nome = Input.lerString();
			System.out.println("Digite o E-Mail");
			aluno.email = Input.lerString();
			alunosD.add(aluno);
		} else if (op == 4) {
			Professor professor = new Professor();
			System.out.println("Digite o Nome do Professor");
			professor.nome = Input.lerString();
			System.out.println("Digite o E-Mail");
			professor.email = Input.lerString();
			professores.add(professor);
		} else if (op == 5) {
			Pesquisador pesquisador = new Pesquisador();
			System.out.println("Digite o Nome do Pesquisador");
			pesquisador.nome = Input.lerString();
			System.out.println("Digite o E-Mail");
			pesquisador.email = Input.lerString();
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
		scan.nextLine();
		projeto = Input.lerString();

		for (Projeto z : projetos) {
			if (z.titulo.equals(projeto)) {
				if (z.status == 1) {
					System.out.println(
							"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
					op = Input.lerInteiro();

					if (op == 1) {
						System.out.println("Digite o Nome do Aluno");
						nome = Input.lerString();

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
						nome = Input.lerString();

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
						nome = Input.lerString();

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
						nome = Input.lerString();

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
						nome = Input.lerString();

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
		System.out.println("");
		System.out.println(" -----------------------");
		System.out.println("|Alocado com Sucesso!|");
		System.out.println(" -----------------------");
		System.out.println("");
		System.out.println("");
	}

	public static void alterarStatus(List<Projeto> projetos) {
		String projeto;
		System.out.println("Digite o nome do projeto");
		projeto = Input.lerString();

		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				System.out.println("Escolha o novo status\n1- em elaboração\n2- em andamento\n3- concluido");
				x.status = Input.lerInteiro();
			}
		}
	}

	public static void addPublicacao(List<Projeto> projetos) {
		String projeto, nome;
		int op;
		Publicacao novapublicacao = new Publicacao();

		System.out.println(
				"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		scan.nextLine();
		op = Input.lerInteiro();

		System.out.println("Digite o nome do Projeto");
		projeto = Input.lerString();
		System.out.println("Digite o Dia");
		novapublicacao.data[0]= Input.lerInteiro();
		System.out.println("Digite o Mês");
		novapublicacao.data[1]= Input.lerInteiro();
		System.out.println("Digite o Ano");
		novapublicacao.data[2]= Input.lerInteiro();
		System.out.println("Digite o Autor");
		nome = Input.lerString();		
		novapublicacao.projeto = projeto;
		novapublicacao.autor = nome;
		System.out.println("Digite o Titulo");
		novapublicacao.titulo = Input.lerString();
		System.out.println("Digite a Publicação");
		novapublicacao.publicacao = Input.lerString();
		
		
		
		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				x.Publicacoes.add(novapublicacao);
			}
		}
		
		
		if (op == 1) {
			for (AlunoGraduacao al : alunosG) {
				if (al.nome.equals(nome)) {
					System.out.println("Chegouu no cara");
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
		projeto = Input.lerString();
		System.out.println("Digite o Autor");
		nome = Input.lerString();
		
		Orientacao novaOrientacao = new Orientacao();
		System.out.println("Digite o Dia");
		novaOrientacao.data[0]= Input.lerInteiro();
		System.out.println("Digite o Mês");
		novaOrientacao.data[1]= Input.lerInteiro();
		System.out.println("Digite o Ano");
		novaOrientacao.data[2]= Input.lerInteiro();
		novaOrientacao.autor = scan.nextLine();
		System.out.println("Digite o Titulo");
		novaOrientacao.titulo = Input.lerString();
		System.out.println("Digite a Publicação");
		novaOrientacao.orientacao = Input.lerString();
		
		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {				
				System.out.println("------------------criou p");
				x.Orientacoes.add(novaOrientacao);
			}
		}
				
		for (Professor x : professores) {
			if (x.nome.equals(nome)) {	
				System.out.println("--------------------crioupx");
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
		String nome;
		System.out.println(" -------------------------- ");
		System.out.println(
				"Selecione uma Opção\n1-Aluno Graduanção\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		System.out.println(" -------------------------- ");
		op = Input.lerInteiro();

		if (op == 1) {
			System.out.printf("Digite o nome do aluno: ");
			nome = Input.lerString();
			for (AlunoGraduacao x : alunosG) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetoA) {
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
			scan.nextLine();
			nome = scan.nextLine();
			for (AlunoMestrado x : alunosM) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetoA) {
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
			scan.nextLine();
			nome = scan.nextLine();
			for (AlunoDoutorado x : alunosD) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetoA) {
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
			scan.nextLine();
			nome = scan.nextLine();
			for (Professor x : professores) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetoA) {
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
			scan.nextLine();
			nome = scan.nextLine();
			for (Pesquisador x : pesquisadores) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: \n", x.nome, x.email);
					for (Projeto y : x.projetoA) {
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
				"|    Colaboradores  |\n|Professores:      %d|\n|Alunos Graduação: %d|\n|Alunos Mestrado:  %d|\n|Alunos Doutorado: %d|\n|Pesquisadores:    %d|\n|Total-------------%d|\n",
				professores.size(), alunosG.size(), alunosM.size(), alunosD.size(), pesquisadores.size(),
				professores.size() + alunosG.size() + alunosM.size() + alunosD.size() + pesquisadores.size());
		System.out.println("|      Projetos:    |");
		for (Projeto x : projetos) {
			if (x.status == 1) {
				count1++;
			} else if (x.status == 3) {
				count2++;
			} else if (x.status == 2) {
				count3++;
			}
		}
		System.out.printf("|Elaboração:       %d|\n|Andamento:        %d|\n|Concluidos:       %d|\n|Total-------------%d|", count1, count2, count3,
				count1 + count2 + count3);
		count1 = 0;
		count2 = 0;
		for (Projeto y : projetos) {
			count1 += y.Orientacoes.size();
			count2 += y.Publicacoes.size();
		}
		System.out.printf("\n|Orientações:      %d|\n|Publicações:      %d|\n", count1, count2);
		System.out.println(" ------------------- ");
		System.out.println("\n\n");
		
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
			for(Publicacao y: x.Publicacoes){
				System.out.printf("\nNome da publicação: %s", y.titulo);
			}
			for(Orientacao y: x.Orientacoes){
				System.out.printf("\nNome da Orientação: %s", y.titulo);
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
			System.out.println("|8- Relatorio              |");
			System.out.println(" -------------------------- ");

			op = scan.nextInt();

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
				relatorio(projetos, Professores, alunosG, alunosM, alunosD, pesquisadores);
		} while (op != 0);

	}

}
