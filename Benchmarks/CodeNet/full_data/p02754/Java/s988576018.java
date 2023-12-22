import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		long N = Long.parseLong(n);
		String a = sc.next();
		long A = Long.parseLong(a);
		String b = sc.next();
		long B = Long.parseLong(b);
		long ans;
		long mult = N / (A + B);
		long ex = N - (A + B) * mult;
		if(A == 0){
			ans = 0;
		}else{
			ans = mult * A;
			if(ex <= A){
				ans += ex;
			}else{
				ans += A;
			}
		}
		System.out.println(ans);
	}
}