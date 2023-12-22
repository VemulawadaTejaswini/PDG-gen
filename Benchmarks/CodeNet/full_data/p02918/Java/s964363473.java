import java.util.*;

public class Main {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
        }
        System.out.println(Math.min(count + k * 2, n - 1));
    }
}
