import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine().split("")[0]);
		String[] line = scanner.nextLine().split(" ");
		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = Integer.parseInt(line[i]);
		}
		Arrays.sort(a);
		int min = 1000000000;
		for(int i = a[0]; i <= a[a.length-1]; i++){
			int sum = 0;
			for(int j = 0; j < N; j++){
				sum += (i-a[j]) * (i-a[j]);
//				System.out.println(i + "," + a[j] + ": " + (i-a[j]) * (i-a[j]));
			}
//			System.out.println(i + "sum: " + sum);
			min = Math.min(min, sum);
		}


		System.out.println(min);
	}

}
