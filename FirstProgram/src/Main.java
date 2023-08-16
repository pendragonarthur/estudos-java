// Exercício USER INPUT

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String name = scanner.nextLine();
		
		System.out.println("Salve, " + name );
	}
	
} 
