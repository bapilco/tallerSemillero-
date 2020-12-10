package com.clearminds.bapb.bdd;

import java.sql.*;

public class TestConexion {

	public static void main(String[] args) {

		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if (conexion != null) {
				System.out.println("Conexion exitosa");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
