import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numberList = new int[n];
		for(int i = 0; i < n;i++) {
			numberList[i] = sc.nextInt();
		}
		Arrays.sort(numberList);
		for(int i =1; i < n; i++) {
			if(numberList[i] == numberList[i-1]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}