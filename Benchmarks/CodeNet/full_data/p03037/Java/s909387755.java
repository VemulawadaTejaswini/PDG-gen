import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int maxL = 0;
		int minR = 0;
		for(int i=0; i<M; i++) {
			if(i == 0) {
				maxL = sc.nextInt();
				minR = sc.nextInt();
			} else {
				int L = sc.nextInt();
				int R = sc.nextInt();

				maxL = maxL < L ? L : maxL;
				minR = minR > R ? R : minR;
			}
		}

		int count = maxL>minR ? 0 : minR-maxL+1;
		println(count);
	}

	public static void println(Object o) {
		System.out.println(o);
	}
}