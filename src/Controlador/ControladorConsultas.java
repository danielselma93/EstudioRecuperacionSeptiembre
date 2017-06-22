package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import Modelo.BD;
import Modelo.Usuario;

public class ControladorConsultas {

	public ControladorConsultas() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Usuario> rellenaTabla(){
		BD bd = new BD();
		Connection cn =bd.Conectar();
		ArrayList<Usuario> al = new ArrayList<Usuario>();
		String consulta = "SELECT * FROM usuario";
		PreparedStatement ps;
		ResultSet rs;
		String nombre,apellido;
		int edad;
		rs=null;
		ps=null;
		try {
			ps=cn.prepareStatement(consulta);
			rs=ps.executeQuery();
			while (rs.next()){
				nombre=rs.getString(1);
				apellido=rs.getString(2);
				edad=rs.getInt(3);
				Usuario e = new Usuario (nombre, apellido,edad);
				al.add(e);
			}
		}catch(Exception e){
		
		}
		return al;	
	}
	public ArrayList<Usuario> rellenaLista(){
		String nombre,apellido;
		int edad;
		BD bd = new BD();
		ArrayList <Usuario> al = new ArrayList<Usuario>();
		Connection cn = bd.Conectar();
		String consulta="SELECT * FROM usuario";
		ResultSet rs;
		rs=null;
		PreparedStatement ps;
		ps=null;
		try{
			ps= cn.prepareStatement(consulta);
			rs= ps.executeQuery();
			while(rs.next()){
				nombre=rs.getString(1);
				apellido=rs.getString(2);
				edad=rs.getInt(3);
				Usuario e = new Usuario(nombre, apellido, edad);
				al.add(e);
			}
		}catch(Exception e){
			
		}
		return al;
	}
	public void insertarDatos(String nombre, String apellido, int edad){
	
		BD bd = new BD();
		Connection cn = bd.Conectar();
		try{
			
		PreparedStatement pat = cn.prepareStatement("INSERT INTO usuario (nombre, apellido, edad) VALUES (?, ?, ?)");
		pat.setString(1, nombre);
		pat.setString(2, apellido);
		pat.setInt(3, edad);
		pat.execute();
		  if(pat.executeUpdate()==1){
		       System.out.println("fila insertada correctamente");
		     }

		}catch(SQLException ex){
			
		}
		}
	public void borrarRegistro (String nombre){
		BD bd = new BD();
		
		Connection cn = bd.Conectar();
		try{
			PreparedStatement ps = cn.prepareStatement("DELETE FROM usuario WHERE nombre=(?)");
			ps.setString(1, nombre);
			ps.execute();
		}catch(SQLException e){
			
		}
		 
	}
	}
