import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CenterShapesDriver
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Center Shapes");
		Dimension screenSize = getScreenSize();
		final double pct = 0.8;
		final int squareSize = (int) (Math.min(screenSize.height, screenSize.width) * pct);
		frame.setSize(squareSize, squareSize);
		// center the JFrame on the current device
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new CenterShapesPanel());
		frame.setVisible(true);
	}
	
	private static Dimension getScreenSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}

}
