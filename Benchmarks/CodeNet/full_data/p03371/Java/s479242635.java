import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		long X = sc.nextInt();
		long Y = sc.nextInt();
		long ans = 500000000;
		for(long i = 0;i < Math.max(X,Y) + 1;i++){
			ans = Math.min(ans,2 * C * i + A * seisu(X - i) + B * seisu(Y - i));
		}
		System.out.println(ans);
	}
	public static long seisu(long a){
		if(a > 0){
			return a;
		}
		return 0;
	}
}