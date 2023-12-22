import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

		int amax = 1;
		int amin = 1;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		String str[] = new String[n];
		str = sc.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			int aint = Integer.parseInt(str[i]);
			if (aint > amax) {
				amax = aint;
			}
			if (aint < amin) {
				amin = aint;
			}
		}
		System.out.println(amax - amin);
	}

}