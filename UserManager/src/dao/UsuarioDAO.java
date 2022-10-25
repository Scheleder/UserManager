/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD
public class UsuarioDAO {

    private Connection con = null;

    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }

    public List<Usuario> read(String tipo) {

        String SQL = "SELECT * FROM auditoria." + tipo + " ";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.clear();
        try {
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setMatricula(rs.getString("matricula"));
                usuario.setNome(rs.getString("nome"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setMail(rs.getString("mail"));
                usuario.setGrupo(rs.getString("grupo"));
                if (!"0".equals(usuario.getMatricula())) {
                    usuarios.add(usuario);
                }
            }

        } catch (SQLException ex) {
            System.err.println("Erro linha 51 " + tipo + " - " + ex);
            System.out.println("SQL: " + SQL);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;
    }

    public boolean delete(String tipo, String mat) {
        String SQL = "DELETE FROM auditoria." + tipo + " WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, mat);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro linha 69 " + tipo + " - " + mat + " - " + ex);
            System.out.println("SQL: " + SQL);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean resetSenha(String tipo, String mat) {
        String SQL = "UPDATE auditoria." + tipo + " SET senha = '00000' WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, mat);

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro linha 87 " + tipo + " - " + mat + " - " + ex);
            System.out.println("SQL: " + SQL);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean update(String tipo, String nome, String matricula, String mail, String grupo) {
        String SQL = "UPDATE auditoria." + tipo + " SET nome = ?, mail= ?, grupo=? WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, nome);
            stmt.setString(2, mail);
            stmt.setString(3, grupo);
            stmt.setString(4, matricula);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro linha 109 " + tipo + " - " + matricula + " - " + ex);
            System.out.println("SQL: " + SQL);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean save(String tipo, String nome, String matricula, String mail, String grupo) {
        String SQL = "INSERT INTO auditoria." + tipo + "(matricula,nome,mail,tipo,grupo) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(SQL);
            stmt.setString(1, matricula);
            stmt.setString(2, nome);
            stmt.setString(3, mail);
            stmt.setString(4, tipo);
            stmt.setString(5, grupo);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro linha 129 " + tipo + " - " + matricula + " - " + ex);
            System.out.println("SQL: " + SQL);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
