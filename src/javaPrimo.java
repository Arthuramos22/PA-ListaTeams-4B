package vetor2;

import java.util.Scanner;

public class javaPrimo{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], tt;

        a = new int [TAM];

        for(int i = 0; i < TAM; i++){
            System.out.println("Entre com o " + (i + 1) + " de A:");
            a[i] = in.nextInt();

            tt = 0;

            for(int j = 1; j <= a[i]; j++){
                if(a[i] % j == 0){
                    tt++;
                }
            }

                if(tt < 3){
                    System.out.println(a[i] + "É primo.");
                }else{
                    System.out.println(a[i] + "Não é primo.");
                }
            
        }
        
        in.close();
    }
}