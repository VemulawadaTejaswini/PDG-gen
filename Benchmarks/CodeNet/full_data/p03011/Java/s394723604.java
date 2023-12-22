import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数型を宣言して読み込む
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		int a=0;
		int b=0;	
		int c=0;		
		a=P+Q;
		b=P+R;
		c=Q+R;		
		int ans=0;
		ans=Math.min(a, (Math.min(b, c)));
		System.out.println(ans);
			}
}