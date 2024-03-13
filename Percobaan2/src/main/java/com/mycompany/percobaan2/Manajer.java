/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.percobaan2;

/**
 *
 * @author Lenovo
 */
class Pegawai {
    public String nama;
    public double gaji;
}

public class Manajer extends Pegawai{
  public String departemen;

  public void isiData(String n, String d){
    nama = n;
    departemen = d;
  }
}
