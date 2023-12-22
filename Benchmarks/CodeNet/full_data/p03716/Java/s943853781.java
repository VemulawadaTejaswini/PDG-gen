import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer a[] = new Integer[3*N];
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
		}
		int downcut =0;
		int downposition =-1;
		int upcut =0;
		int upposition = -1;
		int downmin =Integer.MAX_VALUE;
		int upmax = 0;
		for (int i=0;i<N;i++) {
			if (i==0) {
				for (int j=0;j<N;j++) {
					if(a[j]<downmin) {
						downmin =a[j];
						downposition = j;
					}
				}
				for (int j=N*2-1;j<a.length;j++) {
					if(a[j]>upmax) {
						upmax=a[j];
						upposition = j;
					}
				}
				if (a[N]-downmin >upmax-a[N*2-2]) {
					a[downposition] =0;
					downmin =Integer.MAX_VALUE;
					downcut++;
				} else {
					a[upposition]= 0;
					upmax = 0;
					upcut++;
				}
			} else {
				if(downmin==Integer.MAX_VALUE) {
					for (int j=0;j<N+downcut;j++) {
						if(a[j]!=0&&a[j]<downmin) {
							downmin =a[j];
							downposition = j;
						}
					}
				} else {
					for (int j=N*2-1-upcut;j<a.length;j++) {
						if(a[j]!=0&&a[j]>upmax) {
							upmax=a[j];
							upposition = j;
						}
					}
				}
				if (a[N+downcut]-downmin > upmax-a[N*2-1-upcut]) {
					a[downposition] = 0;
					downmin =Integer.MAX_VALUE;
					downcut++;
				} else {
					a[upposition]= 0;
					upmax = 0;
					upcut++;
				}
			}
		}
		int count =0;
		int i=0;
		long sum = 0;
		while (count<N) {
			if (a[i]!=0) {
				sum +=a[i];
				count++;
			}
			i++;
		}
		for (;i<3*N;i++) {
			if(a[i]!=0) {
				sum -=a[i];
			}
		}
		System.out.println(sum);
	}
}