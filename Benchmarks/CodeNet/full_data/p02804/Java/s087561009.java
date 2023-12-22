import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        int m = in.nextInt();
        in.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMax(arr, m));
    }
 
    private static int getMax(int[] arr, int m) {
        Arrays.sort(arr);
        long sum = 0;
        int mod = 1000000007;
        int l = arr.length;
        long base = 1;

        for (int i = 0; i <= l - m; i++) {
            sum = (sum + base * arr[m + i - 1] - base * arr[l - m - i]) % mod;
            base = (base * (m + i) / (i + 1)) % mod;
        }

        return (int) ((sum + mod) % mod);
    }
}
