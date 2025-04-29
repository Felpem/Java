import java.io.File;
import java.util.Scanner;

public class LerOlaMundo {
    public static void main(String[] args) {
        try{
            File olaFile = new File("OlaMundo.txt");
            Scanner leitor = new Scanner(olaFile);
            while (leitor.hasNextLine()) {
               String saida = leitor.nextLine();
               System.out.println(saida);
               System.out.println( olaFile.lastModified());
            }
            leitor.close();
        } 
        catch (Exception e) {
            System.out.println("Erro.");
        }
    }
}
