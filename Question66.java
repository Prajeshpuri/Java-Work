import java.awt.*;
import java.applet.*;

/* program to create an Applet and use setColor (), drawString (), 
	drawLine (), drawRect () etc */

/* <applet code="Question66" width=300 height=100> 
	</applet>
*/

public class Question66 extends Applet {
	public void paint (Graphics g) {
		g.setColor (Color.red);
		g.drawString ("Welcome", 50, 50);
		g.drawLine (20, 30, 20, 300);
		g.drawRect (70, 100, 30, 30);
		g.fillRect (170, 100, 30, 30);
		g.drawOval (70, 200, 30, 30);
		g.setColor (Color.pink);
		g.fillOval (170, 200, 30, 30);
		g.drawArc (90, 150, 30, 30, 30, 270);
		g.fillArc (270, 150, 30, 30, 0, 180);
	}
}
