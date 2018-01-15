package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot blue = new Robot(200, 200);
		Robot yellow = new Robot(300, 400);
		Robot black = new Robot(400, 200);
		Robot green = new Robot(500, 400);
		Robot red = new Robot(600, 200);
		blue.setSpeed(10);
		yellow.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		red.setSpeed(10);
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.YELLOW);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.GREEN);
		red.setPenColor(Color.RED);
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				blue.turn(1);
				blue.move(2);
			}
		}).start();
		new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				yellow.turn(1);
				yellow.move(2);
			}
		}).start();new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				black.turn(1);
				black.move(2);
			}
		}).start();new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				green.turn(1);
				green.move(2);
			}
		}).start();new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				red.turn(1);
				red.move(2);
			}
		}).start();
	}
}
