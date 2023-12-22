import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int kind = 1;
        int[] sum = new int[n];
        for (int i = 1; i < n; i++) {
            kind += a[i - 1] == a[i] ? 0 : 1;
            sum[i] = sum[i - 1] + (a[i - 1] == a[i] ? 1 : 0);
        }
        for (int i = 1; i < n-1; i++) {
            if(a[i - 1] == a[i] && a[i] == a[i+1] && (sum[n-1] - sum[i])%2 == 0) {
                System.out.println(kind);
                return;
            }
        }
        System.out.println(kind-1);
    }
}