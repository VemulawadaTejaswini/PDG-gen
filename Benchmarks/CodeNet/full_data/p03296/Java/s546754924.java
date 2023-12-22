import java.util.*;

class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		int magic=0;
		int before = 0;
		for (int i = 0; i < N; i++) {
			int color=in.nextInt();
			if(before == color) {
				magic++;
				before=0;
			} else {
				before=color;
			}
		}
		in.close();

		System.out.println(before);
	}
}