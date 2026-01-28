import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contadorPositivos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double valor = leitura.nextDouble();

            if ( valor > 0) {
                contadorPositivos++;
                somaPositivos += valor;
            }

        }
        double media = somaPositivos / contadorPositivos;
        System.out.println(contadorPositivos + "valores positivos");
        System.out.printf("%.1f%n", media);

    }
}
