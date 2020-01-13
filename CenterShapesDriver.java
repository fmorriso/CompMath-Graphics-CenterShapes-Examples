import javax.swing.JFrame;

public class CenterShapesDriver
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Center Shapes");
		frame.setSize(1000, 1000);
		// center the JFrame on the device
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new CenterShapesPanel());
		frame.setVisible(true);
	}

}
