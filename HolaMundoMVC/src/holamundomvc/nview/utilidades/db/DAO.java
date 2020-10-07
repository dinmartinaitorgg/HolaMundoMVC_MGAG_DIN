/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.nview.utilidades.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author Martin & Aitor
 */
public class DAO {

    // Attributes
    private Connection con = null;
    private Properties props;
    private Statement stmt = null;

    // The next attributes are used to gather values of the configuration file
    private ResourceBundle configFile;
    private String driverBD;
    private String urlDB;
    private String userBD;
    private String passwordDB;

    public DAO() {

        // We will use the file config (control package) for the connection
        this.configFile = ResourceBundle.getBundle("holamundomvc.nview.utilidades.db.config");
        this.driverBD = this.configFile.getString("Driver");
        this.urlDB = this.configFile.getString("Conn");
        this.userBD = this.configFile.getString("DBUser");
        this.passwordDB = this.configFile.getString("DBPass");
    }

    private void conectar() throws Exception {
        try {
            Class.forName(this.driverBD);
            con = DriverManager.getConnection(this.urlDB, this.userBD, this.passwordDB);
        } catch (SQLException e) {
            throw new Exception("Error de SQL al conectar " + e.getMessage());
        }
    }

    private void desconectar() throws Exception {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new Exception("Error de SQL al desconectar " + e.getMessage());
        }
    }
    
    public String getSaludo () throws Exception{
        /**
         * Method to obtain the greeting from the db
         */
        this.conectar();
        stmt=con.createStatement();
        String greeting = null;
        String select = "select holamundo from saludo;";
        ResultSet rs = stmt.executeQuery(select);
        
        while(rs.next()){
         greeting = rs.getString("holamundo");
        }
        this.desconectar();
        return greeting;
    }

    
    }
