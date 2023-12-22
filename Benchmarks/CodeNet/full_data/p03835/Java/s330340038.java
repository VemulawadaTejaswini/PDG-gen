import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int ans = 0;
		for(int x=0;x<=k;x++) {
			for(int y=0;y<=Math.min(s-x, k);y++) {
				for(int z=0;z<=Math.min(s-x-y, k);z++) {
					if(x+y+z==s) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}