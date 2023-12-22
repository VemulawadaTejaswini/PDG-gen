import java.util.Scanner;

class Main {
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= num; k++) {
                    sum += gcd(i,gcd(j,k));
                }
            }
        }
        System.out.println(sum);
    }
}