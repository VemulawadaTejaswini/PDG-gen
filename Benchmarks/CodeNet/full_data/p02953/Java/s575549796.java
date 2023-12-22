import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        boolean ans = true;
        for (int i = 0; i < n - 1; i++) {
            if (h[i + 1] < h[i]) {
                h[i]--;
                if ((i != 0 && h[i - 1] > h[i]) || h[i + 1] < h[i]) {
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans?"Yes":"No");
    }
}
