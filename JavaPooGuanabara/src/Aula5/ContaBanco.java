package Aula5;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String Dono;
	private float saldo;
	private Boolean status;
	
	public void estadoAtual(){
		System.out.println("---------------------------------------");
		System.out.println("Numero da conta:"+ this.getnumConta());
		System.out.println("Tipo:"+ this.gettipo());
		System.out.println("Dono:"+ this.getDono());
		System.out.println("Saldo:"+ this.getSaldo());
		System.out.println("Statuis:"+ this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.settipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.saldo = 50;
		} else if (t == "CP"){
			this.saldo = 150;
		}
		System.out.println("Conta aberta com sucesso");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada por que ainda tem saldo");
		}else if (this.saldo < 0) {
			System.out.println("Conta não pode ser fechada pois ainda tem débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depótio realizado na conta de:" + this.getDono());
		}else {
			System.out.println("impossivel depositar em uma conta fechada!");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()){
		   if (this.saldo >= v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque relizado na conta de:" + this.getDono());
	       }else {
	    	   System.out.println("Saldo insuficiente para saque");
	       }
		}else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if (this.gettipo() == "CC") {
			v = 12;
		}else if (this.gettipo()== "CP"){
			v = 20;
		}
		if (this.getStatus()){
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso" + this.getDono());
		}else {
			System.out.println("Impossivel pagar uma conta fechada");		}
	}	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public int getnumConta() {
		return numConta;
	}
	public void setnumConta(int numConta) {
		this.numConta = numConta;
	}
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return Dono;
	}
	public void setDono(String Dono) {
		this.Dono = Dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
