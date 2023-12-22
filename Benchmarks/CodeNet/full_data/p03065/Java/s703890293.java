import java.util.*;
import java.util.function.*;
import java.lang.*;

import java.util.*;
import java.io.*;

public class Main {
    static List<Long> primeDivisors(long X){
        List<Long> ans = new LinkedList<>();
        for(long d=2; d*d<=X; d++){
            if(X%d==0) ans.add(d);
            while(X%d==0) X /= d;
        }
        if(X>1) ans.add(X);
        return ans;
    }

    static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Long> a = new LinkedList<>();
        for(int n=N; n>=0; n--){
            long e = sc.nextLong();
            if(e!=0) a.add(Math.abs(e));
        }


        long g = a.peek();
        for(long e:a) g = gcd(g,e);

        List<Long> ans = primeDivisors(g);
        for(long p:ans) System.out.println(p);


    }
}