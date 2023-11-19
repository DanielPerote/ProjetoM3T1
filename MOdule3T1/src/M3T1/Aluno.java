package M3T1;

public class Aluno {
	
	String nome;
	Naturalidade naturalidade;
	
	public Aluno(String nome, Naturalidade naturalidade) {
		this.nome = nome;
		this.naturalidade = naturalidade;
	}
	
	Naturalidade recuperarNaturalidade() {
		return this.naturalidade;
	}
	
	public String toString() {
		return String.format("%s (%s)", nome, naturalidade.toString());
	}
}
