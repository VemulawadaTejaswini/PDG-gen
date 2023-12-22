import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		int[] x = new int[10];
		
		x[0] = b - a;
		x[1] = c - a;
		x[2] = d - a;
		x[3] = e - a;
		x[4] = c - b;
		x[5] = d - b;
		x[6] = e - b;
		x[7] = d - c;
		x[8] = e - c;
		x[9] = e - d;
		
		int num = 0;
		
		for(int i = 0; i < 10; i++) {
			if(x[i] > k) {
				num++;
			}
		}
		
		if(num == 0) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
		
	}
}
