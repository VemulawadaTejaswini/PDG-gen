import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmpN = sc.nextLine();
		String tmpS = sc.nextLine();
		int N = Integer.valueOf(tmpN);
		int tmpMax = 0;
		int tmpCount = 0;
		String[] S = tmpS.split(" ");
		for (int i = 0 ; i < N ; i ++) {
			for (int j = i ; j < N - 1 ; j ++) {
				if( Integer.valueOf(S[j]) >=  Integer.valueOf(S[j+1])) {
					tmpCount += 1;
				}else {
					break;
				}
			}
			if(tmpMax < tmpCount) {
				tmpMax = tmpCount;
				tmpCount = 0;
			}
		}
		System.out.println(tmpMax);
	}
}