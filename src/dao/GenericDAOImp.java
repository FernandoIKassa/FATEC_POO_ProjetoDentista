package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenericDAOImp {
	private static final String URL = "jdbc:mariadb://localhost:3306/materiais";
	private static final String USER = "root";
	private static final String PASS = "";

	Connection con;

	public GenericDAOImp() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASS);	
			System.out.println("Classe carregada com sucesso");
			System.out.println("Conexão criada");
		} catch (ClassNotFoundException e) { 
			System.out.println("Problema ao carregar a classe do banco de dados");
		}	catch (SQLException e) { 
			System.out.println("Erro ao conectar no banco de dados");
		}

	}
}
