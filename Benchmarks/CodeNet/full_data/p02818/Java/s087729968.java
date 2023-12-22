import java.util.Scanner;

public class Main {
	static int p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();

		if(a < k) {
			k -= a;
			a = 0;

			if(b < k) {
				b = 0;
			}else {
				b -= k;
			}

		}else {
			a -= k;
		}



		System.out.println("" + a + " " + b);

        return;
    }
}

