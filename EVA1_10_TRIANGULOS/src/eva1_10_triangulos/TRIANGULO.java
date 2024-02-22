package eva1_10_triangulos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class TRIANGULO {
    private double base;
    private double altura;
    
    public TRIANGULO (){
        base = -1;
        altura= -1;
    }
        
        public void setbase (double valor){
               base = valor;
        }
        public void setaltura (double valor){
            altura = valor;
        }
                
        public double getbase(){
            return base;
        }

        public double getaltura(){
            return altura;
        }
        private double calculararea(){
            return (base * altura) / 2;
        }
      private double calcularperi(){
          double peri;
          //suma de los 3 lados, falta el lado mayor (hipotenusa)
          //
          peri = 0;
          return peri;
        }   
}