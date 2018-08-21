/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1md2;

/**
 *
 * @author SMK TELKOM
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus BusMini=new Bus();
        BusMini.penumpang=5;
        BusMini.MaxPenumpang=15;
        BusMini.cetak();
        
        BusMini.penumpang=BusMini.penumpang+5;
        BusMini.cetak();
        
        BusMini.penumpang=BusMini.penumpang -2;
        BusMini.cetak();
        
        BusMini.penumpang=BusMini.penumpang +8;
        BusMini.cetak();
    }
}
