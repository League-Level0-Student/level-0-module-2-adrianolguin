import org.jointheleague.graphical.robot.Robot;

public class RobtoValentine {

	public static void main(String[] args) {
		Robot darwin = new Robot();

		Robot.setWindowImage("download.jpg");

		darwin.setSpeed(1000000000);
		darwin.setPenColor(255, 0, 0);
		darwin.setPenWidth(5);
		darwin.hide();

		darwin.penDown();

		darwin.moveTo(450, 500);
		darwin.turn(40);
		darwin.move(300);
		for (int k = 0; k < 36; k++) {
			darwin.move(12);
			darwin.turn(-5);
		}
		darwin.moveTo(450, 500);
		darwin.setAngle(0);
		darwin.turn(-40);
		darwin.move(300);
		for (int K = 0; K < 36; K++) {
			darwin.move(12);
			darwin.turn(5);
		}

	}
}
