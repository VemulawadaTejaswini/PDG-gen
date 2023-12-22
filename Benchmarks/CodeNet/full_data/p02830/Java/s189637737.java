import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		String A = scan.nextLine();

		String S = A.substring(0, N);
		String T = A.substring(N + 1);

		String str = "";

		for(int i = 0; i < N; i++){
			str += S.substring(i, i + 1);
			str += T.substring(i, i + 1);
		}
		System.out.println(str);

	}
}