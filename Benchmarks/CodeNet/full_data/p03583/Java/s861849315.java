import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long h = 1;
        long n = 1;
        long w = 1;
        boolean found = false;
        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                int k1 = N * i * j;
                int k2 = 4 * i * j - N * (i + j);
                if (k2 > 0 && k1 % k2 == 0) {
                    h = i;
                    n = j;
                    w = k1 / k2;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        sj.add(String.valueOf(h));
        sj.add(String.valueOf(n));
        sj.add(String.valueOf(w));
        System.out.println(sj);
    }

}
