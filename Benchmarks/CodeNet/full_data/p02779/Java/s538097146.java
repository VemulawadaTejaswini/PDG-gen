import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		boolean[] e = new boolean[1000000000];
		boolean yes = true;
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			if(!e[a]) {
				e[a] = true;
			}else {
				yes = false;
				break;
			}
		}
		System.out.println(yes?"YES":"NO");
	}

}