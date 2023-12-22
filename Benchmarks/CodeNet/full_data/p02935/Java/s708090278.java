import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i=0;i<n;i++) {
			v[i]=sc.nextInt();
		}
		
		Arrays.sort(v);
		double ans=(v[0]+v[1])/2.0;
		for(int i=2;i<n;i++) {
			ans = (ans+v[i])/2.0;
		}
		
		System.out.println(ans);
		
	}
		


}
