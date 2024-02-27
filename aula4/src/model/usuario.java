package model;

public class usuario {
private String Nome, CPF, Celular, Email, Senha;

private boolean EstaLogado = false;

usuario (String Nome, String Celular, String Email, String Senha, String CPF) {
	this.Nome = Nome;
	this.CPF = CPF;
	this.Celular = Celular;
	this.Email = Email;
	this.Senha = Senha;
	
			
}

void Autenticacao(String Email, String Senha) {
	if(this.Email == Email
		  && this.Senha == Senha) {
		EstaLogado = true;
	}
}
	
public String getUsuario () {
	return (
			"\nNome" + this.Nome
		  + "\nCPF" + this.CPF
		  +"\nCelular" + this.Celular
		  +"\nEmail" + this.Email
		  +"\nSenha" + this.Senha
		  +"\nEstaLogado" + this.EstaLogado
		  );
						
}
}
