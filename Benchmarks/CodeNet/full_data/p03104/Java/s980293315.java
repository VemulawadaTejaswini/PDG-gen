import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        sc.close();

        long ans = a;

        for (long i = a + 1; i <= b; i++) {
            ans = ans ^ i;
        }

        System.out.println(ans);
    }

}