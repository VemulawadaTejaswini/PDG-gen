import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans;
		int mult = N / (A + B);
		int ex = N - (A + B) * mult;
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