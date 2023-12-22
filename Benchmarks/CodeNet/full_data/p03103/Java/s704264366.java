import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		drink[] d = new drink[n];
		for (int i = 0; i < n; i++) {
			d[i] = new drink(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(d, new Comparator<drink>() {
			public int compare(drink d1, drink d2) {
				if(d1.price == d2.price) {
					return (d2.num-d1.num>0)?1:-1;
				}else {
					return (d1.price-d2.price>0)?1:-1;
				}
			}
		});
		long sum = 0;
		for(drink d1:d) {
			if(m>d1.num) {
				sum += d1.num*d1.price;
				m -= d1.num;
			}else {
				sum += d1.price*m;
				break;
			}
		}
		System.out.println(sum);
		sc.close();
	}
	public static class drink {
		long price; long num;
		drink(long a, long b){
			this.price = a;
			this.num = b;
		}
	}
}