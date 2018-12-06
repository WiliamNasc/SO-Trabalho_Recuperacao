package view;
import javax.swing.JOptionPane;

import controller.Metodos;

public class Main {

	public static void main(String[] args) {
		
		Metodos rodar = new Metodos();
		int tamanho_arq = rodar.msg_Int("Tamanho do arquivo");
		int num_disk = rodar.msg_Int("Quantidade de discos");
		rodar.raid0(tamanho_arq, num_disk);
		rodar.raid1(tamanho_arq, num_disk);
	}

}
