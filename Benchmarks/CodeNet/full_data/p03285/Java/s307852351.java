import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean can = false;
		for(int i = 0;i <= N;i++) {
			if(i%4 == 0&&(N-i)%7==0) {
				can = true;
				break;
			}
		}
		System.out.println(can?"Yes":"No");
	}
}
