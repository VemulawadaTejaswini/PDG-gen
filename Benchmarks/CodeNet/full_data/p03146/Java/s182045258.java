//package atcoder;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        HashSet<Long> set = new HashSet<>();
        set.add(n);
        long k = n % 2 == 0 ? n/2 : 3L*n + 1L;
        int count = 2;
        while(!set.contains(k)) {
            set.add(k);
            count++;
            if(k %2 == 0) {
                k /= 2;
            } else {
                k = 3L*k + 1L;
            }
        }
        System.out.println(count);

    }
}
