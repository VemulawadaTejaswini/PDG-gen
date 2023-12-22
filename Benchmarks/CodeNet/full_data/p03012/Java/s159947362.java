import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] s = new int[n];
		int[] ss = new int[n + 1];
		ss[0] = 0;
		long sum = 0;
		int i;
		for(i = 0; i < n; i++) {
			s[i] = scan.nextInt();
			ss[i + 1] = ss[i] + s[i];
			sum += s[i];
		}

		long min = Long.MAX_VALUE;
		long temp;
		for(i = 0; i < n; i++) {
			temp = sum - ss[i];
			min = Math.min(Math.abs(temp - ss[i]), min);
		}

		System.out.println(min);
	}
}
