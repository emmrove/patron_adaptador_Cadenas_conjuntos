/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author emmro
 */
public class Test {
    public static void main(String[] args){
        String caden1 = JOptionPane.showInputDialog("Ingresa la cadena 1");
        String caden2 = JOptionPane.showInputDialog("Ingresa la cadena 2");
        Adaptador prueba = new Adaptador();
        System.out.println("Cadena 1");
        System.out.println(caden1);
        System.out.println("Cadena 2");
        System.out.println(caden2);
        System.out.println("-----------------------");
        System.out.println("Operaciones de conjuntos");
        System.out.println("-----------------------");
        System.out.println("Union        --> " + 
                prueba.Union(new Cadenas(caden1, caden2)));
        System.out.println("Interseccion --> " + 
                prueba.Interseccion(new Cadenas(caden1, caden2)));
        System.out.println("Diferencia   --> " + 
                prueba.Diferencia(new Cadenas(caden1, caden2)));
    }
}
