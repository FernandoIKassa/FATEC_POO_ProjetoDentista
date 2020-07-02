package material;

import java.util.LinkedList;
import java.util.List;

import dao.MaterialDAO;
import dao.MaterialImplementa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class Material_Control {
	
	ObservableList<Material_Entity> lista =	FXCollections.observableArrayList();
	
	public void adicionarMaterial(Material_Entity material) {
		MaterialDAO matDAO = new MaterialImplementa();
		matDAO.adicionarMaterial(material);
		lista.add(material);
	}
	
	public void removeMaterial(Material_Entity material) {
		MaterialDAO matDAO = new MaterialImplementa();
		matDAO.removeMaterial(material);
		lista.remove(material);
	}
	
	public void updateMaterial(Material_Entity material) {
		MaterialDAO matDAO = new MaterialImplementa();
		matDAO.updateMaterial(material);
		retornaMaterial();
	}
	
	public Material_Entity pesquisaMaterial(String nome) {
		return null;
		
	}
	
	public void retornaMaterial(){
		this.lista.clear();
		List<Material_Entity> lista = new LinkedList();
		MaterialDAO matDAO = new MaterialImplementa();
		lista = matDAO.mostraMateriais();
		for (Material_Entity material_Entity : lista) {
			this.lista.add(material_Entity);
		}
	}
}
