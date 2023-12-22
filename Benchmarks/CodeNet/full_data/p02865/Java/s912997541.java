import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans;
        if (n < 3) {
            ans = 0;
        } else if (n % 2 == 0) {
            ans = n / 2 - 1;
        } else {
            ans = n / 2;
        }
        System.out.println(ans);

        sc.close();
    }

}
