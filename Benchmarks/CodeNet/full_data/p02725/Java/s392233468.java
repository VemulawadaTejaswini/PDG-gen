import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<Integer> kyori = new ArrayList<>();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (i == 0) {
                kyori.add(a);
                max = a;
                sum = a;

            } else {
                int mae = kyori.get(i - 1);
                int aida = a - mae;
                kyori.add(aida);
                sum = sum + aida;

                if (aida > max) {
                    max = aida;
                }
            }
        }
        int saigo = k - sum;
        kyori.add(saigo);
        sum = sum + saigo;

        if (saigo > max) {
            max = saigo;
        }

        System.out.println(sum - max);
    }
}