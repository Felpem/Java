package Loop.While;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int fib, sequen, posicao, posicaof;
        Scanner leia = new Scanner(System.in);
        posicao = leia.nextInt();
        fib = 1;
        sequen = 0;
        posicaof = 0;
        while (posicaof < posicao) {
            
            int proximo = sequen + fib;
            fib = sequen;
            sequen = fib;
            posicaof = posicaof + 1;
            System.out.println(posicaof+ " " +fib);
            posicaof = posicaof + 1;
            System.out.println(posicaof+ " " +sequen);
        }
        System.out.println("ACABOU!");
    }
}
