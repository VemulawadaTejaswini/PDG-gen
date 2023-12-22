import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        sc.close();
        if (a <= b) {
            System.out.println(-1);
            return;
        }
        if (k <= a) {
            System.out.println(1);
            return;
        }
        long ans = (k - a) / (a - b);
        if ((k - a) % (a - b) != 0) {
            ans++;
        }
        System.out.println(ans * 2 + 1);
    }
}