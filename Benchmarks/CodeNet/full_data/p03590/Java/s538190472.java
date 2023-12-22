import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(i=0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();
		sc = null;
		int sum=0;
		int max=0;
		int ak=0;
		int j=0;
		for(i=k;i>0;i--) {
			ak=~i;
			sum=0;
			for(j=0;j<n;j++) {
				if((a[j] & ak) == 0) {
					sum+=b[j];
				}
			}
			if(sum>max)max=sum;
		}
		
		System.out.println(max);
	}
}
