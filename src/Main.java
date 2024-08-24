import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Retangulo[] retangulos = new Retangulo[5];

        for (int i = 0; i < retangulos.length; i++) {
            System.out.println("Informe a largura do retângulo " + (i + 1) + ":");
            double largura = scanner.nextDouble();

            System.out.println("Informe a altura do retângulo " + (i + 1) + ":");
            double altura = scanner.nextDouble();

            retangulos[i] = new Retangulo(largura, altura);
        }


        Arrays.sort(retangulos, (r1, r2) -> Double.compare(r1.calcularArea(), r2.calcularArea()));

        System.out.println("Retângulos ordenados por área:");
        for (Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
        }


        Retangulo[] retangulosExpandido = new Retangulo[10];
        System.arraycopy(retangulos, 0, retangulosExpandido, 0, retangulos.length);

        for (int i = 5; i < retangulosExpandido.length; i++) {
            System.out.println("Informe a largura do novo retângulo " + (i + 1) + ":");
            double largura = scanner.nextDouble();

            System.out.println("Informe a altura do novo retângulo " + (i + 1) + ":");
            double altura = scanner.nextDouble();

            retangulosExpandido[i] = new Retangulo(largura, altura);
        }

        System.out.println("Informações de todos os retângulos após a expansão:");
        for (Retangulo retangulo : retangulosExpandido) {
            retangulo.exibirInformacoes();
        }

        scanner.close();
    }
}
