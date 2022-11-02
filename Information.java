package Info;

public class Information {
	
	private int conta;
	public String name;
	public double valor;
	
	
	


	public Information(int conta, String name) {
		super();
		this.conta = conta;
		this.name = name;
	}



	public Information(int conta, String name, double inicial) {
		this.conta = conta;
		this.name = name;
		desposit(inicial);
	}
	
	
	
	public int getConta() {
		return conta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValor() {
		return valor;
	}
	
	public void desposit(double deposito) {
		this.valor += deposito;
	}
	
	public void saq(double depo) {
		this.valor -= depo + 5.0;
	}
	
	
	@Override
	public String toString() {
		return "Account: "
				+  conta
				+ " ,Holder: "
				+ name 
				+ ","
				+ " Balance "
				+ " $ "
				+ valor ;
	}
	
	
	
	
}
