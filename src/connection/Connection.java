/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carlos
 */
public class Connection {
 private final String driver;
    private final String user;
    private final String pdw;
    private final String url;
    private final String ip;
    private final String puerto;
    private final String basedatos;
    private java.sql.Connection connection;

    public Connection() {
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.user = "root";
        this.pdw = "root";
        this.url = "jdbc:mysql://";
        this.ip = "127.0.0.1";
        this.puerto = "3306";
        this.basedatos = "nave_espacial";
    }

    public java.sql.Connection getConnection() throws ClassNotFoundException {
        try {

            Class.forName(this.driver);
            connection = DriverManager.getConnection(this.url + this.ip + ":" + puerto + "/"
                    + this.basedatos, this.user, this.pdw);

            System.out.println("Conexion exitosa");
            return connection;
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
       
        return null;
    }
    public static void main(String[] args) {
       
    }
    
}
