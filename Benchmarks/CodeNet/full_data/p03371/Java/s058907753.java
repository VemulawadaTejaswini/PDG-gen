import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans = 1000000000;
		for(int i = 0;i < Math.max(X,Y) + 1;i++){
			ans = Math.min(ans,2 * C * i + A * seisu(X - i) + B * seisu(Y - i));
		}
		System.out.println(ans);
	}
	public static int seisu(int a){
		if(a > 0){
			return a;
		}
		return 0;
	}
}