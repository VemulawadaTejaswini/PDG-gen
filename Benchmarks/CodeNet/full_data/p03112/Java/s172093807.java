import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int Q = Integer.parseInt(s[2]);
        long[] a = new long[A];
        long[] b = new long[B];
        for(int i = 0 ; i < A ; i++) {
            a[i] = Long.parseLong(stdR.readLine());
        }
        for(int i = 0 ; i < B ; i++) {
            b[i] = Long.parseLong(stdR.readLine());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0 ; i < Q ; i++) {
            long x = Long.parseLong(stdR.readLine());
            int indexa = highx(a,x);
            int indexb = highx(b,x);
            ArrayList<Long> numsa = new ArrayList<Long>();
            numsa.add(a[indexa]);
            ArrayList<Long> numsb = new ArrayList<Long>();
            numsb.add(b[indexb]);
            if(indexa - 1 >= 0)numsa.add(a[indexa - 1]);
            if(indexb - 1 >= 0)numsb.add(b[indexb - 1]);
            if(indexa + 1 < A)numsa.add(a[indexa + 1]);
            if(indexb + 1 < B)numsb.add(b[indexb + 1]);
            long min = Long.MAX_VALUE;
            for(int j = 0 ; j < numsa.size() ; j++) {
                for(int k = 0 ; k < numsb.size() ; k++) {
                    long resa = numsa.get(j);
                    long resb = numsb.get(k);
                    if(resa <= x) {
                        if(resb <= x) {
                            if(resa <= resb) {
                                min = Math.min(min, x - resa);
                            }else {
                                min = Math.min(min, x - resb);
                            }
                        }else {
                            if(Math.abs(x - resa) <= Math.abs(x - resb)) {
                                min = Math.min(min, x - resa + resb - resa);
                            }else {
                                min = Math.min(min, resb - x + resb - resa);
                            }
                        }
                    }else {
                        if(resb >= x) {
                            if(resa <= resb) {
                                min = Math.min(min, resb - x);
                            }else {
                                min = Math.min(min, resa - x);
                            }
                        }else {
                            if(Math.abs(x - resa) <= Math.abs(x - resb)) {
                                min = Math.min(min, resa - x + resa - resb);
                            }else {
                                min = Math.min(min, x - resb + resa - resb);
                            } 
                        }
                    }
                }
            }
            System.out.println(min);
        }
    }
    
    public static int highx(long[] a, long x) {
        int lowid = 0;
        int highid = a.length - 1;
        while(lowid < highid) {
            int midid = (lowid + highid) / 2;
            if(a[midid] == x) {
                return midid;
            }else if(a[midid] < x) {
                lowid = midid + 1;
            }else {
                highid = midid - 1;
            }
        }
        return lowid;
    }
}
