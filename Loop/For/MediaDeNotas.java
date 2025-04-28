import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        int quantidade, cadastro;
        double soma=0, media;
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantas notas deseja cadastrar: ");
        cadastro = leia.nextInt();

        for(quantidade = 0; quantidade < cadastro; quantidade++){
            System.out.print("Nota " + (quantidade+1) + ": ");
            soma =+ leia.nextDouble();
        }
        media = soma/quantidade;
        System.out.println("A media é: " + media);
        
    }
}
