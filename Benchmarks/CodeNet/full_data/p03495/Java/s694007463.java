import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ch = 0;
        int A[] = new int[N];
        int ans[] = new int[N];
        for (int i = 0; N > i; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for (int j = 1; N > j; j++) {
            if (A[j - 1] == A[j]) {
                ans[ch]++;
            } else {
                ch++;
            }
        }
        int re[] = new int[ch + 1];
        for (int z = 0; ch + 1 > z; z++) {
            re[z] = ans[z] + 1;
        }
        if (ch < K) {
            System.out.println("0");
        } else {
            int result = 0;
            Arrays.sort(re);
            for (int k = 0; ch - K >= k; k++) {
                result += re[k];
            }
            System.out.println(result);
        }
    }
}

