package vetor2;

import java.util.Scanner;

public class javaDivisor{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[];

        a = new int [TAM];

        for(int i = 0; i < TAM; i++){
            System.out.println("Entre com o valor " +(i + 1)+ " do vetor A:");
            a[i] = in.nextInt();

        System.out.println("\n Os divisores de " + a[i]);
            for(int j = 1; j <= a[i]; j++){
                if(a[i] % j == 0){
                    System.out.println(j + " ");
                }
            }
        }

        in.close();
    }
}