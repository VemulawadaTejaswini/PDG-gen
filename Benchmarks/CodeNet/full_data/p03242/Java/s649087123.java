public class Main {
	public static void main(String args[]){
		Scanner push = new Scanner(System.in);
		int n = push.nextInt();

		double A,B,C;
		int Aa,Ba;

		A = n / 100;
		Aa = (int) Math.floor(A);
		n =- Aa;

		B = n / 10;
		Ba = (int) Math.floor(B);
		n =- Ba;

		C = n * 100;
		System.out.println(Aa + Ba + C);
		}
	}
