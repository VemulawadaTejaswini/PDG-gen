import java.util.Scanner;

class Main {
    public static int gcd(int a, int b, int c) {
        int gcd = 1;
        for (int i = 1; i <= Math.max(Math.max(a, b),c); i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= num; k++) {
                    sum += gcd(i,j,k);
                }
            }
        }
        System.out.println(sum);
    }
}