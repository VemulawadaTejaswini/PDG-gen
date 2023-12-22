import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+2];
		a[0] = 0;
		a[n+1] = 0;
		for(int i=1; i<n+1; i++){
			a[i] = sc.nextInt();
		}
		for(int i=1;i<=n; i++){
            int total = 0;
			for(int j=1; j<=i-1; j++){
				total += Math.abs(a[j]-a[j-1]);
			}
			total += Math.abs(a[i+1]-a[i-1]);
			for(int k=i+2; k<=n+1; k++){
				total += Math.abs(a[k]-a[k-1]);
			}
			System.out.println(total);
		}
	}
}