/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elibede.implementations;

import elibede.database.MySql;
import elibede.interfaces.ReservaDao;
import elibede.model.Reserva;
import elibede.model.Socio;
import elibede.model.SalaSquash;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;

/**
 *
 * @author paulokim
 */
public class ReservaDaoImpl implements ReservaDao{
  public Reserva criarReserva(Date Data, String NroSocio, String NroId) throws SQLException {
    Connection conn = MySql.createConnection();
    PreparedStatement st = conn.prepareStatement("INSERT INTO teste.Reserva (Data, NroSocio, NroId) VALUES (?,?,?);");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String parsedData = sdf.format(Data);
    st.setString(1, parsedData);
    st.setString(2, NroSocio);
    st.setString(3, NroId);
    int createCount = st.executeUpdate();
    System.out.println(createCount);
//    String query = "SELECT * FROM teste.SalaSquash;";
//    ResultSet result = MySql.executeQuery(conn, query);
//    int createCount = MySql.executeUpdate(conn, query);
    Reserva novaReserva = null;
    if (createCount > 0) {
         novaReserva = new Reserva(Data, NroSocio, NroId);
         return novaReserva;
    }

    return novaReserva;
  }

  public SalaSquash getReservasFromSocios(Socio socio) throws SQLException {
    String Codigo = "";
    String Estado = "";
    String NroId = "";
    return new SalaSquash(Codigo, Estado, NroId);
  }
    
}
