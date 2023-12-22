import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int M = io.nextInt();
		ArrayList<LinkedList<Integer>> favor = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			favor.add(new LinkedList<Integer>());
			for (int j = 0; j < M; j++) {
				favor.get(i).offer(io.nextInt());
			}
		}
		boolean[] fire = new boolean[M+1];//1.2...M
		int ans = Integer.MAX_VALUE;
		while(favor.get(0).size()>0){
			int[] count = new int[M+1];
			int max = 0;
			int maxNum = 0;
			for (int i = 0; i < N; i++) {
				int num = favor.get(i).peek();
				count[num] ++;
				if(count[num]>max){
					max = count[num];
					maxNum = num;
				}
			}
			ans = Math.min(ans, max);
			fire[maxNum] = true;
			for(int i=0;i<N;i++){
				LinkedList<Integer> now = favor.get(i);
				while(now.size()>0 && fire[now.peek()]) now.poll();
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}