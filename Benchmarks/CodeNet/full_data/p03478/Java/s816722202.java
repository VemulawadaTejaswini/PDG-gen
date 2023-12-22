import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int s =0;
		for (int i=1;i<=N;i++) {
			String temp = String.valueOf(i);
			int sum =0;
			for (int j=0;j<temp.length();j++) {
				sum +=temp.charAt(j)-'0';
			}
			if (sum<=B&&sum>=A) {
				s+=i;
			}
		}
		System.out.println(s);
	}
}