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
public class Bus {
    private int penumpang;
    private int MaxPenumpang;
    
    public Bus(int MaxPenumpang){
        this.MaxPenumpang=MaxPenumpang;
        penumpang=0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= MaxPenumpang){
            System.out.println("Penumpang melebihi kuota!");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah : "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah : "+MaxPenumpang);
    }
}
