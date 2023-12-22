import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i < n;i++){
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int score = 0;
		boolean b = true;
		for(int i = array.length-1;i>=0;i--){
			int x = b ? array[i] : -array[i];
			b = !b;
			score += x;
		}
		System.out.println(score);
	}
}