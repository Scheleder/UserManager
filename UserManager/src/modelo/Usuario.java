    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author schel
 */
public class Usuario {
// <editor-fold defaultstate="collapsed" desc="Variáveis">

    private  String matricula;
    private  String nome;
    private  String tipo;
    private  String mail;
    private  String grupo;

// </editor-fold>

    public Usuario() {
    }

    public Usuario(String matricula, String nome, String tipo, String mail, String grupo) {
        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.mail = mail;
        this.grupo = grupo;
    }

// <editor-fold defaultstate="collapsed" desc="Getters & Setters">
   
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    // </editor-fold>
}
