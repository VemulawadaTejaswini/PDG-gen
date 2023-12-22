import java.awt.List;
import java.util.*;
public class Main {
	static int modNum = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		
		long ans = 1;
		ans += (a / 11) * 2;
		if(a % 11 > 6){
			ans++;
		}
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		for(int i=1;i<=a*2;i++){
//			int b = sc.nextInt();
//			list.add(b);
//		}


		
		System.out.println(ans);
		sc.close();
	}
}