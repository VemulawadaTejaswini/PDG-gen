import java.util.Scanner;

public class ABC064A {
	public static void main(String[] args) {
		ABC064A main = new ABC064A();
		main.run();
	}

	int r;
	int g;
	int b;
	public void run() {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		g = sc.nextInt();
		b = sc.nextInt();
		int ans = r*100 + g*10 + b;
		if(ans % 4 == 0)System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
}
