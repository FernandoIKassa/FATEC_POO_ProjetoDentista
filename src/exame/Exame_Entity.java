package exame;

import java.util.Date;

import funcionario.Funcionario_Entity;
import paciente.Paciente_Entity;

public class Exame_Entity {
	private String nomeExame;
	private String empresaFornecedora;
	private String tipoExame;
	private Date dataPedido;
	private Funcionario_Entity dentista;
	private Paciente_Entity nomePaciente;
	
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public String getEmpresaFornecedora() {
		return empresaFornecedora;
	}
	public void setEmpresaFornecedora(String empresaFornecedora) {
		this.empresaFornecedora = empresaFornecedora;
	}
	public String getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Funcionario_Entity getDentista() {
		return dentista;
	}
	public void setDentista(Funcionario_Entity dentista) {
		this.dentista = dentista;
	}
	public Paciente_Entity getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(Paciente_Entity nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
}
