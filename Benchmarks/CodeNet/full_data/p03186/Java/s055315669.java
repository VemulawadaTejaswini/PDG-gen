import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int ans = 0;
		ans += Math.min(a+b,c);//毒入りを何枚食べれるか
		c -= ans;
		if(c == 0){//毒入りを全て食べられる
			int tmp = Math.min(b,ans);
			ans += Math.min(b,ans);
			ans += Math.max(0, b - tmp);
		}else{
			ans += b + 1;
		}
		System.out.println(ans);

	}

}
//end