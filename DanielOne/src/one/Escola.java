package one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Escola {
	
    private String nome, CNPJ;
    private Endereco endereco;
    private List<Departamento> departamentos;
    private List<Aluno> discentes;

    public Escola(String nome, String CNPJ, Endereco endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.departamentos = new ArrayList<>();
        this.discentes = new ArrayList<>();
    }
    
    public List<Departamento> getDepartamentos() {
    	return departamentos;
    }
    
    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento(nomeDepartamento));
    }
    
    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }
    
    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }
    
    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }
    
    public void agruparAlunos() {
        Map<Naturalidade, List<Aluno>> agrupamento=
        discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
        System.out.println("Resultado do agrupamento por naturalidade: ");
        agrupamento.forEach((Naturalidade chave, List<Aluno> lista)->System.out.println(chave+" = "+lista));
    }
    
    public String toString() {
    	return String.format("Nome: %s, CNPJ: %s, Endereço: %s", this.nome, this.CNPJ, this.endereco.logradouro + " - " + this.endereco.numero);
    }
}
