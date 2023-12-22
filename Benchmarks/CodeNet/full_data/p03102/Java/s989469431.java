import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		int[] bnums = new int[m];
		for(int i=0; i<m; i++) {
			bnums[i] = sc.nextInt();
		}
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		for(int i=0; i<n; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j=0; j<m; j++) {
				list.add(sc.nextInt());
			}
			lists.add(list);
		}
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			List<Integer> tmp = lists.get(i);
			int sum = 0;
			for(int p=0; p<m; p++) {
				sum += tmp.get(p)*bnums[p];
			}
			if(sum+c>0) {
				cnt++;
			}else {
				continue;
			}
		}
		System.out.println(cnt);
	}
	
}
