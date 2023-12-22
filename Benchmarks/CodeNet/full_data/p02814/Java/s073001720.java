import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        Long[] a = new Long[n];
        int odd = 0, even = 0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong()/2;
            if(a[i]%2==0) even++;
            else odd++;
        }
        if(even>0&&odd>0) return 0;
        Arrays.sort(a,Collections.reverseOrder());
        // gcd and stuff
        long g = gcd(a[0],a[0]);
        for(int i=1;i<n;i++){
            g = gcd(g,a[i]);
        }
        boolean flag = true;
        long[] b = new long[n];
        for(int i=0;i<n;i++){
            b[i] = a[i]/g;
            flag &= (b[i]%2==1);
            if(!flag) break;
        }
        if(!flag) return 0;
        long lcm = b[0];
        for(int i=1;i<n;i++){
            lcm = getLcm(lcm,b[i]);
            if(lcm>m) return 0;
        }
        long lower = lcm*g;
        if(m<lower) return 0;
        long diff = lcm*2*g;
        if((m-lower)%diff==0) {
            return (m-lower)/diff+1;
        }
        return (m-lower)/(diff)+1;
    }
    long gcd(long a, long b){
        if(a<b){
            long c = a;
            a = b; b = c;
        }
        while(a%b!=0){
            long c = a%b;
            a = b; b = c;
        }
        return b;
    }
    long getLcm(long a, long b){
        return a/gcd(a,b)*b;
    }
}

