package vetor2;

import java.util.Scanner;

public class javaPalindromo{
    
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        final int TAM = 10;
        int a[], p = 0;

        a = new int [TAM];

        for(int i = 0; i < TAM; i ++){
            System.out.println("Entre com o " +(i+1)+ "º valor de A:");
            a[i] = in.nextInt();
        }
        for(int i = 0; i < TAM; i ++){
                if(a[i] == a[TAM - 1 - i]){
                    p++;
                }
        }
        
        if(p == TAM){
            System.out.println("O vetor é um palindromo.");
        }else{
            System.out.println("O vetor não é um palindromo.");
        }
        
        in.close();
    }
}
