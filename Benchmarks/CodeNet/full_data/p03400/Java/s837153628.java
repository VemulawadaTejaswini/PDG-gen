import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			x += d/a;
			if(d%a!=0) x++;
		}
		sc.close();
		System.out.println(x);
	}
}