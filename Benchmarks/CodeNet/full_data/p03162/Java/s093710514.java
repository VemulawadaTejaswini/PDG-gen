import java.util.*;
import java.io.*;

public class Vacation {


	public static void main(String[] args) {
		Vacation sol = new Vacation();
		long answer = sol.solve();
		System.out.println(answer);
	}

	private long solve() {

		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		long [] answer = new long[3];		 
		for(int i=0;i<N;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			long temp_a, temp_b, temp_c;
			if (i==0) {
				temp_a = a;
				temp_b = b;
				temp_c = c;
			} else {
				 temp_a = a + Math.max(answer[1], answer[2]);
				 temp_b = b + Math.max(answer[0], answer[2]);
				 temp_c = c + Math.max(answer[0], answer[1]);				 
			}
			answer[0] = temp_a;
			answer[1] = temp_b;
			answer[2] = temp_c;
			//System.out.println(Arrays.toString(answer));
		}

		return Math.max(answer[0], Math.max(answer[1], answer[2]));
 
	}

}