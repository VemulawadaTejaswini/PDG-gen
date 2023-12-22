import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long n = gcd(A, B);
        long max = n;
        long count = 1;
        for(int i = 2; i <= Math.sqrt(max)+1; i++){
            if(n%i == 0){
                while(n%i == 0){
                    n /= i;
                }
                count++;
            }
        }
        if(max != 1 && n == max)
            count++;
        System.out.println(count);
    }
    static long gcd(long a, long b){
        if(a < b){
            return gcd(b, a);
        } else {
            if(b == 0)
                return a;
            else
                return gcd(b, a%b);
        }
    }
}