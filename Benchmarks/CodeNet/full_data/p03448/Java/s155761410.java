import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		Integer x = sc.nextInt();
		Integer count = 0;
		
		for(int ia = 0; ia <= a; ia ++) {
			for(int ib = 0; ib <= b; ib ++) {
				for(int ic = 0; ic <= c; ic ++) {
					int total = ia * 500 + ib * 100 + ic * 50;
					if(total == x) {
						count ++;
					}
				}
			}
		}
		System.out.println(count);
	}
}