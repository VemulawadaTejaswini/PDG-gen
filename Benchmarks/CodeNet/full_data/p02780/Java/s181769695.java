import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Double> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt()*0.5+0.5);
		}

		double ans = 0;

		double sum = 0;
		for(int i=0;i<=n-k;i++) {
			if(i==0) {
				for(int j=0;j<k;j++) {
					sum += list.get(i+j);
				}
				ans = sum;

			}else {

				sum -= list.get(i-1);
				sum += list.get(i+k-1);
				if(sum > ans) {
					ans = sum;
				}

			}

		}

		System.out.println(ans);



	}
}
