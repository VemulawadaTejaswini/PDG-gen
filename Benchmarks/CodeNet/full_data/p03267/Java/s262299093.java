import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();

		int lt = L;
		int N = getN(L)+1;
		System.out.print(N + " ");
		
		List<String> map = new ArrayList<>();


		for (int i = 1; i < N; i++) {
			map.add(i + " " + (i + 1)+" "+ 0);
			map.add(i + " " + (i + 1)+" "+ (1 << (i-1)));
		}
		if (lt!=(1<<(N-1)))
		for (int i=getN(L);i>=1;i--) {
			if (lt - (1<<(i-1)) >=(1<<(getN(L)))) {
				map.add(i + " " + N +" "+ (lt - (1<<(i-1))));
				lt -= (1<<(i-1));
			}
			
		}
		System.out.println(map.size());
		for (String key : map) {
			System.out.print(key);
			System.out.println();
		}
	}

	private static int getN(int l) {
		int i = 0;
		while ((1 << i) <= l)
			i++;
		return i-1;
	}
}
