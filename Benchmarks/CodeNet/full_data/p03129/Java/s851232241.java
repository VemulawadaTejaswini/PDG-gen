import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i+=2) {
            count++;
        }

        if (count >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
