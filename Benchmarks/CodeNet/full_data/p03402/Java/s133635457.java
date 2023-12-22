import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19};
		if(a==b || a-1==b || a+1==b) {
			boolean fromWhite = (a-1==b);
			int h=0;
			int w=0;
			for (int p: primes) {
				if ((a+b)%p==0 && (a+b)/p<=100) {
					h = p;
					w = (a+b)/p;
					break;
				}
			}
			System.out.println(h + " " + w);
			for(int i=0; i<h; i++) {
				for (int k=0; k<w; k++) {
					if ((i+k)%2==0^fromWhite) {
						System.out.print('#');
					}else {
						System.out.print('.');
					}
				}
				System.out.println();
			}
		}else {

		}

	}

}