import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mod4 = 0;
		int mod2 = 0;
		int N = scan.nextInt();
		int needMod4 = N / 2;
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			if(a[i] % 4 == 0) {
				mod4++;
			}
			if(a[i] % 2 == 0 && a[i] % 4 != 0) {
				mod2++;
			}
		}
		
		if(mod4 == 0 && N == mod2) {
			System.out.println("Yes");
		} else if(needMod4 <= mod4 + (mod2 / 2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();

	}

}
