import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder w = new StringBuilder(sc.nextLine());
		sc.close();
		int index = 0;

		while (true) {
			if (w.charAt(0) == -1) {
				break;
			}
			
			index = w.indexOf(w.substring(0, 1),1);
			if (index == -1) {
				System.out.println("NO");
				break;
			}
			
			w.delete(index, index+1);
			w.delete(0, 1);

			if (w.length() == 0) {
				System.out.println("YES");
				break;
			}
		}
	}
}