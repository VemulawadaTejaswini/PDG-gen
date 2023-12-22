import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c,x,y = 0;

		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());
		x = Integer.parseInt(scan.next());
		y = Integer.parseInt(scan.next());

/*		for(int i=x;i>=0;i--) {
			int sumx = (a * i) + (x - i)*2*c;
			System.out.println(sumx);
		}
		System.out.println("--------");

		for(int j=y;j>=0;j--) {
			int sumy = (b * j) + (y - j)*2*c;
			System.out.println(sumy);
		}*/

		int num_max = 0;
		if(x > y) {
			num_max = x;
		}else {
			num_max = y;
		}

		int sum = 0;
		for(int i=0;i<=num_max;i++) {

			int sum1 = (x - i)*a;
			int sum2 = (y -i)*b;
			int sum3 = 2*i*c;

			if(sum1 < 0) {
				sum1 = 0;
			}
			if(sum2 < 0) {
				sum2 =0;
			}

			int suma = sum1 + sum2 + sum3;
			if (sum == 0) {
				sum = suma;
			}else if(suma < sum) {
				sum = suma;
			}

		}
		System.out.println(sum);
	}
}