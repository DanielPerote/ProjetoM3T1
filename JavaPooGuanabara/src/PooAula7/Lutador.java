package PooAula7;

public class Lutador {
	private String nome;
	private String nascionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public void apresentar() {
		System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNascionalidade());
		System.out.println("Com "+ this.getIdade()+ " anos e "+ this.getAltura()+"\nPesando \n" + this.getPeso()+"KG "+"com "+ ( this.getVitorias()+" Vitórias \n"+ (this.getDerrotas())+ " Derrotas e"));
		if (this.getEmpates() <= 1) System.out.println(this.getEmpates()+ " empate");{
	    if (this.getEmpates()>1 ) System.out.println(this.getEmpates()+ " empates");
		}
	}
	public void status() {
		System.out.println(this.getNome()+ " É um peso "+ this.getCategoria());
		System.out.println("Ganhou "+ this.getVitorias()+ " vezes");
		System.out.println("Perdeu "+ this.getDerrotas()+ " vezes e");
		
		if (this.getEmpates() <=1) System.out.println ("empatou "+ (this.getEmpates()+ " vez"));{
		if (this.getEmpates()>1 ) System.out.println("empatou "+ this.getEmpates()+ " vezes");
		}
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1	);
	}
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nascionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNascionalidade() {
		return nascionalidade;
	}
	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.5) {
		    this.categoria = "Inval";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {this.categoria = "Invalido";
	}
}

	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
