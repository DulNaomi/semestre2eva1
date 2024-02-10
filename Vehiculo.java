/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Vehiculo {
    //atributos (estado) de la clase 
       /*  
          marca
          modelo
          año
          color
          placas
          valor
      */
  
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double valor;

   public String getmarca(){
       return marca;
   }
   public void setmarca(String valor) {
       marca = valor;
               
   }
   public String getmodelo(){
       return modelo;
   }
   public void setmodelo(String valor) {
       modelo = valor;
}
   public int getannio(){
       return annio;
   }
   public void setannio(int valor) {
       annio = valor;
}
   public String getcolor(){
       return color;
   }
   public void setcolor(String valor) {
       color = valor;
   }
   public double getvalor(){
       return valor;
   }
   public void setvalor(double precio) {
       valor = precio;
   }
}