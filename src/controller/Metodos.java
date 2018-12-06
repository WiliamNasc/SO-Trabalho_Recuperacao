package controller;

import javax.swing.JOptionPane;

public class Metodos {

	int [][] mat_r = new int [4][2]; // matriz que representa os blocos do Raid 0.
	int total,  aux = 8; // variaveis que auxiliam no controle dos valores de cada bloco.
	
// insere os valores nas linhas e colunas da matriz
// de acordo com os com a numero de discos e o tamanho
	
	public void raid0 (int tamanho_arq, int num_disk) {
		
		tamanho_arq *= num_disk;
		aux = tamanho_arq;
		
		for (int i = 0; i < 4; i++){
			
			total += tamanho_arq;
			
			mat_r[i][0] = total;
			mat_r[i][1] += (aux*4)+(aux*(i+1));
				
		}
		
		
		
		
	}
	
	
	public void raid1(int tamanho_arq, int num_disk){
		
		System.out.println("Qtde. de discos: "+num_disk+"\nTAMANHO: " + tamanho_arq + " Kb \n");
		
		for (int i = 0; i < 4; i++){
			
			for (int j = 0; j < 2; j++ ){
				
				
				System.out.print("\t" + "|"+ mat_r[i][j] + "| " +"\t");
			
				
			}
			
			System.out.println(" ");
		}
		
		System.out.println("\n BLOCO 1                     BLOCO 2 \n");
		System.out.println("\t OBS.: Os valores acima são os bits armazenados em cada posição de bloco. \t");
		
	}
	
	public int msg_Int (String texto){
		
		return Integer.parseInt(JOptionPane.showInputDialog(texto));
	}

}
