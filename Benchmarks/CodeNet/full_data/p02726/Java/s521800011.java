import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int loopNodes = y - x + 1;
			int reachableNodes = loopNodes / 2;

			int gX = x;
			int gY = n - y + 1;

			for(int k = 1 ; k < n ; k++ ) {
				//trival case
				int countX = pathCount(gX, k);
				int countY = pathCount(gY, k);
				int countLoop = loopNodes / 2 >= k ? loopNodes : 0;

				//cross case
				//graph A
				int maxStep = k - 1;

				int effectiveA = 0;
				int effectiveB = 0;
				// first loop is 1
				if ( maxStep > 0 && gX > 1) {
					int maxLeft = min(gX-1, maxStep);
					int maxRight = min(reachableNodes, maxStep);
					int minLeft = k - maxRight;
					
//					System.out.println("## maxLeft: " + maxLeft);
//					System.out.println("## maxRight: " + maxRight);
//					System.out.println("## minLeft: " + minLeft);
					effectiveA = maxLeft - minLeft  + 1;
					effectiveA = effectiveA > 0 ? effectiveA : 0;

				}
				if ( maxStep > 0 && gY > 1 ) {
					//graph B
					int maxLeft = min(gY-1, maxStep);
					int maxRight = min(reachableNodes, maxStep);
					int minLeft = k - maxRight;
					
					effectiveB = maxLeft - minLeft  + 1;
					effectiveB = effectiveB > 0 ? effectiveB : 0;
				}

				int effectiveS = 0;
				if ( maxStep > 1 ) {
					//short-cut course
					int maxLeft = min(gX-1, maxStep -1);
					int maxRight = min(gY-1, maxStep -1);
					int minLeft = k - 1 - maxRight;
					effectiveS = maxLeft - minLeft + 1;
					effectiveS = effectiveS > 0 ? effectiveS : 0;
//					System.out.println("## effectiveS1: " + effectiveS1);
//					System.out.println("## effectiveS2: " + effectiveS2);
					
				}


//				System.out.println("countX: " + countX);
//				System.out.println("countY: " + countY);
//				System.out.println("loop: " + countLoop);
//
//				System.out.println("effectiveA: " + effectiveA);
//				System.out.println("effectiveB: " + effectiveB);
//				System.out.println("effectiveS: " + effectiveS);

				System.out.println(countX + countY + countLoop + effectiveA * 2 + effectiveB * 2 + effectiveS);

			}
		}
	}

	private static int pathCount(int len, int step) {
		int count = len - step;
		if ( count < 0 ) {
			return 0;
		}
		return count;
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	private static int min(int a, int b) {
		return a > b ? b : a;
	}
}