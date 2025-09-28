/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.projetointegrador;

/**
 *
 * @author fatec-dsm2
 */
public class integrante {
    private String nomeIntegrante;
    private String emailIntegrante;

    public integrante(String nome, String email) {
        this.nomeIntegrante = nome;
        this.emailIntegrante = email;
    }

    public String getNomeIntegrante() {
        return nomeIntegrante;
    }

    
    public void setNomeIntegrante(String nome) {
        this.nomeIntegrante = nome; 
    }

    public String getEmailInstitucional() {
        return emailIntegrante;
    }

    
    public void setEmailInstitucional(String emailInstitucional) {
        this.emailIntegrante = emailInstitucional;
    }
}
