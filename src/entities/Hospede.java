package entities;

public class Hospede {
	private String nome;
	private String cpf;
	private int diasHospedado;
	private double gastosDiarios;
	private double valorTotal;

	public Hospede(String nome, String cpf, int diasHospedado) {
		this.nome = nome;
		this.cpf = cpf;
		this.diasHospedado = diasHospedado;
		this.valorTotal = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDiasHospedado() {
		return diasHospedado;
	}

	public void setDiasHospedado(int diasHospedado) {
		this.diasHospedado = diasHospedado;
	}

	public double getGastosDiarios() {
		return gastosDiarios;
	}

	public void setGastosDiarios(double gastosDiarios) {
		this.gastosDiarios = gastosDiarios;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal += valorTotal;
	}

	@Override
	public String toString() {
		return "Hospede: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nValor Total: $" + this.getValorTotal();
	}

	
	
}
