import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map <Long,Integer>  map = new HashMap<Long,Integer>();
		for (int i=0;i<N;i++) {
			long temp = sc.nextLong();
			if (map.containsKey(temp)==false) {
				map.put(temp, 1);
			} else {
				int j= map.get(temp);
				j++;
				map.put(temp, j);
			}
		}
		int M = sc.nextInt();
		if (M>N) {
			System.out.println("NO");
			return ;
		}
		for (int i=0;i<M;i++) {
			long temp = sc.nextLong();
			if (map.containsKey(temp)==false) {
				System.out.println("NO");
				return ;
			} else {
				int j= map.get(temp);
				if (j==0) {
					System.out.println("NO");
					return ;
				}
				j--;
				map.put(temp, j);
			}
		}
		System.out.println("YES");
	}
}