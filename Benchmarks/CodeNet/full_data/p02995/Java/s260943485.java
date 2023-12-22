import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong();
		long B = scn.nextLong();
		long C = scn.nextLong();
		long D = scn.nextLong();
		long ans = B-A+1;
		ans -= (B-A-(C-((A%C)==0?C:A%C)))/C + 1;
		ans -= (B-A-(D-((A%D)==0?D:A%D)))/D + 1;
		ans += (B-A-(C*D-((A%(C*D))==0?C*D:A%(C*D))))/(C*D) + 1;
		System.out.println(ans);
	}

}