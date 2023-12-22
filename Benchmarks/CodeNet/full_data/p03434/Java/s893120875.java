import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] pointArray = new Integer[n];
		for(int i =0;i < n;i++) {
			pointArray[i] = sc.nextInt();
		}
		Arrays.sort(pointArray,Collections.reverseOrder());
		int alice = 0;
		int bob = 0;
		for(int i =0;i < n;i++) {
			if(i % 2 ==0) {
				alice += pointArray[i];
			}else {
				bob += pointArray[i];
			}
		}
		System.out.println(alice -bob);
	}
}