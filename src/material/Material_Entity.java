package material;

public class Material_Entity {
	private String nomeMaterial;
	private int quantidade;
	private String tipoQuantidade;
	private String tipo;
	
	public Material_Entity(String material, int quantidade, String tipoQuantidade, String tipo) {
		this.nomeMaterial = material;
		this.quantidade = quantidade;
		this.tipoQuantidade = tipoQuantidade;
		this.tipo = tipo;
	}
	
	public Material_Entity() {
		
	}

	public String getNomeMaterial() {
		return nomeMaterial;
	}
	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoQuantidade() {
		return tipoQuantidade;
	}

	public void setTipoQuantidade(String tipoQuantidade) {
		this.tipoQuantidade = tipoQuantidade;
	}

}
