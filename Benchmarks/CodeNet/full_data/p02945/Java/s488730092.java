import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b=sc.nextInt();
		int ans;
		ans = Math.max(a+b, a-b);
		ans = Math.max(ans, a*b);
		
		System.out.println(ans);
		
	}

}
