
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] list = new long[N + 1][4];
		for(int i = 1; i < N + 1; i++) {
			list[i][1] = sc.nextLong();
			list[i][2] = sc.nextLong();
			list[i][3] = sc.nextLong();
		}
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				long H = list[1][3] + Math.abs(list[1][1] - i) + Math.abs(list[1][2] - j);
				boolean flag = true;
				for(int k = 1; k < N + 1; k++) {
					if(H != list[k][3] + Math.abs(list[k][1] - i) + Math.abs(list[k][2] - j)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(i);
					System.out.println(j);
					System.out.println(H);
					break;
				}
			}
		}
	}

}
