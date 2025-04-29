import java.io.*;
public class OlaMundo {
    public static void main(String[] args) {
        FileWriter escreverOlaMundo;
        try{
            escreverOlaMundo = new FileWriter("OlaMundo.txt");
            escreverOlaMundo.write("Olá Mundo!");;
            escreverOlaMundo.close();
        }
        catch (Exception e) {
            System.out.println("Erro.");
        }
    }  
}