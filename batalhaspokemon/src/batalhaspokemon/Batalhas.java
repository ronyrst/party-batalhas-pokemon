package batalhaspokemon;

import java.util.Scanner;

public class Batalhas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numLutas;
		String treinadorA, treinadorB;
		boolean continuar = true;
		
		do {
			
			System.out.println("Entre com o nome do primeiro treinador:");
			treinadorA = leia.nextLine();
			
			System.out.println("Entre com o nome do segundo treinador:");
			treinadorB = leia.nextLine();
			
			System.out.println("Quantos turnos essa batalha terá?");
			System.out.println("Opções:");
			System.out.println("3  4  6  ou");
			System.out.println("0 para sair.");
			numLutas = leia.nextInt();
			
			if(numLutas == 0) {
				continuar = false;
				break;
			}
			
			for(int i = 1; i <= numLutas; i++) {
				System.out.println(i);
				
				
			}
			
			
		} while(continuar);
		
		
		
		
		
		
		
		
		
		
		

	}

}
