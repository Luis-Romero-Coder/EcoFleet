/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecofleet.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Coder
 */
public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base";
    private static final String USER = "LHRC";
    private static final String PASS = "Luis1234.";
    
    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e){
            throw new SQLException("No se encontro el driver de mysql" + e);
        }
    }
}
