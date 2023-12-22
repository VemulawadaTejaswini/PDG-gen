import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int sum = a[0];
		int cnt = 0;
		if(a[0] > 0) {
			for(int i = 1;i < n;i++) {
				sum += a[i];
				if(i%2!=0 && sum >=0) {
					cnt += Math.abs(-1-sum);
					sum = -1;
				}else if(i%2==0&&sum <=0) {
					cnt += Math.abs(1-sum);
					sum = 1;
				}
			}
		}else if(a[0] < 0) {
			for(int i = 1;i < n;i++) {
				sum += a[i];
				if(i%2==0 && sum >=0) {
					cnt += Math.abs(-1-sum);
					sum = -1;
				}else if(i%2!=0&&sum <=0) {
					cnt += Math.abs(1-sum);
					sum = 1;
				}
			}
		}
		System.out.println(cnt);
	}
}