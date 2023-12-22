import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String S = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < N; i ++) {
			String stri = S.substring(i, i + 1);
			for(int j = i + 1; j < N; j ++) {
				String strj = S.substring(j, j + 1);
				if(stri.equals(strj)) {
					continue;
				}
				for(int k = j + 1; k < N; k ++) {
					String strk = S.substring(k, k + 1);
					if(stri.equals(strk) || strj.equals(strk) || (j - i) == (k - j)) {
						continue;
					}else {
						sum ++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}