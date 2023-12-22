import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long a[] = new long[n + 1];


		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();

		}
		Arrays.sort(a);
		long ans = 1;
		int cd = 0;
		for (long i = a[2]; i >=1; i=i-1) {
			for (int j = 1; j <= n; j++) {
				if (a[j] % i != 0) {
					cd++;
					//System.out.println("cd" + i + " " + cd);
				}
				if(cd>=2){
					break;
				}
			}
			//System.out.println("sd#"+cd);


				if (cd <=1) {
					ans = i ;
					break;
				}
			cd = 0;
		}
		System.out.println(ans);
	}
}