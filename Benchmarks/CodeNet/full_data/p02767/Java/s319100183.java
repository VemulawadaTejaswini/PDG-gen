import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] add = new int[n];
		int max = 0;
		int min = 100;

		for(int i = 0;i < n;i++) {
			add[i] = stdIn.nextInt();
			if(add[i]>max) {
				max = add[i];
			}
			if(add[i]<min) {
				min = add[i];
			}
		}

		int p = (max-min)/2;
		int ans = 0;

		for(int i = 0;i < n;i++) {
			ans = ans + ((add[i]-p)*(add[i]-p));
		}

	}

}
