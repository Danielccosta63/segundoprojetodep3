package segundoProjetoDeP3;

import java.util.*;


public class Sistema {
	static List<Projeto> projetos = new ArrayList<Projeto>();
	static List<Professor> Professores = new ArrayList<Professor>();
	static Scanner scan = new Scanner(System.in);
	
	public static void addProjeto(List<Projeto> projetos, List<Professor> professores2){
		Projeto novoprojeto = new Projeto();
		Professor novoprofessor = new Professor();
		System.out.println("Digite o Nome do Projeto");
		scan.nextLine();
		novoprojeto.titulo= scan.nextLine();
		System.out.println("Dia:");
		novoprojeto.dataDeInicio[0]=scan.nextInt();
		System.out.println("Mês:");
		novoprojeto.dataDeInicio[1]=scan.nextInt();
		System.out.println("Ano:");
		novoprojeto.dataDeInicio[2]=scan.nextInt();
		System.out.print("Agência Financiadora ");
		scan.nextLine();
		novoprojeto.agenciaFinanciadora=scan.nextLine();
		System.out.print("\nValor Financiado: ");
		novoprojeto.valorFinanciado=scan.nextDouble();
		System.out.print("\nObjetivo: ");
		scan.nextLine();
		novoprojeto.objetivo=scan.nextLine();
		System.out.print("\nDescrição ");
		novoprojeto.descricao=scan.nextLine();
		System.out.print("\nProfessor Responsável: ");
		novoprojeto.professor=scan.nextLine();
		
		novoprofessor.nome=novoprojeto.professor;
		
		professores2.add(novoprofessor);
		projetos.add(novoprojeto);
	}
	
	public static void main(String[] args) {
		int op=0;
		
		
		System.out.println("Bem vindo ao Sistema Academico");
		
		do{
			System.out.println("Selecione uma Opção");
			System.out.println("1- Adicionar novo projeto");
			
			op=scan.nextInt();
			
			if(op==1) addProjeto(projetos, Professores);
			
		}while(op!=0);
		
	}

}
