import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] x = new int[N+1];
		int left=0;
		int right=0;
		for (int i=1;i<=N;i++) {
			x[i] = sc.nextInt();
			if (x[i]<=0) {
				x[i] *= -1; // 絶対値にする
				left++;
			} else {
				right++;
			}
		}

		int minDist = Integer.MAX_VALUE;
		int dist;

		for (int i=0;i<=left;i++) {
			for (int j=0;j<=right;j++) {
				if (i+j==K) {
					//左にi本、右にj本の時の最小距離を求める
					if (i==K) { // 左だけ
						dist = x[left-i+1];
						if (dist < minDist) {
							minDist = dist;
						}
					}
					else if (j==K) { // 右だけ
						dist = x[left+j];
						if (dist < minDist) {
							minDist = dist;
						}
					}
					else {
						//左行ってから右
						dist = x[left-i+1]*2 + x[left+j];
						if (dist < minDist) {
							minDist = dist;
						}
						//右行ってから左
						dist = x[left-i+1] + x[left+j]*2;
						if (dist < minDist) {
							minDist = dist;
						}
					}
				}
			}
		}

		System.out.println(minDist);

	}
}

