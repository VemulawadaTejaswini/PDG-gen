import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int[] list = new int[3];
		list[0] = scan.nextInt();
		list[1] = scan.nextInt();
		list[2] = scan.nextInt();
		Arrays.sort(list);
		sum = list[0] + list[1];
		System.out.println(sum);
		
		scan.close();
	}

}
