import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		long sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				sum += array[i] * array[j];
			}
		}
		
		System.out.println(sum);
	}
}
