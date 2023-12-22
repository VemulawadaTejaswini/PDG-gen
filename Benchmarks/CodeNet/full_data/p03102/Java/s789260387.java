import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		long ans = 0;
		int c = scn.nextInt();
		int count = 0;
		int[]b = new int[m];
		for(int i = 0;i<m;i++) {
			b[i]=scn.nextInt();
		}
		for(int i = 0;i<n;i++) {
			ans= c;
			for(int j = 0;j<m;j++) {
				ans+=b[j]*scn.nextInt();
			}
			if(0<ans)count++;
		}
		System.out.println(count);
		scn.close();
	}
}