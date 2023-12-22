import java.util.*;

public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        boolean[] b = new boolean[n];
        b[0] = true;
        for (int i = 1; i < n; i++) b[i] = false;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b[1] == true) break;
            if (i == n - 1) {
                count = -1;
                break;
            }    
            for (int j = 0; j < n; j++) {
                if (b[j] == true) {
                   b[j] = false;
                   b[array[j] - 1] = true;
                   count++;
                }
            }
        }
        System.out.println(count);
    }    
}
