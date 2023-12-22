import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++)
			l[i] = in.nextInt();
		
		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, l[i]);
			sum += l[i];
		}
		
		sum -= max;
		
		if (max < sum)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}