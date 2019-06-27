package rompecocos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import misComponentes.Titulos;

public class Rompecocos extends JFrame {
	
	public static final String rutaFile = "src/imagenes/AngryBirds.jpg";
	
	private int fichaSize = 100;
	private int gridSize = 4;
	private BufferedImage bufferImage = null;
	private Ficha[][] tablero = new Ficha[gridSize][gridSize];
	private JPanel centralPanel, panelBotones;
	private JButton ayuda, revolver, salir;
	private Escuchas escucha; 
	
	public Rompecocos() {
		
		try {
			bufferImage = ImageIO.read(new File(rutaFile));
			Ficha.setFichaSizeMaxFichas(fichaSize, gridSize*gridSize);
			
			initGUI();
			
			//Default window config.
			this.setUndecorated(true);
			pack();
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se ha encontrado la imagen.");
		}
	}
	
	private void initGUI() {
		
		//Define window container y layout
		
		//Crear el escucha
		escucha = new Escuchas();
		
		//Crear la GUI
		
		//titulo
		Titulos titulo = new Titulos("Rompecocos", 30, Color.BLACK);
		add(titulo, BorderLayout.NORTH);
		
		//zona de juego
		dividirImage();
		
		//panel botones
		panelBotones = new JPanel();
		ayuda = new JButton("ayuda");
		ayuda.addActionListener(escucha);
		panelBotones.add(ayuda);
		
		revolver = new JButton("revolver");
		revolver.addActionListener(escucha);
		panelBotones.add(revolver);
		
		salir = new JButton("salir");
		salir.addActionListener(escucha);
		panelBotones.add(salir);
		
		add(panelBotones, BorderLayout.SOUTH);
	}
	
	private void dividirImage() {
		centralPanel = new JPanel();
		centralPanel.setLayout(new GridLayout(gridSize, gridSize));
		add(centralPanel, BorderLayout.CENTER);
		
		for(int row = 0; row < gridSize; row++) {
			for(int col = 0; col < gridSize; col++) {
				
			}
		}
	}
	
	private class Escuchas implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent eA) {
			// TODO Auto-generated method stub
			// Responde a los eventos de los botones ayuda, revolver, salir.
			
			if(eA.getSource() == salir) {
				System.exit(0);
			} else {
				if(eA.getSource() == ayuda) {
					//Llamar a la ventana ayuda.
				} else {
					//Llamar a la función revolver.
				}
			}
			
		}
		
	}
}







