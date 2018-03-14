package extra;

import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {

	public static void main(String[] args) {

		String Pi = "3.1415926536";
		int piLength = Pi.length();
		for (int x = 0; x < piLength; x++) {
			System.out.println(Pi.charAt(x));
			String input1 = JOptionPane.showInputDialog(null, "What is the next digit of Pi?");
			if (input1.equals(Character.toString(Pi.charAt(x)))) {
				JOptionPane.showMessageDialog(null, "Whats the next digit of pie");
			} else {
				JOptionPane.showMessageDialog(null, "No Pie For You!");
				System.exit(0);
	}
	}
		JOptionPane.showMessageDialog(null, "Congratulations.\nYour prize... learning");
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}