import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next());
		int L = s / 100;
		int R = s % 100;
		if (1 <= L && L <= 12) {
			if (1 <= R && R <= 12)
				System.out.println("AMBIGUOUS");
			else
				System.out.println("MMYY");
		} else {
			if (1 <= R && R <= 12)
				System.out.println("YYMM");
			else
				System.out.println("NA");
		}
		sc.close();
	}
}