import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int ans = 0;
        boolean b = true;
        while(b) {
            for (int i = n - 1; i >= -1; i--) {
                if (i == -1) {
                    b = false;
                } else {
                    if (array[i] % 2 == 0) {
                        array[i] /= 2;
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }    
}
