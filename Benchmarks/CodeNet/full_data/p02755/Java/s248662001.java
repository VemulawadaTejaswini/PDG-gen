import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double res = 0;
		while (res<=20000) {
			if(res * 0.08 >= A && res * 0.08 < A + 1 && res * 0.1 >= B && res * 0.1 < B + 1) {
				break;
			}
			res++;
		}
		if((int)res!=20001) {
			System.out.println((int)res);
		}else {
			System.out.println(-1);
		}
	}
}