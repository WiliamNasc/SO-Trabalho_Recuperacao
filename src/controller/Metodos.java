package controller;

public class Metodos {

	int [][] vetor_1 = new int [4][2]; // vetor 1 do raid 0
	int [] vetor_2 = new int [4]; // vetor 2 do raid 0
	int total,  aux = 8;
	
	public void raid0 (int arquivo, int num_disk) {
		
		aux = arquivo;
		for (int i = 0; i < 4; i++){
			
			total += arquivo;
			
			vetor_1[i][0] = total;
			vetor_1[i][1] += (aux*4)+(aux*(i+1));
				
		}
		
		
		
		
	}
	
	
	public void raid1(int arquivo){
		
		System.out.println("ARQUIVO X DE TAMANHO: " + arquivo + " Kb \n");
		
		for (int i = 0; i < 4; i++){
			
			for (int j = 0; j < 2; j++ ){
				
				
				System.out.print("\t" + "|"+ vetor_1[i][j] + "| " +"\t");
			
				
			}
			
			System.out.println(" ");
		}
		
		System.out.println("BLOCO 1                     BLOCO 2 \n");
		System.out.println("\t OBS.: Os valores acima são os bits armazenados em cada posição de bloco. \t");
		
	}

}
