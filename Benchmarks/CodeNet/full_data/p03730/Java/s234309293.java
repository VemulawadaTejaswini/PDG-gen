

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int gcd = gcd(a, b);

//		if(a % b == 0 && c != 0){
		if(c % gcd != 0){
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}

//		for(int i = 1; i <= 20; i++){
//			System.out.println(a*i%b);
//		}
	}

	static int gcd(int a, int b){
        int tmp;

        while (a % b != 0)
        {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return b;
    }
}