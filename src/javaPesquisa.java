package vetor2;

import java.util.Scanner;

public class javaPesquisa {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int a[], p;
		
		a = new int [TAM];
		
		for(int i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor de A:");
			a[i] = in.nextInt();
		}
		
		System.out.println("Qual número devo procurar?");
		p = in.nextInt();
		
		for(int i = 0; i < TAM; i++) {
			if(p == a[i]) {
				System.out.println("O número foi encontrado -> " +a[i]+ " ele está na posição " +(i+1));
			}
		}

		in.close();

	}

}
