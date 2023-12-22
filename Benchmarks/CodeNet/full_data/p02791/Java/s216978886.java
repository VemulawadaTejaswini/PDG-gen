import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            boolean all = true;
            for (int j = i - 1; j >= 0; j--) {
                if (p[j] < p[i]) {
                    all = false;
                    break;
                }
            }
            if (all) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
