import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] arr = new int[n+1];
        for (int i = 0; i < n-1; ++i) {
            if (s.charAt(i) == 'A' && s.charAt(i+1) == 'C')
                arr[i+1] = arr[i] + 1;
            else
                arr[i+1] = arr[i];
        }

        for (int i = 0; i < k; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            System.out.println(arr[b] - arr[a]);
        }
    }
}