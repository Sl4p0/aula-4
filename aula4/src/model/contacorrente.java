package model;

public class contacorrente extends conta {
	private double ValorTaxa;

	contacorrente(String email, double ValorTaxa) {
		super(email);
		// TODO Auto-generated constructor stub
		this.ValorTaxa = ValorTaxa;
}
	
	public String Saque (double valorSaque) {
		if (valorSaque + ValorTaxa <= saldo) {
		saldo =- valorSaque;
		saldo =- ValorTaxa;
		return (
				"Valor Sacado: " + valorSaque
				+"\nValor Saldo Após o Saque: " 
				+ saldo 
				);
		
		} else {  
			return "Saldo Insuficiente";
		}
		
}
    public String Deposito (double valorDeposito) {
    	saldo += valorDeposito;
    	return ("Valor Sacado; " + valorDeposito
    			+"\nValor Saldo Após o Saque: "
    			+ saldo);
	
}
	
	public double getSaldo () {
		return saldo;
}
	
}
