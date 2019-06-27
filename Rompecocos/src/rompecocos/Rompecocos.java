package rompecocos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Rompecocos extends JFrame {
	
	public static final String rutaFile = "src/imagenes/prime_material_dragon.jpg";
	
	private int fichaSize = 100;
	private int gridSize = 4;
	private BufferedImage bufferImage = null;
	private Ficha[][] tablero = new Ficha[gridSize][gridSize];
	private JPanel centralPanel, panelBotones;
	private JButton ayuda, revolver, salir;
	
	public Rompecocos() {
		
		try {
			bufferImage = ImageIO.read(new File(rutaFile));
			Ficha.setFichaSizeMaxFichas(fichaSize, gridSize*gridSize);
			
			initGUI();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se ha encontrado la imagen.");
		}
	}
	
	private void initGUI() {
		
	}
}







