import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int d, n;
        try (Scanner cin = new Scanner(System.in)) {
            d = cin.nextInt();
            n = cin.nextInt();
        }
        System.out.println((int) Math.pow(100.0, (double) d) * n);
    }
}