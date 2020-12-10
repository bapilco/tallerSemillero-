package com.clearminds.bapb.servicios;

import java.sql.*;

import com.clearminds.bapb.bdd.*;

public class ServicioBase {

	private Connection conexion;

	public void abrirConexion() {
		ConexionBDD con = new ConexionBDD();
		conexion = con.obtenerConexion();

	}

	public void cerrarConexion() {
		if (conexion != null) {
			try {
				this.conexion.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error al cerrar la conexion");
			}
		}else{
			System.out.println("No existe conexion");
		}
		
	}

}
