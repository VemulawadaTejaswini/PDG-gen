import java.util.*;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ans = 0;
		if (Math.abs(A-B)%2 == 0) {
			ans = Math.abs(A-B)/2;
		} else {
			ans = N-1-Math.max((N - Math.max(A, B)), (Math.min(A, B)-1));
		}
		System.out.println(ans);
	}
}