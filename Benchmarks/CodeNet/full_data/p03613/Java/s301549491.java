import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(a[j]==a[i] || a[j]==a[i]+1 || a[j]==a[i]-1) b[j]++;
			}
		}
		int max = 0;
		for(int i=0; i<n; i++) max = max>b[i]?max:b[i];
		System.out.println(max);
	}

}
