import sun.rmi.runtime.Log;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a <= 0 && b >= 0) {
            System.out.println("Zero");
            return;
        }
        long len = b - a + 1;
        int len_ = (int) len;
        long arr[] = new long[len_];
        for(int i = 0; i < len; i++) {
            arr[i] = a + i;
        }
        int result = Arrays.binarySearch(arr, 0);
        if(b < 0) {
            result++;
            result *= -1;
        }
        if(result <= 0 || result % 2 == 0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
}
