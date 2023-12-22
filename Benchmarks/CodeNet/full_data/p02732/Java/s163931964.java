import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> numList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}

		for(int i = 0; i < N; i++) {
			List<Integer> tempList = new ArrayList<>();
			tempList.addAll(numList);
			tempList.remove(i);
			int ans = 0;

			for(int j = 1; j <= N; j++) {
				int cnt = 0;
				for(int k = 0; k < N - 1; k++) {
					if(j == tempList.get(k)) {
						cnt++;
					}
				}
				ans += cnt * (cnt - 1) / 2;
			}
			System.out.println(ans);
		}
		
		sc.close();
		
	}
	
}