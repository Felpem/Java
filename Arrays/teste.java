import java.util.Arrays;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        int somaTotalArray=0, maiorArray = Integer.MIN_VALUE, menorArray = Integer.MAX_VALUE;
        int[] lista;
        int posicaoArray;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Arrays Quant: ");
        posicaoArray = sc.nextInt();
        lista = new int[posicaoArray];

        for(int i = 0; i < posicaoArray; i++){

            System.out.print("N"+ i + "°: ");
            lista[i] = sc.nextInt();
            somaTotalArray += lista[i];

            if (lista[i] > maiorArray){
                maiorArray = lista[i];
            }
            if (lista[i] < menorArray) {
                menorArray =  lista[i];
            }
        }


        System.out.println("A soma do Array: " + somaTotalArray);
        System.out.println("O maior do Array: " + maiorArray);
        System.out.println("O menor do Array: " + menorArray);
        System.out.println(Arrays.toString(lista) + "\n");



    }
}
