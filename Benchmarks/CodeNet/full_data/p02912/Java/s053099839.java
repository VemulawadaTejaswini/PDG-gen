import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int array[] = new int [n];
		for(int i = 0;i < n;i++){
			array[i] = sc.nextInt();
		}
		for(int i = 0;i < m;i++){
			Arrays.sort(array);
			array[array.length - 1] = array[array.length - 1] / 2;
		}
		for(int i = 0;i<n;i++){
			sum += array[i];
		}
		System.out.println(sum);

	}
}