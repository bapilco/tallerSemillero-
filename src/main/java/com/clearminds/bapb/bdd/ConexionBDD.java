package com.clearminds.bapb.bdd;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ConexionBDD {

	/*public String leerPropiedad(String nombre) {

		try {
			Properties p = new Properties();
			p.load(new FileReader(
					"D:/BRYAN/CAPACITACIONCMC/ProyectosGIT/Taller/tallerSemillero-/src/main/java/properties/config.properties"));
			String nombre1 = p.getProperty("nombre");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}*/

	public static Connection obtenerConexion() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Properties p = new Properties();
			p.load(new FileReader(
					"D:/BRYAN/CAPACITACIONCMC/ProyectosGIT/Taller/tallerSemillero-/src/main/java/properties/conexion.properties"));
			String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url = p.getProperty("urlConexion");
			String user = p.getProperty("usuario");
			String pass = p.getProperty("password");
			try {
				System.out.println("Connecting to a selected database...");
				conn = DriverManager.getConnection(url, user, pass);
				System.out.println("Connected database successfully...");
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
