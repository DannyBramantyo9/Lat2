/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat2;

/**
 *
 * @author SMK TELKOM
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus BusBesar=new Bus(40);
        BusBesar.cetak();
        
        BusBesar.addpenumpang(15);
        BusBesar.cetak();
        
        BusBesar.addpenumpang(5);
        BusBesar.cetak();
        
        BusBesar.addpenumpang(26);
        BusBesar.cetak();
    }
}
