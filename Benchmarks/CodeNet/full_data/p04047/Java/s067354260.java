import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] l = new int[n*2];
		for(int i=0;i<n*2;i++){
			l[i] = scanner.nextInt();
		}
		Arrays.sort(l);
		int sum = 0;
		for(int i=0;i<n*2;i+=2){
			sum += Math.min(l[i], l[i+1]);
		}
		System.out.println(sum);
	}

}
