import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int bigHit = sc.nextInt();
		int smallHit = sc.nextInt();
		sc.nextLine();
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = Integer.valueOf(sc.nextLine());
		}
		sc.close();
		Arrays.sort(array);
		
		boolean stopFlag = false;
		long hitCount = 0;
		while (!stopFlag) {
			if (array[count - 1] <= 0) {
				stopFlag = true;
				break;
			} else {
				array[count - 1] -= bigHit;
			}
			for (int i = count - 2; i >= 0; i--) {
				if (array[i] <= 0) {
					break;
				} else {
					array[i] -= smallHit;
				}
			}
			Arrays.sort(array);
			hitCount++;
		}
		
		System.out.println(hitCount);
	}
}