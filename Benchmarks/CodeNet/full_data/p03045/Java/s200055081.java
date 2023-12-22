import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		List<List<Integer>> card = new ArrayList<>();

		for(int i = 0 ; i < N ; i++){
			card.add(new ArrayList<>());
		}

		for(int i = 0 ; i < M ; ++i){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt();

			card.get(u).add(v);
			card.get(v).add(u);
		}

		sc.close();

		int ans = 0;
		boolean[] magic = new boolean[N+1];
		Arrays.fill(magic, false);

		for(int i = 0 ; i <  N ; i++){
			if(magic[i]){
				continue;//チェック済
			}

			magic[i] = true;
			ans ++;

			Queue<Integer> queue = new ArrayDeque<>();
			//未チェックのものをqueue.add
				queue.add(i);
			while(!queue.isEmpty()){
				int tmp = queue.poll();

					//pollした値とペアになっている数値をすべて確認

				for(int k = 0 ;k<card.get(tmp).size();k++){
					int tmp2 = card.get(tmp).get(k);
						if(magic[tmp2]){
							continue;
						}
				//つながっていればtrue
				magic[tmp2] = true;
				queue.add(tmp2);
				}
			}
		}
		System.out.println(ans);
	}
}
