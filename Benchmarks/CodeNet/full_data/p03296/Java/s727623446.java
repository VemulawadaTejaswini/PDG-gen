import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] slimes = new int[n+2];

		for(int i = 0; i < n; i++){
			slimes[i] = sc.nextInt();
		}
		slimes[n] = 10001;
		slimes[n+1] = 10212;

		int nowcolor = slimes[0];
		int ans = 0;
		int count = 1;
		for(int i = 1; i <= n; i++){
			if(nowcolor == slimes[i]){
				count++;
			}else{
				ans += count / 2;
				count = 1;
				nowcolor = slimes[i];
			}
		}
		System.out.println(ans);

	}
}