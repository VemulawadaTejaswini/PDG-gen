
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int n = sc.nextInt();
		long d = sc.nextInt();
		int a[] = new int[n];

		
		PriorityQueue<long[]> queue = new PriorityQueue<long[]>((l1,l2)->Long.compare(l1[2],l2[2]));

		for(int i = 0; i < n ; i++){
			a[i] = sc.nextInt();
			for(int j = 0; j < i ; j++){
				queue.add(new long[]{i,j, (i-j)*d+a[i]+a[j]});
			}
		}
		
		int uf[] = new int[n];
		for(int i =0 ; i < n ;i++){
			uf[i] = i;
		}
		
		long ans = 0L;
		int count = n-1;
		for(;count > 0;){
			long[] node = queue.poll();
			
			if(find(uf,(int)node[0]) ==	find(uf,(int)node[1])){
				continue;
			}
			union(uf,(int)node[0],(int)node[1]);
			count--;
			ans += node[2];
		}
		
		System.out.println(ans);
		
	}
	
	int find(int[]uf, int i){
		if(uf[i] == uf[uf[i]]){
			return uf[i];
		}
		uf[i] = find(uf,uf[i]);
		return uf[i];		
	}
	
	void union(int[] uf,int i, int j){
		uf[find(uf,i)] = find(uf,j);
	}
	
}
