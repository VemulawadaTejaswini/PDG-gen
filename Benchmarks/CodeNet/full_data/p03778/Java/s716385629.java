import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int W = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int minDistance = 0;
		
		for (int i = 1; i > 0;) {
			if (Math.abs(a-b) <= W){
				System.out.println(minDistance);
				break;
			}else {
			minDistance += i;
			W++;
			}
		}
	}
}