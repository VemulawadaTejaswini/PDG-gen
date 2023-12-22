import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] ary = new int[N];
        int[] aryOrg = new int[N];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
            aryOrg[i] = a;
        }
        Arrays.sort(ary);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (ary[i] == aryOrg[i]) {
                cnt++;
            }
        }
        if (N - cnt == 2 || N - cnt == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}