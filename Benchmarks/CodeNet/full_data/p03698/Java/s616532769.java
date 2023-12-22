import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] array = new int[10000000];

		for(int i=0;i<S.length();i++) {
			array[S.charAt(i)]++;
		}
		for(int i:array) {
			if(i > 1) {
				System.out.println("no");
				System.exit(0);
			}
			//System.out.println(i);
		}
		System.out.println("yes");
	}
	public static int sample() {
		return 1;
	}

}
