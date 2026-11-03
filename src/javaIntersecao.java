package vetor2;

import java.util.Scanner;

public class javaIntersecao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[], c[], e, cc = 0;

		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(int i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor de A:");
			a[i] = in.nextInt();
		}
		for(int i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor de B:");
			b[i] = in.nextInt();
		}
		for(int i = 0; i < TAM; i++) {
			e = 0;
			for(int j = 0; j < TAM; j++) {
				if(a[i] == b[j]) {
					e++;
				}
			}

			if(e > 0){
				c[cc] = a[i];
				cc++;
			}
		}
		
		System.out.println("\n Valores de A:");
			for(int i = 0; i < TAM; i++) {
				System.out.print(a[i] + " ");
			}
		System.out.println();
		
		System.out.println("\n Valores de B:");
		for(int i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		System.out.println("\n Valores de C:");
		for(int i = 0; i < cc; i++) {
			System.out.print(c[i] + " ");
		}

	in.close();
	}

}
