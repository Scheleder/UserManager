/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

public class TestaConexao {

    private static Connection con = null;
    
    public static void testa(){
        con = ConnectionFactory.getConnection();
        System.out.println("Conexão aberta!");

        ConnectionFactory.closeConnection(con);
        System.out.println("Conexão fechada!");
    }
}
