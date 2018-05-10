package Turtle;

import java.awt.*;
import javax.swing.JFrame;
import Turtle.Turtle;

public class TurtleGraphic extends JFrame {
	
	private Turtle turtle = new Turtle();	
     	
     public TurtleGraphic() {
		setSize(800, 800);
		setTitle("TurtleGrafik");
		turtle.start(100, 220, 0); 
		setVisible(true);
	}

	public void paint(Graphics g) { 
		turtle.setColor(g, Color.RED);
		
		for (int i = 0; i < 3; i++) {
			drawSnowFlake(g, 600);
			turtle.turn(120);
		}
	}

	private void drawSnowFlake(Graphics g, double len) {
		
		if (len < 10)
			turtle.move(g, len);

		else {
			drawSnowFlake(g, len / 3);
			turtle.turn(-60);
			drawSnowFlake(g, len / 3);
			turtle.turn(120);
			drawSnowFlake(g, len / 3);
			turtle.turn(-60);
			drawSnowFlake(g, len / 3);

		}
	}

	public static void main(String[] args) {
		new TurtleGraphic();
	}
}