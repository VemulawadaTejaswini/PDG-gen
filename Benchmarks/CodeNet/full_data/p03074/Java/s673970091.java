
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		int k = Integer.parseInt(sc.next());
		String sline = sc.next();
		int[] s = new int[n];
		for (int i=0; i<n; i++){
			s[i] = Integer.parseInt(String.valueOf(sline.charAt(i)));
		}
		sc.close();
		// 1-0-1-...でいくつセットで並んでいるか.00011100101=0332101(最初1は0個並んでいる.
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int now = 1;// 今見ている数
		int cnt = 0;// nowがいくつ並んでいるか
		for (int i=0; i<n; i++){
			if (s[i] == now) {
				cnt++;
			} else {
				nums.add(cnt);
				now = 1 - now;// これで0,1の入れ替えができる.
				cnt = 1;
			}
		}
		if(cnt != 0){
			nums.add(cnt);
		}
		// 1-0-1-...-0-1という形でほしい
		// 0で終わっている時は一つ足す
		if (nums.size() % 2 == 0) {
			nums.add(0);
		}

		int Add = 2*k + 1;
		int ans = 0;
		
		/*
		 * forループの外側に定義
		 */
		int left = 0;
		int right = 0;
		int tmp = 0; // [left, right)のsum
		
		// 1-0-1-0-1と続くので偶数番目だけ見る
		for (int i = 0; i < nums.size(); i += 2) {
			/*
			 * 次のleft, rightを計算
			 */
			int nextleft = i;
			int nextright = Math.min(i+Add, nums.size());
			/* 
			 * left,rightを移動する
			 */
			while(nextleft > left) {
				tmp -= nums.get(left);
				left++;
			}
			while(nextright > right) {
				tmp += nums.get(right);
				right++;
			}
			ans = Math.max(tmp, ans);
		}
		System.out.println(ans);
	}
}
