package evs;
//CONTINUA CHQUEQUENADO LA FUINCION ASIGNAR VALORES, LA i DEL CICLO NO ES LA MISMA QUE QUIERES 
//PARA ASIGNAR VALORSE A LAS VARIABLES
//CONDICIONA PARA QUE SI ES X IGNORE 
import java.util.*;
public class Evaluador{
    
    public String expresionInfija;
    public String expresionPostfija;
    public Stack<Double> stack = new Stack<>();
    public ArrayList<Simbolo> evaluables = new ArrayList<Simbolo>();
    public ArrayList<Simbolo> asignados = new ArrayList<Simbolo>();
    public ArrayList<Integer> posicionesX = new ArrayList<Integer>();
    public boolean hayX;
    
    //main PARA PRUEBAS
    public static void main(String[] args) throws Exception{
        
        Evaluador evaluador = new Evaluador();
        
        //PRUEBAS CON EXPRESIONES QUE NO SON PARA EL GRAFICADOR
        /*
        //evaluador.expresionInfija="(A-B)*(E-D)/X";
        evaluador.expresionInfija="X+X";
        evaluador.expresionPostfija=EntrefijoAPostfijo.Infijo2PosfijoTxt(evaluador.expresionInfija);
        
        
        String[] valores = {"3"};
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
        
        */
        //PRUEBAS CON EXPRESIONES PARA EL GRAFICADOR
        
        evaluador.expresionInfija="(X+B+C+5+X)-2";
        evaluador.expresionPostfija=EntrefijoAPostfijo.Infijo2PosfijoTxt(evaluador.expresionInfija);
        String[] valores = {"3","4"};
        evaluador.asignarValoresX(evaluador.expresionPostfija, valores);
       
        
        if(evaluador.hayX){
            double valorParaX=1;
            for(int i=0;i<evaluador.posicionesX.size();i++){
                
                evaluador.evaluables.get(evaluador.posicionesX.get(i)).valor=valorParaX;
                
            }
            
        }
        double resultado = evaluador.evaluar(evaluador.evaluables);
        System.out.println(resultado);
       
    }
    
    
    
    /*
    public void asignarValores(String s){
        
        Scanner entrada = new Scanner(System.in);
        this.evaluables.clear();
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
           
            if(c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='^'){
                
                try{
                    
                    Simbolo operandoTemporal = new Simbolo(c); //Guardamos el operando para saber si ya le hemos asignado valor o NO
                    
                    if(!asignados.contains(operandoTemporal)){//Si NO hemos asignado ya el valor del operando lo pedimos
                    
                    System.out.println("Asigna valor de: "+c);

                    asignados.add(operandoTemporal);
                    
                    double valor = entrada.nextDouble();
                    
                    evaluables.add(new Simbolo(c,valor));
                    
                }
                }catch(NullPointerException e){
                    
                    Simbolo operandoTemporal = new Simbolo(c); //Guardamos el operando para saber si ya le hemos asignado valor o NO
                    
                    System.out.println("Asigna valor de: "+c);

                    asignados.add(operandoTemporal);
                    
                    double valor = entrada.nextDouble();
                    
                    evaluables.add(new Simbolo(c,valor));
                }

            
            }else{

                evaluables.add(new Simbolo(c));
            }
        }
        
    }

    */
    
    public void asignarValores(String s, String[] numeros) throws Exception{
        
        //Scanner entrada = new Scanner(System.in);
        
        this.evaluables.clear();
        
        int numeroAsignado=0;
        
        
        int i=0;
        while(i<s.length()){
            
            char c = s.charAt(i);

            if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
               i = hacerNumero(i,s);
               c=s.charAt(i);
            }
            if(c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='^'){
                //Simbolo operandoTemporal = new Simbolo(Character.toString(c));
                if(asignados.isEmpty()){
                    
                    asignados.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                    evaluables.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                    numeroAsignado++;
                }else if(contiene(Character.toString(c))==false){
                    
                    asignados.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                    evaluables.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                    numeroAsignado++;

                }else if(contiene(Character.toString(c))==true){
                    
                    
                    for(int z=0;z<asignados.size();z++){
                        
                        if(asignados.get(z).token.equals(Character.toString(c))){
                            double valor = asignados.get(z).valor;
                            evaluables.add(new Simbolo(Character.toString(c),valor));
                        }
                            
                    }
                    
                    
                }
                
                
            }
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){

                evaluables.add(new Simbolo(Character.toString(c)));
   
            }
            
