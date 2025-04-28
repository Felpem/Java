public class NumeroPar {
    public static void main(String[] args) {
        int numero, resto;

        for (numero = 0; numero <=50; numero++){
            resto = numero % 2;
            if (resto == 0){
                System.out.println(numero);
            }
        }
    }
}
