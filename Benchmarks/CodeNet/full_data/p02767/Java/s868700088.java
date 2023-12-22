import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(x);
		int herf = x[n-1]/2;
		Integer min = null;
		for(int p=herf;p>=1;p--){
			int wa = 0;
			for(int i=0;i<n;i++){
				int px = x[i]-p;
				wa = wa + (px*px);
			}
			if(min==null) min=wa;
			else if(min>wa) min=wa;
		}
		System.out.println(min);
	}
}
