import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] ary = new Integer[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int idx = ~Arrays.binarySearch(ary, ary[i] + ary[j], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
                ans += idx - j - 1;
            }
        }
        System.out.println(ans);
    }
}