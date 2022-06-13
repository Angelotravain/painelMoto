
package com.mycompany.motoca;

import javax.swing.JOptionPane;


/**
 *
 * @author Angelo
 */
public class Moto {

     private String marca;
     private String modelo;
     private String cor;
     private String Ano;

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }
     private Integer marcha = 0;
     private Boolean status;
     
     public String Imprimir(){
         String marca1 = String.valueOf(getMarca());
         String modelo1 = String.valueOf(getModelo());
         String cor1 = String.valueOf(getCor());
         String ano1 = String.valueOf(getAno());
         
         String motoDesc =(marca1 =" "+ modelo1+" "+cor1+" "+ano1);
         
         return motoDesc;
     }
     public void Marchamaior(){
         
         if(marcha == 6){
             JOptionPane.showMessageDialog(null, "A moto já está na última marcha");
         }else{
             marcha = marcha + 1;
         }
         
    
}
     
      
     public void Marchamenor(){
        
     
         if(marcha == 0){
             JOptionPane.showMessageDialog(null, "A moto já está no Neutro");
         }else{
             marcha = marcha - 1;
         }
         
    
}
     
     public void Ligarmoto(){
         if(marcha != 0){
             JOptionPane.showMessageDialog(null, "A moto precisa estar no neutra para ligar");
         }else{
             status = true;
         }
     }
     
      public void Desliigarmoto(){
          
             status = false;
         
     }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
     
     public static void main(String[] args){
         
     }

    public void getMarca(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
   
}

