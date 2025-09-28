/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.projetointegrador;

/**
 *
 * @author fatec-dsm2
 */
public class ODS {
private String nomeOds;
    private String descricaoOds;
    
    public ODS(String nome, String descricao) {
        this.nomeOds = nome;
        this.descricaoOds = descricao;
    }
    
    public void setNomeOds(String nomeOds){
        this.nomeOds = nomeOds;
    }
    
    public String getNomeOds(){
        return nomeOds;
    }
    
    public void setDescricaoOds(String descricaoOds){
        this.descricaoOds = descricaoOds;
    }
    
    public String getDescricaoOds(){
        return descricaoOds;
    }
    
}
