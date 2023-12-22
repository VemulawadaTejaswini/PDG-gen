import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean b = true;
        for (int i=0;i<n;i++){
            b&=s.charAt(i)==s.charAt(n-1-i);
        }
        for (int i=0;i<(n-1)/2;i++){
            b&=s.charAt(i)==s.charAt((n-1)/2-1-i);
        }
        for (int i=(n+3)/2-1;i<n;i++){
            b&=s.charAt(i)==s.charAt(n-1-i+(n+3)/2-1);
        }
        if (b)System.out.println("Yes");
        else System.out.println("No");
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

}
