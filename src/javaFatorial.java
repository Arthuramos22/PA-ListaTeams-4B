package vetor2;

import java.util.Scanner;

public class javaFatorial{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 15;
        int a[], b[], f;

        a = new int [TAM];
        b = new int [TAM];

        for(int i = 0; i < TAM; i++){
            System.out.println("Entre com o " + (i + 1) + " valor de A: ");
            a[i] = in.nextInt();
            f = 1;

            for(int j = a[i]; j >= 1; j--){
                f = f * j;
            }

            b[i] = f;
        }

        System.out.println("\n Número base fatorial: ");
            for(int i = 0; i < TAM; i++){
                System.out.print(a[i] + " ");
            }
        
        System.out.println("\n Fatorial da base: ");
            for(int i = 0; i < TAM; i++){
                System.out.print(b[i] + " ");
            }

            in.close();
    }
}