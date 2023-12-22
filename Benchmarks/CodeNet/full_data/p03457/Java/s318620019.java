import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] checkPoints = new int[n][3];
		int startPoint[] = {0, 0, 0};

		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			checkPoints[i][0] = t;
			checkPoints[i][1] = x;
			checkPoints[i][2] = y;
			if (isAbleToGo(startPoint, checkPoints[i])) {
				startPoint = checkPoints[i];
			} else {
				System.out.println("No");
				break;
			}
			if (i == n - 1) {
				System.out.println("Yes");
			}
		}
	}
	public static boolean isAbleToGo(int fromPoint[], int toPoint[]) {
		int timeRemained = toPoint[0] - fromPoint[0];
		int differOfX = Math.abs(toPoint[1] - fromPoint[1]);
		int differOfY = Math.abs(toPoint[2] - fromPoint[2]);
		int differ = differOfX + differOfY;
		int amariTime = timeRemained - differ;

		return amariTime >= 0 && amariTime % 2 == 0;//2の倍数ターン分余ったら行ったり来たりすればOK
	}

}
