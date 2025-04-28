import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int resultado=0, fator2=0,fator, entrada, fim=0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Fatorial: ");
        entrada = leia.nextInt();
        for (fator = 1; fator <= entrada; fator++){
            resultado = entrada * fator2;
            fator2 = entrada-fator;
            System.out.println(resultado);
        }
        System.out.println(entrada+"!: "+ resultado);
    }
}
