import java.util.Scanner;

public class Main {

    private static int f(String i, String j, int n) {
        int r = 0;
        for (int k = 1; k <= n; k++) {
            String s = Integer.toString(k);
            if (s.substring(0, 1).compareTo(i) == 0 && s.substring(s.length() - 1).compareTo(j) == 0)
                r++;
        }
        return r;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int r = 0;
            for (int i = 0; i < 10; i++) {
                String is = Integer.toString(i);
                for (int j = 0; j < 10; j++) {
                    String js = Integer.toString(j);
                    r += f(is, js, n) * f(js, is, n);
                }
            }
            System.out.println(r);
        }
    }

}
