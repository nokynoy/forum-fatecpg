package br.com.alura.forum.config.validacao;

public class ErroDeFormDTO {
	private String campo;
	private String erro;
	
	
	public ErroDeFormDTO(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}
	
	public String getCampo() {
		return campo;
	}
	public String getErro() {
		return erro;
	}
	
	

}
