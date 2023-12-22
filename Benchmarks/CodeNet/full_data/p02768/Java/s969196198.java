import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long count = 0;
        long mult = 1;
        long div = 1000000007;
        for(int i=1; i<n; i++){
            mult = (mult * (n - i) / (i)) % div;
            if(n!=a && n!=b){
                count = (count + mult) % div;
            }
        }
        System.out.println(count);
    }
}