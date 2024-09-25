package modificadores;

class Animal {

	private String nome;
	 private String cor;
	 private String tamanho;
	 private String peso;
	 private String raca;
	protected  String getNome () {
		return nome;
	}
	protected void setNome (String nome) {
		this.nome = nome;
	}
	 String getCor () {
		return cor;
	}
	protected void setCor (String cor) {
		this.cor = cor;
	}
	
	protected String getTamanho () {
		return tamanho;
	}
	protected void setTamanho(String Tamanho) {
		this.tamanho = Tamanho;
	}
	
	protected String getpeso() {
		return peso;
	}
	protected void setpeso (String peso) {
		this.peso = peso;
	}
	

	protected String getraca () {
		return raca;
	}
	protected  void setraca (String raca) {
		this.raca = raca;
	}
	
}
