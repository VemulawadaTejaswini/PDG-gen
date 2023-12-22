import java.util.Scanner;

public class Main {
	static int p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while(!IsPrime(x)) {
			x++;
		}

		System.out.println(x);

        return;
    }

	static boolean IsPrime(int n) {
		if (n == 2) return true;
		else if (n%2 == 0) return false;
		double sqrtNum = Math.sqrt(n);
		for (int i=3; i<=sqrtNum; i+=2) {
			if (n%i == 0) {return false;}
		}
		return true;
	}

}

