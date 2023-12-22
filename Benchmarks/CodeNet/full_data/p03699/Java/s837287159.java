import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s[] = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
            total += s[i];
        }

        if (total % 10 == 0) {
            Arrays.sort(s);
            for (int i = 0; i < n; i++) {
                if (s[i] % 10 != 0) {
                    total -= s[i];
                    System.out.println(total);
                    return;
                }
            }
            System.out.println(0);
            return;
        }
        System.out.println(total);

    }
}