          i++;  
        }
        
        
   
    }
    
    public void asignarValoresX(String s, String[] numeros) throws Exception{
        
        //Scanner entrada = new Scanner(System.in);
        
        this.evaluables.clear();
        this.posicionesX.clear();
        this.hayX=false;
        
        int numeroAsignado=0;

        int i=0;
        
        try{
            while(i<s.length()){
            
            char c = s.charAt(i);

            if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
               i = hacerNumero(i,s);
               c=s.charAt(i);
            }
            if(c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='^'){
                //Simbolo operandoTemporal = new Simbolo(Character.toString(c));
                if(c=='X'||c=='x'){
                    
                    posicionesX.add(i);
                    hayX=true;
                    evaluables.add(new Simbolo(Character.toString(c),0));
                    
                }else{
                    
                   if(asignados.isEmpty()){
                    
                    asignados.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                    evaluables.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                    numeroAsignado++;
                    }else if(contiene(Character.toString(c))==false){
                    
                        asignados.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                        evaluables.add(new Simbolo(Character.toString(c),Double.parseDouble(numeros[numeroAsignado])));
                        numeroAsignado++;

                    }else if(contiene(Character.toString(c))==true){
                    
                    
                        for(int z=0;z<asignados.size();z++){

                            if(asignados.get(z).token.equals(Character.toString(c))){
                                double valor = asignados.get(z).valor;
                                evaluables.add(new Simbolo(Character.toString(c),valor));
                            }
                            
                        }
                    
                    
                    } 
                    
                    
                }
                
                
                
            }
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){

                evaluables.add(new Simbolo(Character.toString(c)));
   
            }
            
          i++;  
        }
        
            
        }catch(ArrayIndexOutOfBoundsException e){
        
            throw new Exception("No ha ingresado suficientes valores");
        
        }
        
        
   
    }
    
    
    public boolean contiene(String s){
        boolean contiene=false;
        for(int i=0;i<this.asignados.size();i++){
            
            if(this.asignados.get(i).token.equals(s)){
                
                contiene = true;
 
            }else{
                
                
            }
            
        }
        
        return contiene;
    }   
    
    
    
    
    public int  hacerNumero(int i,String s) throws Exception{
        char c;
        int punto=0;
        String numero="";
        
        while(true){
            c=s.charAt(i);
            if(c=='.' ){
                punto++;
                if(punto>1){
                    throw new Exception("Nùmero mal escrito");
                }else{
                    numero+=".";
                }
                i++;
            }else if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
                numero+=s.charAt(i);
                i++;
            }else{
                evaluables.add(new Simbolo(numero,Double.parseDouble(numero)));  
                return i;
            }

     }
        
    }
    
     
    
    
    
    
    public double evaluar(ArrayList<Simbolo> simbolos){
        
        int i = 0;
        
        Simbolo c;
        
        double opnd1,opnd2,r=0;
        
        while(i<simbolos.size()){
            
            
            
            c = evaluables.get(i);
            
            if(c.operando){
                stack.push(c.valor);
                System.out.println("operando");
                
            }else{
                
                
                
                opnd1=stack.pop();
                opnd2=stack.pop();
                
                switch(c.token){
                    
                    case "+":r=opnd2+opnd1;
                        break;
                    case "-":r=opnd2-opnd1;
                        break;
                    case "*":r=opnd2*opnd1;
                        break;
                    case "/":r=opnd2/opnd1;
                        break;
                    case "^":r=Math.pow(opnd2, opnd1);
                        break;
                    
                
                
               }
               stack.push(r);
                
            }
            i++;
        }
        
        
        return r;
            
        }
    
}