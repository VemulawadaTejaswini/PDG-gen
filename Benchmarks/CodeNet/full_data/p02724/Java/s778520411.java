import java.util.*;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			int chash =  sc.nextInt();
			int coin500 = chash / 500;
			int tmp = chash % 500;
			int coin5 = tmp / 5;
			System.out.println((coin500 * 1000) + (coin5 * 5));
		}
	}

}
