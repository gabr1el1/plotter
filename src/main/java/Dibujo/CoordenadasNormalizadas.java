package Dibujo;
import java.awt.Graphics2D;

public class CoordenadasNormalizadas{
	
	double XMmin, YMmin, XMmax,YMmax,XM,YM;
	int XDmin,YDmin,XDmax,YDmax;
	Graphics2D g;
	
	public CoordenadasNormalizadas(Graphics2D g){
		
		this.g = g;
	}
	
	public CoordenadasNormalizadas(){
		
		this.g=null;
	}
	
	public void setRangoMundiales(double XMmin, double YMmin, double XMmax, double YMmax){
		
		this.XMmin=XMmin;
		this.YMmin=YMmin;
		this.XMmax=XMmax;
		this.YMmax=YMmax;
	}
	
	public void setRangoDispositivo(int XDmin,int YDmin,int XDmax, int YDmax) {
		
		this.XDmin=XDmin;
		this.YDmin=YDmin;
		this.XDmax=XDmax;
		this.YDmax=YDmax;
	}
	
	
	
	public int getXD(double XM) {
		
		double calculo = XDmin + (XM-XMmin)*(XDmax-XDmin)/(XMmax-XMmin);
		
		return (int)calculo;
		
	}
	
	public int getYD(double YM) {
		
		double calculo = YDmax - (YM-YMmin)*(YDmax-YDmin)/(YMmax-YMmin);
		
		return (int)calculo;
		
	}
	
	public void line(double x1,double y1,double x2, double y2) {
		
		
		
		this.g.drawLine(this.getXD(x1),this.getYD(y1),this.getXD(x2),this.getYD(y2));
		
		
	}
}
