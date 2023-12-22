import java.util.*;
import java.io.*;

public class Main {
    static long f(long min, long max){
        if(min>max) return f(max,min);
        if(min+10<max){
            long ans = 0;
            for(long x=min; x<=max; x++) ans ^= x;
            return ans;
        }

        long ans = 0;
        if((min&1) != 0){
            ans ^= min;
            min++;
        }
        if((max&1) == 0){
            ans ^= max;
            max--;
        }

        long pair = (max-min+1)/2;
        if(pair%2 != 0) ans ^= 1L;

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        System.out.println(f(min, max));
    }
}