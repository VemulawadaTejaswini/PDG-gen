import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int people = sc.nextInt();
		int anser = 0;
		int[] hp = new int[people];
		for(int num = 0 ; num <people; num++) {
			hp[num] = sc.nextInt();
		}

		for(int i = 0 ; i < hp.length; i++) {
			//(x-p)2乗　公式
			anser +=(hp[i] - people) * (hp[i] - people);
		}
		System.out.println(anser);

	}
}
