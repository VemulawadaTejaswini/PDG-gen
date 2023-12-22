import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b-c;

		if(d<0) {d*=-1;}
		int ans = d%2;
		if(ans==0) {
			System.out.print(d/2);
		} else if((b==1 || b==a) || (c==1 || c==a)) {
			System.out.print(d);
		} else {
			System.out.println(Math.min(Math.max(b,c)-1,a-Math.min(b,c)));
		}

	}
}
