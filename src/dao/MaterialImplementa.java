package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import material.Material_Entity;

public class MaterialImplementa implements MaterialDAO {

	private Connection con;

	public MaterialImplementa() {
		GenericDAOImp genericDAO = new GenericDAOImp();
		con = genericDAO.con;
	}

	@Override
	public void adicionarMaterial(Material_Entity c) {
		try {
			String sql = "INSERT INTO material (material, tipoMaterial, quantidade, tipoQuantidade) " +
					"VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, c.getNomeMaterial());
			stmt.setString(2, c.getTipo());
			stmt.setInt(3, c.getQuantidade());
			stmt.setString(4, c.getTipoQuantidade());
			stmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	@Override
	public void removeMaterial(Material_Entity material) {
		try {
			String sql = "DELETE FROM material WHERE codMaterial=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, material.getCodigoMaterial());
			stmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	
	@Override
	public void updateMaterial(Material_Entity c) {
		
		try {
			String sql = "UPDATE material SET material = ?, tipoMaterial = ? , quantidade = ?, tipoQuantidade = ? "
					+ "WHERE codMaterial = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getNomeMaterial());
			ps.setString(2, c.getTipo());
			ps.setInt(3, c.getQuantidade());
			ps.setString(4, c.getTipoQuantidade());
			ps.setInt(5, c.getCodigoMaterial());
			
			ps.execute();
			ps.close();
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println(e);
		}
	}

	@Override
	public List<Material_Entity> mostraMateriais() {
		List<Material_Entity> lista = new LinkedList();
		try {
			String sql = "SELECT * FROM material ";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) { 
				Material_Entity c = new Material_Entity();
				c.setCodigoMaterial(rs.getInt("codMaterial"));
				c.setNomeMaterial(rs.getString("material"));
				c.setTipo(rs.getString("tipoMaterial"));
				c.setQuantidade(rs.getInt("quantidade"));
				c.setTipoQuantidade(rs.getString("tipoQuantidade"));
				lista.add(c);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return lista;

	}

	@Override
	public Material_Entity pesquisarMaterial(String Nome) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
