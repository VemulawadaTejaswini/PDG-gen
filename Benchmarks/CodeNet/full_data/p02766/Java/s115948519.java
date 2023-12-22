import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n, k;
        n = cin.nextInt();
        k = cin.nextInt();

        int product = k;
        int count = 1;

        while(product <= n) {
            count++;
            product *= k;
        }

        System.out.println(count);
    }
}
