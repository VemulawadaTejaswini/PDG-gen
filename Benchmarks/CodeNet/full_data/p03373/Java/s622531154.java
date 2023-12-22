import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int ans1 = A*X + B*Y;
		int ans2 = 0;
		if( X < Y ){
			ans2 = C*X + B*(Y-X);
		}else{
			ans2 = C*Y + A*(X-Y);
		}
		int ans3 = C*Math.max(X,Y);
		System.out.println( Math.min(ans1,Math.min(ans2,ans3)) );
	}
}
