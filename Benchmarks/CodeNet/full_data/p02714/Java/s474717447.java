import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < N; i ++) {
			for(int j = i + 1; j < N; j ++) {
				if(S.substring(i, i + 1).equals(S.substring(j, j + 1))) {
					continue;
				}
				for(int k = j + 1; k < N; k ++) {
					if(S.substring(i, i + 1).equals(S.substring(k, k + 1)) || S.substring(j, j + 1).equals(S.substring(k, k + 1))) {
						continue;
					}
					if((j - i) != (k - j)) {
						sum ++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
