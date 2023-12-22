import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(s.substring(i,i+1).equals("I")) {
				count += 1;
			}else {
				count -= 1;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}

}