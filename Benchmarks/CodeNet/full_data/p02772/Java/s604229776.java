import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean canin = true;
		int inputn = sc.nextInt();
		ArrayList<Integer> numlist = new ArrayList<Integer>();

		for(int i = 0; i < inputn; i++) {
			int num = sc.nextInt();
			numlist.add(num);
		}

		for(int i = 0; i < inputn; i++) {
			if((numlist.get(i) % 2) == 0) {
				if((numlist.get(i) % 3 == 0) && (numlist.get(i) % 6 == 0) ) {
					canin = true;
				}else {
					canin = false;
					break;
				}
			}
		}

		if(canin == true) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}

	}

}