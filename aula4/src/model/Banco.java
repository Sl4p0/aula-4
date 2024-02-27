package model;

public class Banco {
private String nome_banco;
private String certificado_autorizacao;

public String getnomebanco() {
	return nome_banco;
}

public String certificadoautorizacao() {
	return certificado_autorizacao;
}

public void setnomebanco (String Nome) {
	this.nome_banco = Nome;
}

public void setcertificadoautorizacao (String Certificado) {
this.certificado_autorizacao = Certificado;

}

}
