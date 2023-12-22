import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nest = scan.nextInt();
		int step = 1;
		int count = 0;
		for(int ind = 1;ind<=nest;ind++) {
			System.out.println(ind + " " + step);
			if(ind == nest) System.out.println(step);
			count++;
			if(count == step) {
				step++;
				count = 0;
			}
		}
	}
}
