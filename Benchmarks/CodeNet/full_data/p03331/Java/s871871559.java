import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int min =Integer.MAX_VALUE;
		for (int a =1;a<=N/2+9;a+=9) {
			int b = N-a;
			char c[]= String.valueOf(a).toCharArray();
			char d[]= String.valueOf(b).toCharArray();
			int sum =0;
			for (int i=0;i<c.length;i++) {
				sum +=c[i]-'0';
			}
			for (int i=0;i<d.length;i++) {
				sum +=d[i]-'0';
			}
			if (min>sum) {
				min =sum;
			}
		}
		System.out.println(min);
	}
}