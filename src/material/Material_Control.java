package material;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Material_Control {
	
	ObservableList<Material_Entity> lista =	FXCollections.observableArrayList();
	
	public void adicionarMaterial(Material_Entity material) {
		lista.add(material);
	}
	
	public void removeMaterial() {
		
	}
	
	public Material_Entity pesquisaMaterial(Material_Entity material) {
		return null;
	}
	
	public void retornaMaterial(){
		Material_Entity mat1 = new Material_Entity("luva", 10, "unid", "Descart�vel");
		Material_Entity mat2 = new Material_Entity("m�scara", 20, "unid", "Descart�vel");
		Material_Entity mat3 = new Material_Entity("anestesia", 1,"ml", "Descart�vel");
		
		lista.addAll(mat1, mat2, mat3);
	}
}
