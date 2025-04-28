import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        int lados, rep;
        String linha;
        Scanner leia = new Scanner(System.in);
        System.out.print("Lados: ");
        lados = leia.nextInt();

        for(rep = 0; rep < lados; rep++){
            linha = "* ".repeat(lados);
            System.out.println(linha);
            leia.close();
        }
        
    }
}
