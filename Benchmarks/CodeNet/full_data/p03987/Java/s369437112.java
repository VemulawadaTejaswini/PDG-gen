import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		long sum = 0;
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
			sum += array[i];
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				array[j] = Math.min(array[j+1], array[j]);
				sum += array[j];
			}
		}
		System.out.println(sum);
	}
}