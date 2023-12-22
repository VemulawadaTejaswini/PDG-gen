import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		ArrayList<Integer> bPoints = new ArrayList<>();
		bPoints.add(0);
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
			if(a[i]==0) {
				bPoints.add(i);
			}
		}
		bPoints.add(n);
		long ans =0;
		for(int i=0;i<bPoints.size()-1;i++) {
			long tempSum =0;
			for(int j=bPoints.get(i);j<bPoints.get(i+1);j++) {
				tempSum+=a[j];
			}
			tempSum/=2;
			ans+=tempSum;
		}
		System.out.println(ans);
		
		
		
	}
}
