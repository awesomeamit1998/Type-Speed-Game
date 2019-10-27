import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TyperManPanel extends JFrame {

	private TyperManGame game;
	
	public TyperManPanel() throws FileNotFoundException {
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		setLocation(gd.getDisplayMode().getWidth()/4,gd.getDisplayMode().getHeight()/4);
		game = new TyperManGame();
		setContentPane(game);
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		new TyperManPanel();
	}
}
