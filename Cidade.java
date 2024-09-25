package modificadores;

class Cidade {
	
	  private String nome;
	   private Estado estado;
	   
	   public Cidade (String nome, Estado estado) {
		   this.estado = estado;
		   this.nome = nome;
	   }
	   
	   public String getnome() {
		   return nome;
	   }
	   public void setrua (String nome) {
		   this.nome = nome;
	   }
	   public Estado getestado() {
		   return estado;
	   }
	   public void setestado (Estado estado) {
		   this.estado = estado;
	   }
}
