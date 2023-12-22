import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[]s = new String [N];

		for (int i=0; i<N; i++){
			String input = sc.next();
			char[] ary = input.toCharArray();
			Arrays.sort(ary);
			s[i] = String.valueOf(ary);
		}
		long cnt = 0;
		for (int i=0; i<N; i++){
			for (int j=i+1; j<N; j++){
				if (s[i].equals(s[j])){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}