package evs;

public class Simbolo{
    public String token;
    public double valor;
    public boolean operando;
    
    public Simbolo(String literal,double valor){   
      this.token=literal;
      this.valor=valor;  
      this.operando=true;
    }
    public Simbolo(String texto){  
        token=texto;  
        this.valor=0;
        this.operando=false;
    }
}
