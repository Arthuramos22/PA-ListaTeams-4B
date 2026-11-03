package vetor2;

import java.util.Scanner;

public class javaImparOuPar{

        public static void main(String[] args){
            Scanner in = new Scanner (System.in);
            final int TAM = 10;
            int a[], b[];

            a = new int [TAM];
            b = new int [TAM];

            for(int i = 0; i < TAM; i++){
                System.out.println("Entre com o " +(i+1)+ "º valor de A:");
                a[i] = in.nextInt();
                if(a[i] % 2 == 0){
                    b[i] = 1;
                }else{
                    b[i] = 0;
                }
            }

            System.out.println("\n Valores finais de A:");
            for(int i = 0; i < TAM; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();

            System.out.println("\n 1 para par e 0 para impar:");
            for(int i = 0; i < TAM; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
            
            in.close();
        }
}
