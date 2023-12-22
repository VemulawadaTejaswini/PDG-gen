import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Pair<F, S>{
	F first;
	S second;
	public Pair(F f, S s) {
		first = f;
		second = s;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Pair<Integer, Integer>[] nums = new Pair[N + M];
		for(int i = 0; i < N; i++) {
			nums[i] = new Pair<Integer, Integer>(sc.nextInt(), 1);
		}
		for(int i = 0; i < M; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			nums[N + i] = new Pair<Integer, Integer>(C, B);
		}
		Arrays.sort(nums, new Comparator<Pair<Integer, Integer>>(){
			public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
				return o2.first - o1.first;
			}
		});
		long ans = 0;
		int cardnum = 0;
		for(int i = 0; i < nums.length; i++) {
			int add_card_num = Math.min(nums[i].second, N - cardnum);
			cardnum += add_card_num;
			ans += (long)add_card_num * (long)nums[i].first;
			if(cardnum == N) break;
		}
		System.out.println(ans);
	}
}