import java.io.File;
import java.io.IOException;

public class Criararquivo{
    public static void main(String[] args) {
        File arquivo;

        try{
            arquivo = new File("teste.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo Criado.");  
            }
            else{
                System.out.println("Arquivo já existe.");
            }
        }
        catch(IOException e){
            System.out.println("Falha a criar arquivo.");
        }
    }
}