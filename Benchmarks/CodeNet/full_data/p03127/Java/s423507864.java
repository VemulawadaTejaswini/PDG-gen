import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] input = new long[n];
        for(int i = 0; i < n; i++){
            input[i] = sc.nextLong();
        }
        System.out.println(gcd(input));
    }
    
    private static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
    
    private static long gcd(long[] input){
        long result = input[0];
        for(int i = 1; i < input.length; i++)
        {
            result = gcd(result, input[i]);
        }
        return result;
    }
}