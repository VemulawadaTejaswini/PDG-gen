
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		long x = sc.nextInt();
		
		ArrayList<Subject> subjects = new ArrayList<>();
		
		for (int i=0;i<n;i++) {
			Subject sbj = new Subject();
			sbj.b = sc.nextInt();
			sbj.l = sc.nextInt();
			sbj.u = sc.nextInt();
			subjects.add(sbj);
		}
		
		subjects.sort(Comparator.comparing((Subject s) -> s.u*(x-s.b)+s.l*(s.b)).reversed());
		
		long[] sum = new long[n+1];
		long[] sum2 = new long[n+1];
		
		for (int i=0;i<n;i++) {
			sum[i+1]=sum[i]+subjects.get(i).u*(x-subjects.get(i).b);
		}
		
		for (int i=n-1;i>=0;i--) {
			sum2[i]=sum2[i+1]-subjects.get(i).l*subjects.get(i).b;
		}
		
		for (int i=0;i<n;i++) {
			if (sum[i]+sum2[i]<0 && sum[i+1]+sum2[i+1]>=0) {
				Subject sbj = subjects.get(i);
				for (int j=0;j<x;j++) {
					long lower = sum[i]+sum2[i+1]+ (j>=sbj.b ? sbj.u : sbj.l)*(j-sbj.b);
					long upper = sum[i]+sum2[i+1]+ (j+1>=sbj.b ? sbj.u : sbj.l)*(j+1-sbj.b);
					
					if (lower < 0 && upper >= 0) {
						System.out.println(i*x+j+1);
					}
				}
			}
		}
	}




}

class Subject {
	long b;
	long l;
	long u;
	long c;
	
	
}