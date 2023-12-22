import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int a;	int b;	int c;	int d;	int e;
		if (A % 10 == 0){
			a = 10;
		}
		else {
			a = A % 10;
		}
		if (B % 10 == 0){
			b = 10;
		}
		else {
			b = B % 10;
		}
		if (C % 10 == 0){
			c = 10;
		}
		else {
			c = C % 10;
		}
		if (D % 10 == 0){
			d = 10;
		}
		else {
			d = D % 10;
		}
		if (E % 10 == 0){
			e = 10;
		}
		else {
			e = E % 10;
		}
		int A2 = A + 10 - a;
		int B2 = B + 10 - b;
		int C2 = C + 10 - c;
		int D2 = D + 10 - d;
		int E2 = E + 10 - e;
		int SUM = A2 + B2 + C2 + D + E2;
		System.out.print(SUM);
	}
}