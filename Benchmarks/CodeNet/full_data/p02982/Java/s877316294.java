import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int D = scanner.nextInt();
		int[][] arr = new int[N+1][D+1];
		int ans = 0;
		for(int i = 1 ; i <= N ; i ++) {
			for(int j = 1 ; j <= D ; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		/*for(int i = 1 ; i <= N ; i ++) {
			for(int j = 1 ; j <= D ; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		for(int i = 1 ; i < N ; i ++) {
			for(int j = i+1 ; j <= N ; j ++) {
				if(judge(arr[i],arr[j])) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		scanner.close();
	}
	
	public static boolean judge(int[] i, int[] j) {
		double ans = 0;
		for(int x = 1 ; x < i.length ;  x ++) {
			ans += (Math.pow(i[x] - j[x], 2));
		}
//		System.out.print(ans);
		ans = Math.pow(ans, 0.5);
//		System.out.println("    " + ans);
		if(ans%1 == 0) {
			return true;
		}
		return false;
	}
}
