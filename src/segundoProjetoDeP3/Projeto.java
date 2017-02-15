package segundoProjetoDeP3;
import java.util.*;

public class Projeto {
	public String titulo;
	public int status=2; //1- em elaboração, 2- em andamento, 3- concluido
	public int [] dataDeInicio = new int [3];
	public int [] dataDeTermino = new int [3];
	public String agenciaFinanciadora;
	public Double valorFinanciado; 
	public String objetivo; 
	public String descricao; 
	public String professor; 
	public List<Pessoa> participantes = new ArrayList<Pessoa>();
	public List<Orientacao> Orientacoes = new ArrayList<Orientacao>();
	public List<Publicacao> Publicacoes = new ArrayList<Publicacao>();
}
