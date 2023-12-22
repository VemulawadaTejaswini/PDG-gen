import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] origin = new int[n];
		int[] b = new int[n];
		PriorityQueue<Integer> p_que = new PriorityQueue<>((a1,a2)->-a1+a2);
		for(int i=0;i<n;i++) {
			origin[i] = in.nextInt();
			b[i] = i+1-origin[i];
			if(b[i]==0) p_que.add(i);
		}
		int count = 0;
		int[] ans = new int[n];
		while(!p_que.isEmpty()) {
			int tmp = p_que.poll();
			for(int i=tmp;i<n;i++) {
				b[i]--;
				if(b[i]==0) p_que.add(i);
			}
			ans[count] = origin[tmp];
			count++;
		}
		if(count<n) System.out.println("-1");
		else {
			for(int i=n-1;i>=0;i--) {
				System.out.println(ans[i]);
			}
		}
		in.close();
	}

}
