import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que = new ArrayDeque<Integer>();
		for(int i=0;i<n;i++) {
			que.add(sc.nextInt());
		}
		int ans =0;
		while(que.size() != 0) {
			ans++;
			int val = -1;
			int loop = que.size();
			for(int i=0;i<loop;i++) {
				if(val < que.peek()) {
					val = que.remove();
				}else {
					int temp = que.remove();
					que.add(temp);
				}		
			}
		}
		System.out.println(ans);
		
		
	}
}