import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long circle = sc.nextLong();
        ArrayList<Sushi> sushi = new ArrayList<Sushi>();
        long[] clockwise = new long[n+1];
        long[] clockwise2 = new long[n+1];
        long[] reversewise = new long[n+1];
        long[] reversewise2 = new long[n+1];
        for(int i = 0 ; i < n; i++){
            long d = sc.nextLong();
            long c = sc.nextLong();
            Sushi s = new Sushi(d,c);
            long pd = i != 0 ? sushi.get(i-1).d : 0;
            clockwise[i+1] = clockwise[i]+c+pd-d;
            clockwise2[i+1] = clockwise2[i]+c-2*(d-pd);
            sushi.add(s);
        }
        for(int i = 0; i < n; i++){
            long pd = i != 0 ? circle-sushi.get(n-i).d: 0;
            Sushi s = sushi.get(n-1-i);
            reversewise[i+1] = reversewise[i]+s.c+pd-(circle-s.d);
            reversewise2[i+1] = reversewise2[i]+s.c-2*(circle-s.d-pd);
        }
        long ans = -Long.MAX_VALUE;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                ans = Math.max(ans,clockwise[i]+reversewise2[j]);
                ans = Math.max(ans,reversewise[i]+clockwise2[j]);
            }
        }
        System.out.println(ans);
    }
}

class Sushi{
    long d,c;
    public Sushi(long d, long c){
        this.d = d;
        this.c = c;
    }
}
