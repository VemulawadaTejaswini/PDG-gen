import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		long p[] = new long[4];
		long sum = 0L;
		for (int i=0; i<n; i++){
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		double std = sum/4.0;
		long tmpsum = a[0];
		int pind = 0;
		for (int i=1; i<n; i++){
			double d1 = Math.abs(tmpsum-std);
			double d2 = Math.abs(tmpsum+a[i]-std);
			if (d1>=d2){
				tmpsum += a[i];
			}else {
				p[pind] = tmpsum;
				pind++;
				tmpsum = a[i];
				if (pind==3){
					for (int k=i; k<n; k++){
						p[3] += a[k];
					}
					break;
				}
			}
		}

		long max=p[0];
		long min=p[0];
		for (int i=1; i<4; i++){
			max = Math.max(max, p[i]);
			min = Math.min(min, p[i]);
		}
		System.out.println(max-min);
	}
}