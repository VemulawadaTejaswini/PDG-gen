import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
            sum += a;
        }
        int temp = 0;
        int ans = sum;
        for (int i = 0; i < n; i++) {
            temp += ary[i];
            ans = Math.min(ans, Math.abs(sum - temp - temp));
        }
        System.out.println(ans);
    }
}