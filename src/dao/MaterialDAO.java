package dao;

import java.util.List;

import material.Material_Entity;

public interface MaterialDAO {
	void  adicionarMaterial (Material_Entity material);
	void removeMaterial(Material_Entity material);
	Material_Entity pesquisarMaterial(String Nome);
    List<Material_Entity> mostraMateriais();
	void updateMaterial(Material_Entity material);
}
