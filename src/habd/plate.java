package habd;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
public class plate extends JPanel {
	boolean moving=true;
	Color c=new Color((int)(Math.random() * 0x1000000));
	    int xst[]=new int[4];
	    int yst[]=new int[4];
	     int x=400,y=500;
		public plate(int x[],int y[]) {
	    	this.xst=x.clone();
	    	this.yst=y.clone();
	    	 
	    }
		public void setX(int X) {x=X;}
		public void setY(int Y) {y=Y;}
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(0, 90, 400, 10);
	    if(moving) {
           if(xst[1]>400) {
        	   if(yst[1]==500) {
        		   
        	   }
        	   g.setColor(c);
        	   g.fillPolygon(xst, yst, 4);
        	   
        	   for(int i=0;i<4;i++) {yst[i]+=40;}
           }
           else { g.setColor(c);
        	   g.fillPolygon(xst, yst, 4);
           
		   for(int i=0;i<4;i++) {xst[i]+=10;}
           }
	    }
	    else {
	    	g.setColor(c);
	    	xst[0]=x-5;xst[1]=x;xst[2]=x+50;xst[3]=x+55;
	    	yst[0]=y-15;yst[1]=y;yst[2]=y;yst[3]=y-15;
     	   g.fillPolygon(xst, yst, 4);
	    }
	}
	public int getY() {return yst[1];}
}