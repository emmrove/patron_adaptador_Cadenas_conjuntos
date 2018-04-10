/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author emmro
 */
public class Cadenas {
    private String cade1 = "";
    private String cade2 = "";
    public Cadenas(String cadena1, String cadena2){
        this.cade1 = cadena1;
        this.cade2 = cadena2;
    }
    public void setCade1(String cadena1){
        this.cade1 = cadena1;
    }
    public String getCade1(){
        return cade1;
    }
    public String getCade2(){
        return cade2;
    }
    public void setCade2(String cadena2){
        this.cade2 = cadena2;
    }
}
