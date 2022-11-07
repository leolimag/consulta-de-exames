package model;

public class JavaBeans {
	private String id; 
	private String nomePaciente;
	private String nomeExame;
	private String resultado;
	private String data;
	
	public JavaBeans(String id, String nomePaciente, String nomeExame, String resultado, String data) {
		super();
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.nomeExame = nomeExame;
		this.resultado = resultado;
		this.data = data;
	}
	public JavaBeans() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
