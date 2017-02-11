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
		System.out.println("M�s:");
		novoprojeto.dataDeInicio[1] = scan.nextInt();
		System.out.println("Ano:");
		novoprojeto.dataDeInicio[2] = scan.nextInt();
		System.out.print("Ag�ncia Financiadora ");
		scan.nextLine();
		novoprojeto.agenciaFinanciadora = scan.nextLine();
		System.out.print("\nValor Financiado: ");
		novoprojeto.valorFinanciado = scan.nextDouble();
		System.out.print("\nObjetivo: ");
		scan.nextLine();
		novoprojeto.objetivo = scan.nextLine();
		System.out.print("\nDescri��o ");
		novoprojeto.descricao = scan.nextLine();
		System.out.print("\nProfessor Respons�vel: ");
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
				"Selecione uma Op��o\n1-Aluno Graduan��o\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
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
							"Selecione uma Op��o\n1-Aluno Graduan��o\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
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
								} else {
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
				System.out.println("O projeto n�o se encontra em andamento");
				break;
			}
		}

	}

	public static void alterarStatus(List<Projeto> projetos) {
		String projeto;
		System.out.println("Digite o nome do projeto");
		projeto = scan.nextLine();

		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				System.out.println("Escolha o novo status\n1- em elabora��o\n2- em andamento\n3- concluido");
				x.status = scan.nextInt();
			}
		}
	}

	public static void addPublicacao(List<Projeto> projetos) {
		String projeto, nome = " ";
		int op;
		Publicacao novapublicacao = new Publicacao();

		System.out.println(
				"Selecione uma Op��o\n1-Aluno Graduan��o\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		op = scan.nextInt();

		System.out.println("Digite o nome do Projeto");
		projeto = scan.nextLine();

		for (Projeto x : projetos) {
			if (x.titulo.equals(projeto)) {
				novapublicacao.projeto = projeto;
				System.out.println("Digite o Autor");
				nome = scan.nextLine();
				novapublicacao.autor = nome;
				System.out.println("Digite o Titulo");
				novapublicacao.titulo = scan.nextLine();
				System.out.println("Digite a Publica��o");
				novapublicacao.publicacao = scan.nextLine();
				x.Publicacoes.add(novapublicacao);
			}
		}

		if (op == 1) {
			for (AlunoGraduacao al : alunosG) {
				if (al.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		} else if (op == 2) {
			for (AlunoMestrado al : alunosM) {
				if (al.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}
		}
		if (op == 3) {
			for (AlunoDoutorado al : alunosD) {
				if (al.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		} else if (op == 4) {
			for (Professor al : Professores) {
				if (al.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		} else if (op == 5) {
			for (Pesquisador al : pesquisadores) {
				if (al.equals(nome)) {
					al.publicacoesA.add(novapublicacao);
				}
			}

		}
	}

	public static void addOrientacao(List<Projeto> projetos, List<Professor> professores) {
		String projeto, nome;
		System.out.println("Digite o nome do Projeto");
		projeto = scan.nextLine();
		System.out.println("Digite o Autor");
		nome = scan.nextLine();

		for (Professor y : professores) {
			if (y.nome == nome) {
				for (Projeto x : projetos) {
					if (x.titulo.equals(projeto)) {
						Orientacao novaOrientacao = new Orientacao();
						novaOrientacao.autor = scan.nextLine();
						System.out.println("Digite o Titulo");
						novaOrientacao.titulo = scan.nextLine();
						System.out.println("Digite a Publica��o");
						novaOrientacao.orientacao = scan.nextLine();
						x.Orientacoes.add(novaOrientacao);
						y.Orientacoes.add(novaOrientacao);
					}
				}
			}
		}

	}

	public static void consultarColaborador(List<Professor> professores, List<AlunoGraduacao> alunosG,
			List<AlunoMestrado> alunosM, List<AlunoDoutorado> alunosD, List<Pesquisador> pesquisadores) {
		int op;
		String nome;

		System.out.println(
				"Selecione uma Op��o\n1-Aluno Graduan��o\n2-Aluno Mestrado\n3-Aluno de Doutorado\n4-Professor\n5-Pesquisador ");
		op = scan.nextInt();

		if (op == 1) {
			System.out.printf("Digite o nome do aluno: ");
			scan.nextLine();
			nome = scan.nextLine();
			for (AlunoGraduacao x : alunosG) {
				if (x.nome.equals(nome)) {
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: ", x.nome, x.email);
					for (Projeto y : x.projetoA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println("Publica��es: ");
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
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: ", x.nome, x.email);
					for (Projeto y : x.projetoA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println("Publica��es: ");
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
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: ", x.nome, x.email);
					for (Projeto y : x.projetoA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println("Publica��es: ");
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
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: ", x.nome, x.email);
					for (Projeto y : x.projetoA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println("Publica��es: ");
					for (Publicacao w : x.publicacoesA) {
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
					System.out.printf("Nome: %s\n E-mail: %s\nProjetos: ", x.nome, x.email);
					for (Projeto y : x.projetoA) {
						System.out.printf("%s\n", y.titulo);
					}
					System.out.println("Publica��es: ");
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

		System.out.printf(
				"Colaboradores\nProfessores: %d\n Alunos Gradua��o: %d\n Alunos Mestrado: %d\n Alunos Doutorado: %d\n Pesquisadores: %d\n---Total:%d\n",
				professores.size(), alunosG.size(), alunosM.size(), alunosD.size(), pesquisadores.size(),
				professores.size() + alunosG.size() + alunosM.size() + alunosD.size() + pesquisadores.size());
		System.out.println("---------------------------\nProjetos");
		for (Projeto x : projetos) {
			if (x.status == 1) {
				count1++;
			} else if (x.status == 3) {
				count2++;
			} else if (x.status == 2) {
				count3++;
			}
		}
		System.out.printf("Elabora��o: %d\nAndamento: %d\nConcluidos: %d\n---Total: %d", count1, count2, count3,
				count1 + count2 + count3);
		count1 = 0;
		count2 = 0;
		for (Projeto y : projetos) {
			count1 += y.Orientacoes.size();
			count2 += y.Publicacoes.size();
		}
		System.out.printf("Orienta��es: %d\nPublica��es: %d\n", count1, count2);
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
			System.out.println("Selecione uma Op��o");
			System.out.println("1- Adicionar novo projeto");
			System.out.println("2- Adicionar Pessoa");
			System.out.println("3- Alocar Colaborador");
			System.out.println("4- Adicionar Publica��o");
			System.out.println("5- Adicionar Orienta��o");
			System.out.println("6- Consultar Colaborador");
			System.out.println("7- Listar Projetos");
			System.out.println("8- Relatorio");
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
