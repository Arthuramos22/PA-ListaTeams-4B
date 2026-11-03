package vetor2;

public class javaElevados{

    public static void main (String[] args){
        final int TAM = 11;
        int a[], p = 1;

        a = new int [TAM];

        for(int i = 0; i < TAM; i++){
            a[i] = p;
            p = p * 2;
        }

        System.out.println("\n Valores finais: ");
            for(int i = 0; i < TAM; i++){
                System.out.print(a[i] + " ");
            }
    }
}