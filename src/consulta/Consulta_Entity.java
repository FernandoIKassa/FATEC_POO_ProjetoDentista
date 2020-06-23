package consulta;

import java.util.Date;

import funcionario.Funcionario_Entity;
import paciente.Paciente_Entity;

public class Consulta_Entity {
	private String tipoOperacao;
	private Date dataConsulta;
	private String horaConsulta;
	private Paciente_Entity nomePaciente;
	private Funcionario_Entity nomeDentista;
	
	
	public String getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getHoraConsulta() {
		return horaConsulta;
	}
	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	public Paciente_Entity getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(Paciente_Entity nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public Funcionario_Entity getNomeDentista() {
		return nomeDentista;
	}
	public void setNomeDentista(Funcionario_Entity nomeDentista) {
		this.nomeDentista = nomeDentista;
	}
	
	
}
