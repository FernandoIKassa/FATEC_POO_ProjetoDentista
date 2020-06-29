package material;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class Material_Control {
	
	ObservableList<Material_Entity> lista =	FXCollections.observableArrayList();
	
	public void adicionarMaterial(Material_Entity material) {
		lista.add(material);
	}
	
	public void removeMaterial(Material_Entity material) {
		lista.remove(material);
		System.out.println("ASDFASDFASDF");
	}
	
	public Material_Entity pesquisaMaterial(Material_Entity material) {
		return null;
	}
	
	public void retornaMaterial(){
		Material_Entity mat1 = new Material_Entity("luva", 10, "unid", "Descartável");
		Material_Entity mat2 = new Material_Entity("máscara", 20, "unid", "Descartável");
		Material_Entity mat3 = new Material_Entity("anestesia", 1,"ml", "Descartável");
		
		lista.addAll(mat1, mat2, mat3);
	}
}
