package vetor2;

import java.util.Scanner;

public class java{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 20;
        int a[], b[], cb = 0;

        a = new int [TAM];
        b = new int [TAM];

        for(int i = 0; i < TAM; i++){
            System.out.println("Entre com o valor " +(i+1)+ " do vetor A:");
            a[i] = in.nextInt();

            if(a[i] % 2 == 0){
                if(cb < TAM){
                    b[cb] = a[i];
                    cb++;
                }
            }
        }

        System.out.print("\n A");
        for(int i = 0 ; i < TAM; i++){
            System.out.println(a[i] + " ");
        }
        System.out.print("\n B");
        for(int i = 0; i< cb; i++){
            System.out.println(b[i] + " ");
        }

        in.close();
    }
}