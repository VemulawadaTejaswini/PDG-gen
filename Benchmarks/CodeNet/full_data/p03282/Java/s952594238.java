import java.util.Scanner;
public class ToInfinity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inf = sc.nextLine();
		long k = sc.nextLong();
		int ans = 1;

		for(int i = 0; i < k; i++) {
			if(inf.charAt(i) != 1) {
				ans = Character.getNumericValue(inf.charAt(i));
				break;
			}
		}
		System.out.println(ans);
	}
}