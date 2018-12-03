import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int [] raid_0_1 = new int [4]; // vetor 1 do raid 0
		int [] raid_0_2 = new int [4]; // vetor 2 do raid 0
		int [] raid_1_1 = new int [4]; // vetor 1 do raid 1
		int [] raid_1_2 = new int [4]; // vetor 2 do raid 1
		
		int valor_kb = 
				Integer.parseInt(JOptionPane.showInputDialog
						("Insira o valor de kb")); // número de kb
		int aux = 0; // recebe as transferencias de valores
		int cont_1 = 0;
		int cont_2 = 0;
		
		// guardando os valores nos vetores do Raid 0
		// 8 é simplificacao de 8000
		// valor_kb * 8000 = bit
		
		for (int i = 0; i < 8; i++){
			
			aux += valor_kb;
			
			if (i < 4){
				
				raid_0_1[i] = aux;
				
			} else if (i >= 4){
				
				raid_0_2[cont_1] = aux;
				cont_1 += 1;
			}
		}
		
		// guardando os valores nos vetores do Raid 1
		
		for (int i = 0; i < 8; i++){
			
			
			if (i < 4){
				
				raid_1_1[i] = raid_0_1[i];
				
			} else if (i >= 4){
				
				raid_1_2[cont_2] = raid_0_2[cont_2];
				cont_2 += 1;
			}
		}
		
		// Vendo resultados
		
		System.out.println("Raid 0 | Raid 1");
		
		for (int i = 0; i < 4; i++){
			
				System.out.println(raid_0_1[i] + "   |   " + raid_1_1[i]);
				
		}
		
		System.out.println("-----------------");

		for (int i = 0; i < 4; i++){
			
			System.out.println(raid_0_2[i] + "   |   " + raid_1_2[i]);
			
	}
		
	}

}
