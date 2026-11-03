package vetor2;

import java.util.Scanner;

public class javaTabuada{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int a[], t;

        a = new int [TAM];

        for(int i = 0; i < TAM; i++){
            System.out.println("Entre com o valor " +(i+1)+ " do vetor A, para saber sua tabuada:");
            a[i] = in.nextInt();
        } 

        for(int i = 0; i < TAM; i++){
            System.out.println("\n Tabuada do número " + a[i]);

                for(int j = 1; j < 11; j++){
                    t = a[i] * j;
                        System.out.println(a[i] + " X " + j + " = " + t);
                }
        }
        
        in.close();
    }
}