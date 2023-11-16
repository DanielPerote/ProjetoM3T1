package one;

public class Start {
	
	public static void main(String[] args) {

		Endereco enderedoDaEscola = new Endereco("Rua Um", 500, "Violete", "Itapipoca");
		Escola escola = new Escola("Júlia Geracina de Mello", "123123123", enderedoDaEscola);

		escola.criarDepartamento("Secretaria");
		escola.criarDepartamento("Cantina");
		escola.criarDepartamento("Esportes");
		escola.criarDepartamento("Direção");
		
		for (Departamento departamento : escola.getDepartamentos()) {
    		if (departamento.nomeDepartamento.equals("Esportes")) {
    			escola.fecharDepartamento(departamento);
    			break;
    		}
    	}
		
		//System.out.println(escola.getDepartamentos().toString());
		
		escola.matricularAluno(new Aluno("Márcio Gomes", Naturalidade.SaoPaulo));
		escola.matricularAluno(new Aluno("César Augusto", Naturalidade.SaoPaulo));
		escola.matricularAluno(new Aluno("Castelo Branco", Naturalidade.SaoPaulo));
		
		escola.matricularAluno(new Aluno("Marco Antônio", Naturalidade.RioDeJaneiro));
		escola.matricularAluno(new Aluno("Clara Silva", Naturalidade.RioDeJaneiro));
		
		escola.matricularAluno(new Aluno("Alejandra Gomez", Naturalidade.Madri));
		escola.matricularAluno(new Aluno("Marcos Cintra", Naturalidade.Sorocaba));
		escola.matricularAluno(new Aluno("João Carlos", Naturalidade.Sorocaba));
		
		escola.matricularAluno(new Aluno("Ana Beatriz", Naturalidade.BarraDoPirai));
		
		
		escola.agruparAlunos();
		
	}
}
