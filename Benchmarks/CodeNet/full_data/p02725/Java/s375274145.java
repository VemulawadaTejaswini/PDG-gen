import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        long k = scanner.nextInt();
        long n = scanner.nextInt();

        ArrayList<Long> kyori = new ArrayList<>();
        long max = 0;
        long sum = 0;

        for (long i = 0; i < n; i++) {
            long a = scanner.nextInt();
            if (i == 0) {
                kyori.add(a);
                max = a;
                sum = a;

            } else {
                long mae = kyori.get((int) (i - 1));
                long aida = a - mae;
                kyori.add(aida);
                sum = sum + aida;

                if (aida > max) {
                    max = aida;
                }
            }
        }
        long saigo = k - sum;
        kyori.add(saigo);
        sum = sum + saigo;

        if (saigo > max) {
            max = saigo;
        }

        System.out.println(sum - max);
    }
}
