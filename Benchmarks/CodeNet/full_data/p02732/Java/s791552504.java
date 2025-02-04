import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if (hash.containsKey(a[i]))hash.put(a[i],hash.get(a[i])+1);
            else hash.put(a[i],1);
        }
        for (int i=0;i<n;i++){
            hash.put(a[i],hash.get(a[i])-1);
            long ans = 0;
            for (int j:hash.values()){
                ans+=combination(j,2);
            }
            hash.put(a[i],hash.get(a[i])+1);
            System.out.println(ans);
        }
    }
    static long factorial(long num){
        if (num<2)return 1;
        else return num*factorial(num-1);
    }
    static int arraySum(int[] array){
        int ans = 0;
        for (int value : array) ans += value;
        return ans;
    }
    static long combination(long a, long b){
        long data = 1;
        for (int i=0;i<b;i++){
            data*=a-i;
        }
        return data/factorial(b);
    }
    static double log(double base,double antilogarithm){
        return Math.log(antilogarithm)/Math.log(base);
    }

    static long gcd(long x,long y){
        if (y==0)return x;
        else return gcd(y,x%y);
    }
    static long lcm(long x,long y){
        return x/gcd(x,y)*y;
    }
    static HashMap<Long,Long> factorization(long num){
        HashMap<Long,Long> hash = new HashMap<>();
        long n = num;
        long count = 2;
        while (n>1){
            while (n%count==0){
                n/=count;
                if (hash.containsKey(count))hash.put(count,hash.get(count)+1);
                else hash.put(count,1L);
            }
            count++;
        }
        return hash;
    }

}
