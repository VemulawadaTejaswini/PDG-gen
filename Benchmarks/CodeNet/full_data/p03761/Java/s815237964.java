import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String A = "";
		String B = "";

		for(int i = 0 ; i < N ; i++){
			String S = sc.next();
			if(i==0) {
				A = S;
				continue;
			}
			else{
				for(int j = 0 ; j < A.length() ; j++){
					if(S.contains(A.substring(j, j+1))){
						B += A.substring(j, j+1);
					}
				}
				A = B;
				B = "";
			}

		}
		sc.close();
			String[] ans = new String[A.length()];
			for(int i = 0 ; i < A.length(); i++){
				ans[i] = A.substring(i, i+1);
			}
			Arrays.sort(ans);

			for(int i = 0 ; i < A.length(); i++){
				System.out.print(ans[i]);
			}
			System.out.println();
	}
}
