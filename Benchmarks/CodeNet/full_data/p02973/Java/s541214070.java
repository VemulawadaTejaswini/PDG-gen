
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		boolean[] check = new boolean[n];
		for(int i = 0; i < n; i++) {
			check[i] = false;
		}
		int ans = 0;
		boolean flag = false;
		while(!flag) {
			flag = true;
			long max = -1;
			int i = 0;
			while(i < n) {
				if(max < list.get(i) && check[i] == false) {
					max = list.get(i);
					check[i] = true;
				} else {
					i++;
				}
			}
			ans++;
			for(int j = 0; j < n; j++) {
				flag = flag && check[j];
			}
		}
		System.out.println(ans);
	}

}
