// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawRect(50, 50, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawLine(50, 50, 100, 100);
		g.drawLine(350, 350, 400, 400);
		g.drawLine(350, 50, 400, 100);
		g.drawLine(50, 350, 100, 400);
				
		// DRAW SPHERE
		g.drawOval(75,  75, 300, 300);
		g.drawOval(75, 120, 300, 210);
		g.drawOval(75, 160, 300, 130);
		g.drawOval(75, 200, 300, 50);
		g.drawOval(200, 75, 50, 300);
		g.drawOval(160, 75, 130, 300);
		g.drawOval(120, 75, 210, 300);
		// DRAW TRIANGLE
		
	}

}

