import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b=sc.nextInt();
		int ans=b;
		
		if(a<13) {
			ans =ans/2;
		}
		if(a<6) {
			ans = 0;
		}
		
		System.out.println(ans);
		
	}

}
