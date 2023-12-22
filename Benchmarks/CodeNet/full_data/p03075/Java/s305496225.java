import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int antennas[] = new int[5];
		for (int i = 0; i < 5; i++){
			antennas[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		
		if (antennas[4] - antennas[0] <= k) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}