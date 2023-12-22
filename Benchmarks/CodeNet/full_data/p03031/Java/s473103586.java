import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<int[]> lists = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int k = sc.nextInt();
			int[] list = new int[k];
			for(int j = 0; j < k; j++) {
				list[j] = sc.nextInt();
			}
			lists.add(list);
		}
		
		int[] p = new int[M];
		
		for(int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < (1 << N); i++) {
			boolean flag = true;
			for(int j = 0; j < M; j++) {
				int on = 0;
				for(int k : lists.get(j)) {
					if((1 & (i >> (k - 1)))==1) {
						on++;
					}
				}
				if(on % 2 != p[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				sum++;
			}
		}	
		System.out.println(sum);	
	}
}
