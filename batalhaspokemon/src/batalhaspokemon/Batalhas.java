package batalhaspokemon;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Batalhas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numLutas, contadorVitoria = 0;
		String treinadorA, treinadorB, pokemonA, pokemonB, tipoA, tipoB, letraA, letraB;
		boolean continuar = true;
		
		do {
			
			System.out.println("**********************************************");
			System.out.println("*                                            *");
			System.out.println("*             B A T A L H A S                *");
			System.out.println("*           G E N E R A T I O N              *");
			System.out.println("*                                            *");
			System.out.println("**********************************************");
			
			System.out.println("Entre com o nome do primeiro treinador:");
			leia.skip("\\R?");
			treinadorA = leia.nextLine();
			
			System.out.println("Entre com o nome do segundo treinador:");
			leia.skip("\\R?");
			treinadorB = leia.nextLine();
			
			System.out.println("");
			System.out.println("Quantas batalhas essa disputa terá?");
			System.out.println("Opções:");
			System.out.println("3  4  6  ou");
			System.out.println("Digite 0 para sair.");
			numLutas = leia.nextInt();
			
			if(numLutas == 0) {
				continuar = false;
				break;
			}
			
			for(int i = 1; i <= numLutas; i++) {
				
				System.out.println("");
				
				// Primeiro Pokemon
				System.out.println(treinadorA + " escolha o seu combatente!");
				System.out.println("Entre com o nome da pessoa:");
				leia.skip("\\R?");
				pokemonA = leia.nextLine();
				
				letraA = String.valueOf(pokemonA.charAt(0));
				tipoA = defineTipo(letraA);
				
				System.out.println("");
				
				// Segundo Pokemon
				System.out.println(treinadorB + " escolha o seu combatente!");
				System.out.println("Entre com o nome da pessoa:");
				leia.skip("\\R?");
				pokemonB = leia.nextLine();
				
				letraB = String.valueOf(pokemonB.charAt(0));
				tipoB = defineTipo(letraB);
				
				// Começa a luta
				
				System.out.println("");
				System.out.println("*******************************");
				System.out.println("*        " +pokemonA + " X " + pokemonB);
				System.out.println("*******************************");
				System.out.println("*        " + tipoA + " * " + tipoB);
				System.out.println("*******************************");
				
				if(tipoA == tipoB) {
					System.out.println("*          E  *  E");
				} 
				else if(tipoA == "planta" && tipoB == "agua") {
					System.out.println("*          V  *  D");
					contadorVitoria += 1;
				}
				else if(tipoA == "planta" && tipoB == "fogo") {
					System.out.println("*          D  *  V");
					contadorVitoria += -1;
				}
				else if(tipoA == "agua" && tipoB == "fogo") {
					System.out.println("*          V  *  D");
					contadorVitoria += 1;
				}
				else if(tipoA == "agua" && tipoB == "planta") {
					System.out.println("*          D  *  V");
					contadorVitoria += -1;
				}
				else if(tipoA == "fogo" && tipoB == "planta") {
					System.out.println("*          V  *  D");
					contadorVitoria += 1;
				}
				else if(tipoA == "fogo" && tipoB == "agua") {
					System.out.println(pokemonB + " venceu!");
					System.out.println("*          D  *  V");
					contadorVitoria += -1;
				}
				
				keyPress();
			}
			
			
			if(contadorVitoria == 0) {
				System.out.println("");
				System.out.println("*******************************");
				System.out.println("  A batalha acabou em empate!  ");
				System.out.println("*******************************");
			}
			else {
				System.out.println("");
				System.out.println("E o vencedor desta batalha foi:");
				System.out.println("*******************************");
				
				if(contadorVitoria > 0)
					System.out.println("        " + treinadorA);
				else
					System.out.println("        " + treinadorB);
				
				System.out.println("*******************************");
			}
			keyPress();
			
		} while(continuar);
	}
	
	
	public static void keyPress() { 
		try { 
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read(); 
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	} 
	
	
	public static String defineTipo(String letra) {
		List<String> tipos = Arrays.asList(
				 "agua", "agua", "agua", "agua", "agua",
				 "agua", "agua", "agua", "agua", "agua",
				 "agua", "agua", "agua", "agua", "agua",
				 "agua", "agua", "agua", "agua", "agua",
				 "agua", "agua", "agua", "agua", "agua",
				 "agua"
				 );
		String letraMinuscula;
		
		letraMinuscula = letra.toLowerCase();
		
		switch(letraMinuscula) {
		case "a": return tipos.get(1);
		case "b": return tipos.get(2);
		case "c": return tipos.get(3);
		case "d": return tipos.get(4);
		case "e": return tipos.get(5);
		case "f": return tipos.get(6);
		case "g": return tipos.get(7);
		case "h": return tipos.get(8);
		case "i": return tipos.get(9);
		case "j": return tipos.get(10);
		case "k": return tipos.get(11);
		case "l": return tipos.get(12);
		case "m": return tipos.get(13);
		case "n": return tipos.get(14);
		case "o": return tipos.get(15);
		case "p": return tipos.get(16);
		case "q": return tipos.get(17);
		case "r": return tipos.get(18);
		case "s": return tipos.get(19);
		case "t": return tipos.get(20);
		case "u": return tipos.get(21);
		case "v": return tipos.get(22);
		case "w": return tipos.get(23);
		case "x": return tipos.get(24);
		case "y": return tipos.get(25);
		case "z": return tipos.get(26);
		}
		
		return "agua";
	}

}
