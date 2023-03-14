import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero;
        double e = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite um número");
            numero = s.nextInt();
            if (numero<1) {
                System.out.println("Valor inválido. Digite outro número");
            }
            else {
                fatorial(numero);
            }
        } while (numero!=0);

    }

    public static void fatorial (double numero) {

        double e = 1;
        for (double i=1; i<=numero; i++) {
            double fatorial = 1;
            for (double s = i; s>=1; s--) {
                fatorial = fatorial * s;
            }
            e = e + 1/fatorial;
        }

        System.out.println(+e);
    }

}