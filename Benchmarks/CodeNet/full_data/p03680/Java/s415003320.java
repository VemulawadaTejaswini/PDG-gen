import java.util.*;
 
public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = 0;
        b[0]++;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b[1] == 1) break;
            if (i == n - 1 || count >= n) {
                count = -1;
                break;
            }    
            for (int j = 0; j < n; j++) {
                if (count >= n) {
                    count = -1;
                    break;
                }
                if (b[j] == 1) {
                   b[j]++;
                   if (b[array[j] - 1] == 0) {
                       b[array[j] - 1]++;
                       count++;
                   } else {
                       count = -1;
                       break;
                   }
                }
            }
        }
        System.out.println(count);
    }    
}
