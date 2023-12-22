import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, c;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            c = 0;
            for (int i = 0;i < n; i++) {
                int x = cin.nextInt();
                int rem = x % 2;
                while (rem == 0) {
                    x = x / 2;
                    c++;
                    rem = x % 2;
                }
            }
        }

        System.out.println(c);
    }
}