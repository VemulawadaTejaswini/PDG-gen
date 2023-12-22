import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static long f(long b, long n){
        if(n < b)
            return n;
        return f(b, n / b) + ( n % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        if (n < s)
            System.out.println(-1);
        else if(n == s)
            System.out.println(n + 1);
        else{
            ArrayList<Long> divisors = new ArrayList<>();
            long diff = n - s;
            long index = 1;
            while(index * index <= diff){
                if(diff % index == 0){
                    divisors.add(index);
                    if(diff / index != index)
                        divisors.add(diff / index);
                }
                index += 1;
            }
            Collections.sort(divisors);
            for(long div: divisors){
                if(f(div + 1, n) == s){
                    System.out.println(div + 1);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}
