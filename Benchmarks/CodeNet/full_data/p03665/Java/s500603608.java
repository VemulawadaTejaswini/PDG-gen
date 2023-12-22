import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] biscuitsInfo = new int[n];
		int odd =0;
		int even =0;
		for(int i =0;i < n;i++) {
			int biscuit = sc.nextInt();
			biscuitsInfo[i] = biscuit;
			if(biscuit % 2 ==0) {
				even++;
			}else {
				odd++;
			}
		}
		if(odd ==0) {
			if(p ==0) {
				System.out.println((long)Math.pow(2,even));
			}else {
				System.out.println(0);
			}
			return;
		}
		if(even ==0) {
			System.out.println((long)(Math.pow(2,odd) / 2));
			return;
		}
		System.out.println((long)(Math.pow(2,odd) / 2) * (long)Math.pow(2,even));
	}
}