import java.util.Scanner;

//C	Different Strokes
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());

		long[][] in = new long[N][2];
		for (int i = 0; i < N; i++) {
			String inString = sc.nextLine();
			String[] sp = inString.split(" ");
			in[i][0] = Long.valueOf(sp[0]).longValue();
			in[i][1] = Long.valueOf(sp[1]).longValue();
		}

		long aPoint = 0l;
		long bPoint = 0l;

		for (int i = 0; i < in.length; i++) {
			int turn = i % 2; //0:takahashi 1:aoki

			int selected = select(in);
			if (turn == 0) {
				aPoint += in[selected][0];
			} else {
				bPoint += in[selected][1];
			}
			in[selected][0] = 0;
			in[selected][1] = 0;
		}

		System.out.println(aPoint - bPoint);

		sc.close();
	}

	private static int select(long[][] in) {
		long aMax = 0l;
		long bMax = 0l;
		int aMaxIndex = 0;
		int bMaxIndex = 0;
		for (int i = 0; i < in.length; i++) {
			if (aMax < in[i][0]) {
				aMax = in[i][0];
				aMaxIndex = i;
			}
			if (bMax < in[i][1]) {
				bMax = in[i][1];
				bMaxIndex = i;
			}
		}
		if (aMax > bMax) {
			return aMaxIndex;
		} else {
			return bMaxIndex;
		}
	}

}
