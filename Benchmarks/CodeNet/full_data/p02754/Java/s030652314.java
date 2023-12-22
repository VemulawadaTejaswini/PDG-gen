import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        if(A == 0)
        {
            System.out.println(ans);
        }
        else
        {
            int a = A + B; //青と赤の足し算
            int b = N % a; // 余
            int c = N / a;
            if(b<=A)
            {
                ans = A * c + b;
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
