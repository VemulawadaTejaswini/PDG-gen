import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int [n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long [] sum = new long[n+1];
		for (int i=0;i<n;i++) {
			sum[i+1]=sum[i]+a[i];
		}
		ArrayList<Long> list = new ArrayList<>();
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<=n;j++) {
				list.add(sum[j]-sum[i]);
			}
		}
		
	//	System.out.println(list.size());
		
		int digit = 40;
		long ans = 0;
		while (digit >= 0) {
			int count = 0;
			long tmp = ans+(1L<<digit);
		//	System.out.println(ans+" "+digit+" "+tmp);
			for (long l : list) {
				if ((l & tmp) == tmp) {
					count++;
				}
			}
			if (count >= k) {
				ans = tmp;
			}
			digit--;
		}
		System.out.println(ans);
	}

}
