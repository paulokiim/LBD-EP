/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elibede;

import elibede.model.Sala;
import elibede.model.Socio;
import elibede.model.Reserva;
import elibede.implementations.SalaDaoImpl;
import elibede.implementations.SalaSquashDaoImpl;
import elibede.implementations.SocioDaoImpl;
import elibede.implementations.ReservaDaoImpl;

import java.util.Scanner;
import java.util.Date;
import java.sql.*;

/**
 *
 * @author paulokim
 */
public class ELIBEDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e){
            System.out.print("Driver não encontrado");
        }
//        Scanner sc = new Scanner(System.in);
//        SocioDaoImpl socioImplement = new SocioDaoImpl();
//        Socio novoSocio = socioImplement.criarSocio("1", "Ronaldo Fenomeno", "90909090", "Rua Rua", "Professor de LBD", "RYCO");
//        System.out.println(novoSocio.getNome());
//        SalaDaoImpl salaImplement = new SalaDaoImpl();
//        Sala sala = new Sala("1", "2", "3");    
//        System.out.println(sala.getNroId());
//        Sala foi = salaImplement.criarSala("3", "2", "1");
//        System.out.println(foi.getNroId());
//        SalaSquashDaoImpl salaSquashImplement = new SalaSquashDaoImpl();
//        int result = salaSquashImplement.criarSalaSquash("1", "2", "1");
//        System.out.println(result);
        ReservaDaoImpl reservaImplement = new ReservaDaoImpl();
        Reserva reserva = reservaImplement.criarReserva(new Date(), "1", "3");
        System.out.println(reserva.getData());
//        String resp = "";
//        while (resp != "1" || resp != "2" || resp != "3") {
//            System.out.println("1- Verificar disponibilidade de sala de squash\n2- Verificar reservas por socio\n3- Menu de criacao\n");
//            resp = sc.nextLine();
//        }
//        switch(resp) {
//            case "1":
//                SalaSquashDaoImpl salaSquashImplement = new SalaSquashDaoImpl();
//                List<SalaSquash> salaSquashDisponivel = salaSquashImplement.getSalasDisponiveis();
//                
//            case "2":
//                //Faca outro algo
//            case "3":
//                System.out.println("1- Criar sala\n2- Criar sala de squash\n3- Criar socio\n4- Criar reserva\n");
//            default:
//                return;
//        }
    }
    
}
