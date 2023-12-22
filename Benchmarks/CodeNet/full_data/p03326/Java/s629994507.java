import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long max = 0;
    public static long[] a_point;
    public static long[] b_point;
    public static long[] c_point;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        a_point = new long[n];
        b_point = new long[n];
        c_point = new long[n];
        for (int i = 0;i < n;++i){
            a_point[i] = sc.nextLong();
            b_point[i] = sc.nextLong();
            c_point[i] = sc.nextLong();
        }
        for (int i = 0;i < n;++i){
            boolean[] ma = new boolean[n];
            ma[i] = true;
            search(a_point[i],b_point[i],c_point[i],ma,1,m);
        }
        System.out.println(max);
    }


    public static void search(long a, long b, long c, boolean[] map,int count,int end){
        int n = a_point.length;
        P[] ps = new P[n];
        for (int i = 0;i < n;++i){
            if(map[i]){
                ps[i] = new P(i,-1);
                continue;
            }
            long a1 = a + a_point[i];
            long b1 = b + b_point[i];
            long c1 = c + c_point[i];
            long aft = Math.abs(a1) + Math.abs(b1) + Math.abs(c1);
            ps[i] = new P(i,aft);
        }
        Arrays.sort(ps,(p1,p2) -> p2.l - p1.l > 0 ? 1 : p2.l == p1.l ? 0 : -1);
        for (int i = 0;i < end - 1;++i){
            a += a_point[ps[i].index];
            b += b_point[ps[i].index];
            c += c_point[ps[i].index];
        }
        long bef = Math.abs(a) + Math.abs(b) + Math.abs(c);
        if(bef > max){
            max = bef;
        }
    }

    static class P{
        int index;long l;
        public P(int index,long l){this.index = index;this.l = l;}
    }


}
