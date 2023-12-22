import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0; i < n; i++){
			int k = sc.nextInt();
			for(int j = 0; j < k; j++){
				int ik = sc.nextInt();
				list.add(ik);
			}
		}
		if(n == 1){
			System.out.println(list.size());
		}else{
			int[] count = new int[m];
			int a = 0;
			for (int v : list) {
				count[v - 1]++;
			}
			int cnt = 0;
			for(int i = 0; i < m; i++){
				if(count[i] == n){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}