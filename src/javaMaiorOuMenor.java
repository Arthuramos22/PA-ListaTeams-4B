package vetor2;

import java.util.Scanner;

public class javaMaiorOuMenor {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            final int TAM = 10;
            int a[], b[], c[];

            a = new int [TAM];
            b = new int [TAM];
            c = new int [TAM];

            for(int i = 0; i < TAM; i++){
                System.out.println("Entre com o " +(i+1)+ "º valor de A:");
                a[i] = in.nextInt();
            }
            for(int i = 0; i < TAM; i++){
                System.out.println("Entre com o " +(i+1)+ "º valor de B:");
                b[i] = in.nextInt();
            }
            for(int i = 0; i < TAM; i++){
                if(a[i] > b[i]){
                    c[i] = 1;
                }
                if(a[i] == b[i]){
                    c[i] = 0;
                }
                if(a[i] < b[i]){
                    c[i] = (-1);
                }
            }
                System.out.println("\n Valores finais de A:");
                for(int i = 0; i < TAM; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();

                System.out.println("\n Valores finais de B:");
                for(int i = 0; i < TAM; i++){
                    System.out.print(b[i] + " ");
                }
                System.out.println();
                
                System.out.println("\n 1 Para A > B, 0 para A == B e -1 para A < B:");
                for(int i = 0; i < TAM; i++){
                    System.out.print(c[i] + " ");
                }
                System.out.println();

                in.close();
        }
}
