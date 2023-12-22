import java.util.Scanner;

public class TravelingBudget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int train = 0;
		int bus = 0;
		if (a<b) {
			train = a;
		}
		else {
			train = b;
		}
		if (c<d) {
			bus = c;
		}
		else {
			bus = d;
		}
		
		System.out.println(train+bus);
		
		sc.close();
	}

}