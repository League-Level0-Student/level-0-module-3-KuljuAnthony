package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robot {
	static Robot robot = new Robot();
public static void main(String[] args) { 
   
	
	robot.penDown();
	robot.setSpeed(100);
	
	int bob=JOptionPane.showOptionDialog(null, "what shape should the robot draw?", "drawshape", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,new String[]{ "triangle", "circle", "square"}, 0);
	int joe=JOptionPane.showOptionDialog(null, "what color should the robot draw?", "drawcolor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,new String[]{ "red", "green", "blue"}, 0);
	if(joe==0) {
		robot.setPenColor(Color.red);
	}
	if(joe==1) {
		robot.setPenColor(Color.green);
	}
	if(joe==2) {
		robot.setPenColor(Color.blue);
	}
	if(bob==2) {
		drawSquare();
	}
	if(bob==1) {
		drawCircle();
	}
	if(bob==0) {
		drawTriangle();
	}
	
	
	
}
static void drawSquare() {
	robot.show();
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.hide();
}
static void drawTriangle() {
	robot.show();
	robot.turn(135);
	robot.move(90);
	robot.turn(135);
	robot.move(125);
	robot.turn(135);
	robot.move(90);
	robot.hide();
	
}
static void drawCircle() {
	robot.show();
	for (int i = 0; i < 36; i++) {
		robot.move(10);
		robot.turn(10);
		
	}
	robot.hide();
}

}
