// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		
		
		// Draw Random Lines
		for(int l=1;l <= 100;l++)
		{
			int x1 = rnd.nextInt(390)+10;
			int y1 = rnd.nextInt(290)+10;
			int x2 = rnd.nextInt(390)+10;
			int y2 = rnd.nextInt(290)+10;
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			g.drawLine(x1 ,y1,x2,y2);
			g.setColor(new Color(red,green,blue));
		}


				
		
		// Draw Random Squares
		for(int k=1; k <=100; k++)
		{
			int a = rnd.nextInt(340)+ 400;
			int b = rnd.nextInt(255);
			int red = rnd.nextInt(255);
			int green =rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			g.setColor(new Color(red,green,blue));
			g.fillRect(a, b, 50, 50);
			
		}
 
		
		
		// Draw Random Circles
		for(int j=1; j<=100; j++)
		{
			int c = rnd.nextInt(200)+10;
			int d = rnd.nextInt(100)+300;
			int e = rnd.nextInt(200);
			int red = rnd.nextInt(255);
			int green = rnd.nextInt(255);
			int blue = rnd.nextInt(255);
			g.setColor(new Color(red,green,blue));
			g.drawOval(c,  d,  e, e);
						
			
		}



		
		// Draw 3-D Box
	
	
	
	
	
	}
		
}



    
 