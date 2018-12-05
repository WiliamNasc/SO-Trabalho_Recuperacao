package view;
import javax.swing.JOptionPane;

import controller.Metodos;

public class Main {

	public static void main(String[] args) {
		
		Metodos raid0 = new Metodos();
		int arquivo = 4;
		int num_disk = 3;
		raid0.raid0(arquivo, num_disk);
		raid0.raid1(arquivo);
	}

}
