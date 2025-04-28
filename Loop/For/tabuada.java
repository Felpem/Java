import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        int fator1, fator2, produto;
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual tabuada quer ver: ");
        fator1 = leia.nextInt();

        for (fator2 = 1; fator2 <= 10; fator2++){
            produto = fator1 * fator2;
            System.out.println(fator1 + " x " + fator2 + " = " + produto);
        }
    }
}
