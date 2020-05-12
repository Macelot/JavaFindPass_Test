/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.findpass_test;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pass pass = new Pass();
        pass.loadFile("passwords.txt");
        System.out.println("Temos "+pass.getPasswords().size()+" senhas");
        
        PassTest pt;
        pt = new PassTest();
        pt.deveriaAchar();  
        
    }
    
}
