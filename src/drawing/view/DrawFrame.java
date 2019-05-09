package drawing.view;

import javax.swing.JFrame;
import drawing.controller.ArtController;

public class DrawFrame extends JFrame
{
	private ArtController app;
	
	public DrawFrame(ArtController app)
	{
		super();
		this.app = app;
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setVisible(true);
		this.setSize(100, 800);
		this.setResizable(false);
	}

}
