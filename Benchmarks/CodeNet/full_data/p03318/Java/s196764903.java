import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int K = scn.nextInt();
		long ans = 0,buf = 0;;
		for(int i = 1;i <= K;i++) {
			if(i < 9)System.out.println(i);
			else {
				ans = (long)((1 + i%9) * Math.pow(10, i/9) -1);
				System.out.println(ans);
			}
		}
	}
}
