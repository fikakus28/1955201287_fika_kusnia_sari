/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class program_hari {
    public static void main(String[] args) {
     
        String hariLhr[] = new String [7];
        for(int i=0; i<hariLhr.length;i++){
            hariLhr[i] = JOptionPane.showInputDialog(null,"inputkan hari lahir ke" + i);
        System.out.println(hariLhr[i]);
        }
        
    String carihari = JOptionPane.showInputDialog(null,"cari hari lahir");
        
        for(int i=0; i<hariLhr.length;i++){
            if (hariLhr[i].equals(carihari)){
        JOptionPane.showMessageDialog(null,"Hari lahir yang anda cari adalah" + carihari + " terdapat pada indeks ke " + i);
    
            }
        }
     }
}