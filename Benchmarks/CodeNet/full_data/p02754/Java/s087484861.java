import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long n = Long.parseLong(stdIn.next());
        long a = Long.parseLong(stdIn.next());
        long b = Long.parseLong(stdIn.next());

        long ans = (n / (a + b)) * a;
        if (n % (a + b) >= a) {
            ans += a;
        } else {
            ans += n % (a + b);
        }

        System.out.println(ans);
    }
}
