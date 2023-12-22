import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int[] array = new int[n];
        for (int i = 0; i < n-1; i++) {
            if (c[i] == 'A' && c[i+1] == 'C') {
                array[i+1]++;
            }
        }
        
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + array[i-1];
        }
        // System.out.println(Arrays.toString(sum));
        
        while (q-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            // System.out.println(i + " " + j);
            System.out.println(sum[j] - sum[i]);
        }
    }
}