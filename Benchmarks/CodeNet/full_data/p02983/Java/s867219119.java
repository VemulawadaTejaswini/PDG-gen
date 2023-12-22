import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int p = 2019;
		
		int min1 = 2019;
		int min2 = 2019;
		int a ;
		
		for(int i = l ; i <= r ; i++) {
			if(min1 >= (a =i%p)) {
				min1 = Math.min(min1, a);
			}
			if(min1 < a) {
				if(min2 > a)
					min2 = Math.min(a, min2);
			}
		}
		System.out.println((min1 * min2)% p);
	}

}
