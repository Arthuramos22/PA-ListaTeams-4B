package vetor2;

import java.util.Scanner;

public class javaSomatorio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[];
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(int i = 0; i < TAM; i++){
			System.out.println("Entre com o " + (i + 1) + "º valor de A: ");
			a[i] = in.nextInt();
			System.out.println();
		}
		
		b[0] = a[0];
		
		for(int i = 1; i < TAM; i++) {
			b[i] = b[i - 1] + a[i];
		}
		
		System.out.println("\n Valores de A:");
			for(int j  = 0; j < TAM; j++) {
				System.out.print(a[j] + " ");
			}
		
		System.out.println();
		
		System.out.println("\n Valores de B:");
			for(int h = 0; h < TAM; h++){
				System.out.print(b[h] + " ");
			}

		in.close();
	}
}
