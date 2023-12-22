import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int e= sc.nextInt();
		int k = sc.nextInt();

		int x[] = new int[10];

		x[0] = Math.abs(a-b);
		x[1] = Math.abs(a-c);
		x[2] = Math.abs(a-d);
		x[3] = Math.abs(a-e);
		x[4] = Math.abs(b-c);
		x[5] = Math.abs(b-d);
		x[6] = Math.abs(b-e);
		x[7] = Math.abs(c-d);
		x[8] = Math.abs(c-e);
		x[9] = Math.abs(d-e);

		for (int i = 0; i < x.length; i++) {
			if (x[i] > k) {
				System.out.println(":(");
				return;
			}
		}
		System.out.println("Yay!");
	}
}
