package com.mx.everis.taller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.mx.everis.taller.model.Persona;
import com.mx.everis.taller.util.DbUtil;

public class PersonaDao {

	private Connection connection;

	public PersonaDao() {
		connection = DbUtil.getConnection();
	}

	public void addPerson(String nombre,String apellidos,String logros) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into persona(nombre,apellidos,logros) values (?, ?, ? )");
			// Parameters start with 1
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, apellidos);
			preparedStatement.setString(3, logros);
			
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletePerson(int Id) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from Persona where id=?");
			// Parameters start with 1
			preparedStatement.setInt(1, Id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updatePerson(String nombre,String apellidos,String logros,int id) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("update persona set nombre=?, apellidos=?,  logros=?" +
							"where id=?");
			// Parameters start with 1
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, apellidos);
			preparedStatement.setString(3, logros);
			preparedStatement.setInt(4, id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Persona> getAllPerson() {
		ArrayList<Persona> users = new ArrayList<Persona>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Persona");
			while (rs.next()) {
				Persona user = new Persona();
				user.setId(rs.getInt("id"));
				user.setNombre(rs.getString("nombre"));
				user.setApellidos(rs.getString("apellidos"));
				user.setLogros(rs.getString("logros"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}
	

}
