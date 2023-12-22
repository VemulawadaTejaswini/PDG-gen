import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//a==1 or b==n の時だけ読み込む
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==1) {
				arr1.add(b);
			} else if(b==n) {
				arr2.add(a);
			}
		}
		for(int i : arr1) {
			if(arr2.contains(i)) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPPOSSIBLE");
	}
}