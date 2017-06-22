package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BD {

	private Connection connexio;
	
	
	public BD() {
	}
	public Connection Conectar(){
		Connection cn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/deprueba","root","");
		}catch(Exception e){
			e.printStackTrace();
		}
		 return cn;
	}
	public Connection getConnexio() {
		return connexio;
	}
	public void setConnexio(Connection connexio) {
		this.connexio = connexio;
	}
}