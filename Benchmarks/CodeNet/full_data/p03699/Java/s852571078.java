import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
            total += ans[i];
        }

        if (total % 10 == 0) {
            System.out.println("0");
        } else {
            System.out.println(total);
        }
    }

}
