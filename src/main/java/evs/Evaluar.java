/****************************************************************************
 *   PROGRAMA    : Evaluar.java
 *   AUTOR       : Gabriel Hernandez Grajeda
 *   FECHA       : 2022-05-04
 *   DESCRIPCION : Evalua una expresion convertida previamente a la notacion
 *                 postfija
 *****************************************************************************/

package evs;

import java.util.*;


public class Evaluar {
    //static String expresionInfija = "(A-B)*(E-D)/X";
    /*
    static String expresionInfija = "abb";
    static String expresionPostfija = EntrefijoAPostfijo.Infijo2PosfijoTxt(expresionInfija);
    static Stack<Double> stack = new Stack<>();
    static ArrayList<Simbolo> evaluables = new ArrayList<Simbolo>();
    static ArrayList<Simbolo> asignados = new ArrayList<Simbolo>();
    */
    
    public static void main(String[] args) throws Exception{
        
        Evaluador evaluador = new Evaluador();
        
        //evaluador.expresionInfija="(A-B)*(E-D)/X";
        evaluador.expresionInfija="X^10";
        evaluador.expresionPostfija=EntrefijoAPostfijo.Infijo2PosfijoTxt(evaluador.expresionInfija);
        
        
        String[] valores = {"4"};
        evaluador.asignarValores(evaluador.expresionPostfija,valores);
        double resultado = evaluador.evaluar(evaluador.evaluables);
        
        
        for(int i=0;i<evaluador.evaluables.size();i++){
            
            
            if(evaluador.evaluables.get(i).operando){
                
                System.out.println(evaluador.evaluables.get(i).valor);
                
            }
            
        }
        
        
        System.out.println("Expresión infija a evaluar: "+evaluador.expresionInfija);
        System.out.println("Expresión postfija: "+evaluador.expresionPostfija);
             
        System.out.println("Resultado: "+resultado);
        
       
    }
}

