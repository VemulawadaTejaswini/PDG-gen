
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int people = scan.nextInt();
		int day = scan.nextInt();
		int remainder = scan.nextInt();
		
		int[] eatDay = new int[people];
		
		int sum = 3;
		for (int i = 0; i < people; i++) {
			eatDay[i] = scan.nextInt();
			int count = 0;
			for (int j = 1;; j++) {
				count = j * eatDay[i] + 1;
				if (count <= day) {
					sum++;
				} else {
					break;
				}
			}
		}
		
		System.out.println(sum + remainder);
		
	}
}
