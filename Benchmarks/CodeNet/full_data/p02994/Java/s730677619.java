import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] taste = new int[n];
        for (int i = 1; i <= n; i++) {
            taste[i - 1] = l + i - 1;
        }

        int min = 105;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(Math.abs(taste[i]), min);
            sum += taste[i];
        }

        if (sum > 0) {
            System.out.println(sum - min);
        } else {
            // 0の場合は均等なので最小値も0で加算しても変わらない
            System.out.println(sum + min);
        }
    }
}
