import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        long bcount = 0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    bcount++;
                }
            }
        }
        
        long acount = 0;
        int now = array[0];
        int nowplus = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] == now) {
                acount += nowplus;
            } else {
                acount += i;
                nowplus = i;
                now = array[i];
            }
        }
        
        long ret = (bcount + (k-1) * acount) % 1000000007;
        
        System.out.println(ret);
    }
}
