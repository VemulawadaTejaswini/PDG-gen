import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		long asum = 0;
		long bsum = 0;
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
			asum += a[i];
		}
		for(int i = 0;i < N;i++) {
			b[i] = sc.nextInt();
			bsum += b[i];
		}
		sc.close();

		long total = bsum - asum;
		long aplsCnt = 0;
		long bplsCnt = 0;
		for(int i = 0;i < N;i++) {
			if(a[i] > b[i]) {
				bplsCnt += (a[i]-b[i]);
			}else if(b[i] < a[i]){
				aplsCnt += (b[i]-a[i])/2;
			}
		}
		if(total >= aplsCnt && total >= bplsCnt) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}