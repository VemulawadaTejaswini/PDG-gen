import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
		long ans = 0;
		ans += (x/11)*2;
		x%=11;
		if(x!=0) {
			ans += x>6?2:1;
		}
		System.out.println(ans);
	}

}
