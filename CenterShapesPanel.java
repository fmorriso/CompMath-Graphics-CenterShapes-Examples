import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CenterShapesPanel extends JPanel
{
	public CenterShapesPanel()
	{
		// clear Insets so we can use all of the space of our JPanel
		this.setBorder(BorderFactory.createEmptyBorder());
	}

	/**
	 * @param g - the Graphics instance we are drawing on
	 */
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// get current size of parent container
		Container parent = getParent();
		int x = parent.getX();
		int y = parent.getY();
		int width = parent.getWidth();
		int height = parent.getHeight();
		
		// set our size to be the same as our parent container
		this.setSize(width, height);
		
		// fill the background of this container
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);

		// draw a circle in the center of this container
		g.setColor(Color.RED);
		fillOvalCentered(width / 2, height / 2, g);

		
	}

	/**
	 * @param width - width of the shape
	 * @param height - height of the shape
	 * @param g - Graphics object we are drawing on
	 */
	public void fillOvalCentered(int width, int height, Graphics g)
	{
		// left corner X = center of JPanel minus half width of shape
		int x = this.getWidth() / 2 - width / 2;
		
		// left corner y = center of JPanel minus half height of shape
		int y = this.getHeight() / 2 - height / 2;
		
		g.fillOval(x, y, width, height);
	}

}
