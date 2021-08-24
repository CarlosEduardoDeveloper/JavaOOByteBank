
public class Clientes implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Clientes() {
		this.autenticador = new AutenticacaoUtil();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
