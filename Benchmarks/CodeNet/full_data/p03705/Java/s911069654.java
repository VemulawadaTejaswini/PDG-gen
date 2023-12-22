import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        if (A > B || N < (A-B+1)) {
        	System.out.println(0);
        	return;
        }
        
        
        //処理
        N -= 2;
        long ans = B * N - A * N + 1;
        
        System.out.println(ans);
    }
}