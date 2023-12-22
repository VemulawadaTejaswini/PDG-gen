import java.util.*;
import java.io.*;


public class Main {

    static long divCeil(long x, long y){
        return (x+y-1)/y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 5;
        long N = sc.nextLong();
        long[] capacity = new long[T];
        for(int t=0; t<T; t++) capacity[t] = sc.nextLong();

        int bottleNeck = 0;
        for(int t=1; t<T; t++) if(capacity[t]<capacity[bottleNeck]) bottleNeck=t;

        System.out.println(divCeil(N, capacity[bottleNeck]) + T-1);




    }
}
