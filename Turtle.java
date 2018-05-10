package Turtle;

import java.awt.*;

import javax.swing.JFrame;

public class Turtle {
		
	public  boolean visible=true; 
	public  double x,y; 
	public  double angle; 
	
	public  void start(double x, double y, double angle) {
		this.x=x;
		this.y=y;
		this.angle=angle;
	}
	
	public  void hide() {
		visible=false;
	}
	
	public  void show() {
		visible=true;
	}
	
	public  void turn(double angle) {
		this.angle+=angle;	
	}
	
	public void setPosition(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void setColor(Graphics g, Color color) { 
		g.setColor(color);
	}
			
	public void move(Graphics g, double length)  { 
		double x_new =0, y_new=0;					
		if(angle==0) {
			y_new=y;
			x_new=x+length;
		}
		
		else if(angle==90) {
		y_new=y+length;
		x_new=x;
		
		}
	
		else if(angle==180) {
			y_new=y;
			x_new=x-length;
		}
		
		else if(angle==270) {
			y_new=y-length;
			x_new=x;
		}
						
		else {
			x_new= x+length*Math.cos(Math.toRadians(angle));		    
			y_new= y+length*Math.sin(Math.toRadians(angle));							
		}
		
		if(visible==true) 
			g.drawLine((int) Math.round(x), (int) Math.round(y),(int) Math.round(x_new), (int) Math.round(y_new));	
	x=x_new;
	y=y_new;				
	}

					
}
