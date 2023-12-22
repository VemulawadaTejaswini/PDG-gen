import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans;
		if(A == 0){
			ans = 0;
		}else{
			ans = (N / (A + B)) * A;
			if(N % (A + B) <= A){
				ans += N % (A + B);
			}else{
				ans += A;
			}
		}
		System.out.println(ans);
	}
}