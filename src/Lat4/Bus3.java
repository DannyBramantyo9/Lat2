/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat4;

/**
 *
 * @author SMK TELKOM
 */
public class Bus3 {
    public int penumpang;
    public double maxpenumpang;
    public Bus3(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>maxpenumpang){
            System.out.println("Penumpang kelebihan");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("Pass Benar");
        }
        else{
            System.out.println("Pass Salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang :"+penumpang);
        System.out.println("Max penumpang harusnya : "+maxpenumpang);
    }
}

