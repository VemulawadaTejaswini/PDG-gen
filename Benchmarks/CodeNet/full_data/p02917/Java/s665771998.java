import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n-1];
		for(int i=0;i<n-1;i++) {
			a[i] = s.nextInt();
		}
		int ans[] = new int[n];
		
		for(int i=0;i<n;i++) {
			ans[i] = Integer.MAX_VALUE;
		}
		int k=a.length-1;
		for(int i=n-1;i>=1;i--) {
			ans[i] = Math.min(ans[i], a[k]);
			ans[i-1] = a[k];
			k--;
		}
		int sum=0;
		for(int i:ans) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
