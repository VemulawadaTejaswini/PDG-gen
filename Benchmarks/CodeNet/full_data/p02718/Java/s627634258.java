import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = sc.nextInt();
		double a[] = new double[N];
		int vote = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			vote += a[i];
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= (vote / (4 * M))) {
				count++;
			}
		}
		//System.out.println(vote);
		//System.out.println(vote / (4 * M));
		//System.out.println(count);
		if (M <= count) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
