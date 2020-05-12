/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.findpass_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class Pass {
    ArrayList<String> passwords;
    
    int total;
    
    
    public Pass (){
        passwords = new ArrayList<>();
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(ArrayList<String> pass) {
        this.passwords = pass;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    

  
    public void loadFile(String file){
        try {      
            long inicio = System.currentTimeMillis();            
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String linha = bf.readLine();    
            int conta = 0;
            char letra;
            while(linha!=null){    
                passwords.add(linha);
                linha=bf.readLine(); 
            }   
            this.setTotal(this.getPasswords().size());
            long fim = System.currentTimeMillis(); 
            System.out.println("\n Tempo decorrido: " + ((fim - inicio)/1000) + " segundos.");
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        } 
    }
}
