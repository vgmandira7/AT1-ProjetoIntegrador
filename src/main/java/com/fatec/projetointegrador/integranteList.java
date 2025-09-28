/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.projetointegrador;
import java.util.ArrayList;
/**
 *
 * @author fatec-dsm2
 */
   
public class integranteList {
    private ArrayList<integrante> integrantes;

    public integranteList() {
        this.integrantes = new ArrayList<>();
    }

    public void adicionarIntegrante(integrante integrante) {
        integrantes.add(integrante);
    }

    public ArrayList<integrante> getIntegrantes() {
        return integrantes;
    }

    public boolean vazio() {
          return integrantes.isEmpty();
    }
}