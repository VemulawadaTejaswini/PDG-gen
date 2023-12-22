import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        boolean isOne = false;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if (temp == 1) {
                isOne = true;
            }
            a[i] = temp;
        }
        if (!isOne) {
            System.out.println(-1);
            return;
        }
        int ans = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != num) {
                ans++;
            } else {
                num++;
            }
        }
        System.out.println(ans);
    }
}