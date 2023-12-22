import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x, a, b, c;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while(x > 2) {
			x -= 1;
			a = b = x;
			while(true) {
				b--;
				while(a > 0) {
					a -= b;
					if(a == 0) {
						System.out.print(b);
					}
				}
			}
		}
		System.out.print(1);
	}
}