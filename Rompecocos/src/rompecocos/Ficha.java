package rompecocos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ficha extends JButton {
	
	private static int fichaSize = 0;
	private static int maxFichas = 0;
	private int row;
	private int col;
	private int idImage;
	private ImageIcon image;
	
	public Ficha(ImageIcon image, int idImage, int row, int col) {
		this.row = row;
		this.col = col;
		setImage(image, idImage);
		
		this.setBackground(Color.WHITE);
		Dimension size = new Dimension(fichaSize, fichaSize);
		this.setPreferredSize(size);
		this.setBorder(null);
		this.setFocusPainted(false);
	}
	
	private void setImage(ImageIcon image, int idImagen) {
		this.image = image;
		this.idImage = idImagen;
		
		if(idImage < maxFichas - 1) {
			setIcon(image);
		} else {
			setIcon(null);
		}
		
	}
	
	public static void setFichaSizeMaxFichas(int tamano, int numerofichas) {
		maxFichas = numerofichas;
		fichaSize = tamano;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int getIdImage() {
		return idImage;
	}

	public ImageIcon getImage() {
		return image;
	}
	
	public void mostrarImagen() {
		setIcon(image);
	}
	
	//pieza.intercambiar(piezas2);
	public void intercambiar(Ficha otraFicha) {
		ImageIcon otraImagen = otraFicha.getImage();
		int idOtraImagen = otraFicha.getIdImage();
		otraFicha.setImage(image, idImage);
		this.setImage(otraImagen, idOtraImagen);
	}
	
	public boolean hasNoImage() {
		
		if(getIcon() == null ) {
			return true;
		}
		
		return false;
	}
}
