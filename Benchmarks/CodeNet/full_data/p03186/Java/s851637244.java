import java.util.Scanner;
public class eleni06 {

    public static void main(String[] args) {

        Scanner cadena = new Scanner(System.in);
        String linea = cadena.nextLine();
        String numeros[] = linea.split(" ");

        int i = 0;
        boolean band = true;

        int tamano = numeros.length;

        if (tamano == 3) {
            while (i < tamano && band) {
                int nume = Integer.parseInt(numeros[i]);
                if (nume < 0 || nume > 1000000000) {
                    band = false;
                }

                i++;

            }
            if (band) {
                int A = Integer.parseInt(numeros[0]);
                int B = Integer.parseInt(numeros[1]);
                int C = Integer.parseInt(numeros[2]);

                int anti = A + B;
                int maxVeneno = anti + 1;
                int totalDeliciosas = 0;

                if (C < maxVeneno) {
                    totalDeliciosas = B + C;
                } else {
                    totalDeliciosas = B + maxVeneno;
                }

                System.out.println(totalDeliciosas);

            }
        }
    }

}
