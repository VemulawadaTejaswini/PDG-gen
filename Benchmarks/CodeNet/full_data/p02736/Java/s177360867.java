

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=s.charAt(i)-'0';
		}
/*		
		//bruteforce
		for (int i=1;i<n;i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int j=0;j<n-i;j++) {
				a[j]=Math.abs(a[j]-a[j+1]);
				list.add(a[j]);
			}
			System.out.println(list);
		}
*/		
		
		for (int j=0;j<n-1;j++) {
			a[j]=Math.abs(a[j]-a[j+1]);
		}
		
		
		boolean all02 = true;
		for (int j=0;j<n-1;j++) {
			if (a[j]==1) {
				all02=false;
			}
		}
		int[] b=new int[n-1]; //n-2Ci
		b[0]=0;
		for (int i=1;i<n-1;i++) {
			b[i]=b[i-1];
			int j=i;
			int k=n-1-i;
			while(k%2==0) {
				k>>=1;
				b[i]++;
			}
			while(j%2==0) {
				j>>=1;
				b[i]--;
			}
		}

			int ans = 0;
			for (int j=0;j<n-1;j++) {
				if (b[j]==0) {
					ans^=a[j];
				}
			}

			System.out.println(all02 ? ans : ans%2);

	}


}
