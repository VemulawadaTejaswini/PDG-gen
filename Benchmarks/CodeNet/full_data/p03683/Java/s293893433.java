import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] converter = sc.nextLine().split(" ");
        int n = Integer.parseInt(converter[0]);
        int m = Integer.parseInt(converter[1]);
        
        if((n > (long)Math.pow(10, 5) && n < 1) && (m > (long)Math.pow(10, 5) && m < 1))
            return;
        
        if(Math.abs((double)n - (double)m) > 2.0)
            System.out.println(0);
        else if(n == m){
            System.out.println(factorial(m) * factorial(n) * 2);
        }
        else{
            System.out.println(factorial(m) * factorial(n));
        }
    } 
    
    private static long factorial(int n){
        long f = 1;
 
        for (int i = 1; i <= n; i++)
            f = (f * i % 1000000007); 
        return f;
    }
}
