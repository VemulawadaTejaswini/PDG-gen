import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[]A = new int[N+1];

		for (int i=1; i<=N; i++){
			A[i] = sc.nextInt();
		}

		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i=N; i>0; i--){
			int tmp=0;
			for (int j=i*2; j<=N; j=j+i){
				if (ans.contains(j)){
					tmp++;
				}
			}
			if ((tmp % 2) != A[i]){
				ans.add(i);
			}
		}
		Collections.sort(ans);
		System.out.println(ans.size());
		for (int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}


}