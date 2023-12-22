import java.util.Scanner;

public class A {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		boolean[] n = new boolean[4];
		for (int i = 0; i < 4; i++) {
			int a = scn.nextInt();
			switch (a) {
			case 1:
				n[0] = true;
				break;
			case 9:
				n[1] = true;
				break;
			case 7:
				n[2] = true;
				break;
			case 4:
				n[3] = true;
				break;
			default:
				break;
			}
		}
		boolean ans = true;
		for(int i = 0;i < 4;i++) {
			ans &= n[i];
		}
		System.out.println(ans?"YES":"NO");
	}
}
