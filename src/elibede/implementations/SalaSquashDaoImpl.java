/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elibede.implementations;

import java.sql.*;
import elibede.interfaces.SalaSquashDao;
import elibede.model.SalaSquash;
import elibede.database.MySql;
import elibede.model.Socio;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author paulokim
 */
public class SalaSquashDaoImpl implements SalaSquashDao{
  public SalaSquash criarSalaSquash(String Codigo, String Estado, String NroId) throws SQLException {
    Connection conn = MySql.createConnection();
    String query = String.format("INSERT INTO teste.SalaSquash (Codigo, Estado, NroId) VALUES ('%s','%s','%s')", Codigo, Estado, NroId);
    System.out.println(query);
    int createCount = MySql.executeUpdate(conn, query);
    
    SalaSquash novaSalaSquash = null;
    
    if (createCount > 0) {
        novaSalaSquash = new SalaSquash(Codigo, Estado, NroId);
    }

    return novaSalaSquash;
  }
  
  public boolean reservarSalaSquash(Socio socio, String codigo, String data, String hora) throws SQLException{
      return true;
  }
  
  public List<SalaSquash> getSalasDisponiveis() throws SQLException{
    Connection conn = MySql.createConnection();
    String query = "SELECT SS.NroId, R.Hora\n" +
                    "FROM teste.SalaSquash SS\n" +
                    "LEFT JOIN teste.Reserva R\n" +
                    "ON SS.NroId = R.NroId;";
    Statement st = conn.createStatement();
    ResultSet result = st.executeQuery(query);
    
    List<SalaSquash> listaSalaSquash = new ArrayList<SalaSquash>();
    
    while(result.next()) {
        String NroId = result.getString(1);
        String Hora = result.getString(2);
        
        if(Hora == null) {
            
        }
        
    }
    
    return listaSalaSquash;
  }

}
