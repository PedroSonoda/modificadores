package modificadores;

class Endereco {

	public class Endereço {
		  private String rua;
		   private int num;
		   private String bairro;
		   private String CEP;
		   private Cidade cidade;
		   
		   public Endereço (String rua,int num, String bairro, String CEP,String Cidade, Cidade cidade) {
			   this.rua = rua;
			   this.num = num;
			   this.bairro = bairro;
			   this.CEP = CEP;
			   this.cidade = cidade;
		   }
		 
		   public String getrua() {
			   return rua;
		   }
		   public void setrua (String Rua) {
			   this.rua = Rua;
		   }
		   public int getnum() {
			   return num;
		   }
		   public void setnum (int num) {
			   this.num = num;
		   }
		   public String getbairro() {
			   return bairro;
		   }
		   public void setbairro (String bairro) {
			   this.bairro = bairro;
		   }
		   public String getCEP() {
			   return CEP;
		   }
		   public void setCEP (String CEP) {
			   this.CEP = CEP;
		   }
		   public Cidade getcidade (){
			   return cidade;
		   }
		   public void setcidade (Cidade cidade) {
			   this.cidade = cidade;
		   }
}}
