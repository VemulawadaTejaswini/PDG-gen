import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(), k = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) array[i]=sc.nextInt();
		Arrays.sort(array);
		for(int i=n-1;i>=n-k;i--) array[i]=0;
		int sum=0;
		for(int i=n-k-1;i>=0;i--) sum++;
		System.out.println(sum);
	}
}