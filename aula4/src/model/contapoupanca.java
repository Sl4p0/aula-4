package model;

public class contapoupanca extends conta {
	private double rendimento;
	contapoupanca(String email) {
		super(email);
	this.rendimento = rendimento;
	}

	public String Saque (double valorSaque) {
		if (valorSaque <= saldo) {
		saldo =- valorSaque;
		return (
				"Valor Saque: " + valorSaque
				+"\nValor Depositado Após o Saque: " 
				+ saldo 
				);
		
		} else {  
			return "Saldo Insuficiente";
		}
		
}
    public String Deposito (double valorDeposito) {
    	saldo += valorDeposito + (valorDeposito*rendimento);
    	return ("Valor Sacado; " + valorDeposito
    			+"\nValor Saldo Após o Saque: "
    			+ saldo);
	
}
	
	public double getSaldo () {
		return saldo;
}
	

}
