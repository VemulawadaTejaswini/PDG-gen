import java.util.*;
import java.lang.*;

import java.util.*;
import java.io.*;

class Mod{
    static final long MOD = 1000_000_007;
    static final long[] fact = makeFactorialArray(1000000);
    static final long[] factInv = makeInversedArray(fact);

    public static long add(long a, long b){
        long tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long sub(long a, long b){
        return add(a,-b);
    }
    public static long mult(long a, long b){
        long tmp = (a*b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long power(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
            long half = power(a,x/2);
            return mult(half,half);
        }
        return (a*power(a,x-1)) % MOD;
    }
    public static long inverse(long a){
        return power(a,MOD-2);
    }
    public static long div(long a, long b){
        return mult(a, inverse(b));
    }
    public static long[] makeFactorialArray(int size){
        long[] array = new long[size];
        array[0]=1;
        for(int i=1;i<size;i++){
            array[i]=mult(array[i-1],i);
        }
        return array;
    }
    public static long[] makeInversedArray(long[] original){
        long[] array = new long[original.length];
        for(int i=0;i<original.length;i++){
            array[i] = inverse(original[i]);
        }
        return array;
    }
    public static long combination(int n, int r){
        if(n<0 || r<0 || n<r) return 0;
        return mult(fact[n], mult(factInv[r],factInv[n-r]));
    }
    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

}

class Counter<T> extends HashMap<T,Long>{
    long def;
    public Counter(long d){
        super();def=d;
    }
    public Long get(Object elm){
        return getOrDefault(elm,def);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, Mod.add(def,amount));
        else replace(elm, Mod.add(get(elm),amount));
    }
    public void addOne(T elm){
        add(elm, 1L);
    }

}
public class Main {
    static int countAB(String s){
        return (s.length() - s.replaceAll("AB", "").length()) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();

        long[] X = new long[N+1];
        for(int n=0; n<N; n++) X[n+1]=X[n]^A[n];

        if(X[N]==0){
            Counter<Long> counter0 = new Counter<>(1);
            Counter<Long> counterX = new Counter<>(0);
            for(int n=1; n<N; n++){
                if(X[n]==0){
                    for(long x: counterX.keySet()) counter0.add(x, counterX.get(x));
                }
                else{
                    counterX.add(X[n], counter0.get(X[n]));
                }
            }

            long zeroOnly = 1L;
            for(int n=1; n<N; n++) if(X[n]==0) zeroOnly = Mod.mult(zeroOnly, 2);

            long ans = 0;
            for(long e: counterX.keySet()) ans = Mod.add(ans, counterX.get(e));
            ans = Mod.add(ans, zeroOnly);
            System.out.println(ans);

        }else{
            int endZero = 1, endX = 0;
            for(int n=1; n<N; n++){
                if(X[n]==0) endZero += endX;
                if(X[n]==X[N]) endX += endZero;
            }
            System.out.println(endZero);
        }

    }
}
