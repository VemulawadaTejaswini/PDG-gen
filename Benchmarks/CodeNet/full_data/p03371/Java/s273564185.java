import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
        System.out.println(calcMin(A, B, C, X, Y));
    }

    public static int calcMin(int A, int B, int C, int X, int Y) {
		int total = 0;

    	int pattern1, pattern2, pattern3;

    	// パターン１：全部AとBピザでまかなう
		pattern1 = A * X + B * Y;

		total = pattern1;

		// パターン２：ABピザでAピザを全てまかなう
		pattern2 = 2 * C * X;
		if (X < Y) {
			pattern2 = pattern2 + (Y-X) * B;
		}

    	total = Integer.min(total, pattern2);

		// パターン３：ABピザでBピザを全てまかなう
		pattern3 = 2 * C * Y;
		if (X > Y) {
			pattern3 = pattern3 + (X-Y) * A;
		}

		total = Integer.min(total, pattern3);

		return total;
	}

}
