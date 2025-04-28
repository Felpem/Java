import java.util.Scanner;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int fib, numero1=0, numero2=1, proximo=0, sequen;
        Scanner leia = new Scanner(System.in);
        System.out.print("Numero: ");
        fib = leia.nextInt();
        for(sequen = 0; sequen < fib; sequen++){
            System.out.println(numero1);
            proximo = numero1 + numero2;
            numero1 = numero2;
            numero2 = proximo;
        }
    }
}
