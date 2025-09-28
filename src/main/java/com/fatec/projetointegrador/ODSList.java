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
public class ODSList {
    private ArrayList<ODS> odslist;
    
    public ODSList() {
        this.odslist = new ArrayList<>();
    }
    
    public void adicionarODS(ODS novaODS){
        odslist.add(novaODS);
    }
    
    public ArrayList<ODS> getODS(){
        return odslist;
    }
    
    public boolean vazio() {
        return odslist.isEmpty();
    }
}


