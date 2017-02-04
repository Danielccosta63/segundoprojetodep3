package segundoProjetoDeP3;
import java.util.*;

public class Projeto {
	public String titulo;
	public int status=1; //1- em elabora��o, 2- em andamento, 3- concluido
	public int [] dataDeInicio = new int [3];
	public int [] dataDeTermino = new int [3];
	public String agenciaFinanciadora;
	public Double valorFinanciado; 
	public String objetivo; 
	public String descricao; 
	public String professor; 
	public List<String> participantes = new ArrayList<String>();
}