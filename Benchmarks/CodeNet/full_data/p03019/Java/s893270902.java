
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

				long memory = x;
				
				for (int j=i;j<n;j++) {
					Subject sbj = subjects.get(j);
					if (sum[i]+sum2[i]+sbj.b*sbj.l+(x-sbj.b)*sbj.u<0) {
						continue;
					} else if (sum[i]+sum2[i]+sbj.b*sbj.l < 0){
						long tmp = (-(sum[i]+sum2[i]+sbj.b*sbj.l)+sbj.u-1)/sbj.u;
						memory = Math.min(memory, tmp+sbj.b);
					} else {
						long tmp = (-(sum[i]+sum2[i])+sbj.l-1)/sbj.l;
						memory = Math.min(memory, tmp);
					}
				}
				
				System.out.println(i*x+memory);
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