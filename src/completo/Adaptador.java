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
public class Adaptador implements Conjuntos{
    private String salida;
    
    public boolean Es_Conjunto(String cade){
        int cont;
        for(int i = 0; i < cade.length(); i++){
            cont = 0;
            for(int j = 0; j < cade.length(); j++){
                if(cade.charAt(i) == cade.charAt(j)){
                    cont++;
                }
            }
            if(cont > 1){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String Union(Cadenas cade) {
        salida = "";
        if(Es_Conjunto(cade.getCade1()) == false || Es_Conjunto(cade.getCade2()) == false){
            salida = "Una o Ambas Cadenas no es un Conjunto - (Se repiten letras)";
            return salida;
        }
        salida = cade.getCade1()+cade.getCade2();
        return salida;
    }

    @Override
    public String Interseccion(Cadenas cade) {
        salida = "";
        if(Es_Conjunto(cade.getCade1()) == false || Es_Conjunto(cade.getCade2()) == false){
            salida = "Una o Ambas Cadenas no es un Conjunto - (Se repiten letras)";
            return salida;
        }
        String c1 = cade.getCade1();
        String c2 = cade.getCade2();
        for(int i = 0; i < c1.length(); i++){
            for(int j = 0; j < c2.length(); j++){
                if(c1.charAt(i) == c2.charAt(j)){
                    salida = salida+c1.charAt(i);
                }
            }
        }
        return salida;
    }

    @Override
    public String Diferencia(Cadenas cade) {
        salida = "";
        if(Es_Conjunto(cade.getCade1()) == false || Es_Conjunto(cade.getCade2()) == false){
            salida = "Una o Ambas Cadenas no es un Conjunto - (Se repiten letras)";
            return salida;
        }
        int cont;
        String c1 = cade.getCade1();
        String c2 = cade.getCade2();
        for(int i = 0; i < c1.length(); i++){
            cont = 0;
            for(int j = 0; j < c2.length(); j++){
                if(c1.charAt(i) != c2.charAt(j)){
                    cont++;
                }
            }
            if(cont == c2.length()){
                salida = salida+c1.charAt(i);
            }
        }
        for(int i = 0; i < c2.length(); i++){
            cont = 0;
            for(int j = 0; j < c1.length(); j++){
                if(c2.charAt(i) != c1.charAt(j)){
                    cont++;
                }
            }
            if(cont == c1.length()){
                salida = salida+c2.charAt(i);
            }
        }
        return salida;
    }
    
}
