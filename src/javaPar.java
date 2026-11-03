package vetor2;

import java.util.Scanner;

public class javaPar{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[];

        a = new int [TAM];

        for(int i = 0; i < TAM; i++){
            System.out.println("Entre com o valor " +(i + 1)+ " do vetor A:");
            a[i] = in.nextInt();

        System.out.println("\n Os números pares de 0 até " + a[i]);
            for(int j = 0; j <= a[i]; j++){
                if(j % 2 == 0){
                    System.out.println(j + " ");
                }
            }
        }

        in.close();
    }
}