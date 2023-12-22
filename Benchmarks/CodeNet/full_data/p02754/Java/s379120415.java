import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans = 0;
        if(A == 0)
        {
            System.out.println(ans);
        }
        else
        {
            long a = A + B; //青と赤の足し算
            long b = N % a; // 余
            long c = N / a; // 商
            if(b<A)
            {
                ans = A * c + b;
                System.out.println(ans); 
            }
            else if(b>=A)
            {
                ans = A * c + A;
                System.out.println(ans); 
            }
            else 
            {
                ans = A * c;
                System.out.println(ans);
            }
        }
    }
}