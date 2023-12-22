import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        Arrays.sort(s);
        if (sum % 10 != 0) {
            System.out.println(sum);
        } else {
            boolean bre = false;
            for (int i = 0; i < n; i++) {
                if (s[i] % 10 != 0) {
                    System.out.println(sum - s[i]);
                    bre = true;
                    break;
                }
            }
            if (!bre) {
                System.out.println(0);
            }
        }
    }
}