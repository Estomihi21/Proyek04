/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyekakhir.proyek_04;

/**
 *
 * @author Estomihi R Sirait
 */
public class Transaksi {
    
    private String ID_transaksi;
    Date Borrowed;
    Date Returned;
    
    public Transaksi(String ID_transaksi, Date Borrowed, Date Returned){
        this.Borrowed = Borrowed;
        this.ID_transaksi = ID_transaksi;
        this.Returned = Returned;
    }
    
    public void Validate(){
        this.ID_transaksi = ID_transaksi;
    }
}
