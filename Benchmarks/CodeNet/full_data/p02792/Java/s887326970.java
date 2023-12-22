import java.util.Scanner;

public class Main {

    private static int f(int i, int j, int n) {
        int r = 0;
        for (int k = 1; k <= n; k++) {
            String s = Integer.toString(k);
            if (Integer.parseInt(s.substring(0, 1)) == i && Integer.parseInt(s.substring(s.length() - 1)) == j)
                r++;
        }
        return r;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int r = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    r += f(i, j, n) * f(j, i, n);
                }
            }
            System.out.println(r);
        }
    }

}
