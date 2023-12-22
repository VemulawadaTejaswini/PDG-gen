import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int q = s.nextInt();
		int a[] = new int[n];
		while(q--!=0) {
			int m = s.nextInt()-1;
			if(m==0) {
				a[1]--;
			}
			else if(m==n-1) {
				a[0]--;
				a[m]++;
			}
			else {
				a[0]--;
				a[m]++;
				a[m+1]--;
			}
		}
		for(int i=1;i<n;i++) {
			a[i]+=a[i-1];
		}
		for(int i=0;i<n;i++) {
			if((a[i]+k)>0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}
