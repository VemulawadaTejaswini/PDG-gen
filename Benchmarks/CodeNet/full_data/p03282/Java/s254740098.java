import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long n = sc.nextLong();
for(int t=0;t<n;t++) {

		if(str.charAt(t) != '1') {
			System.out.println(str.charAt(t));
			return;
		}
}
	}

}