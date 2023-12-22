import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] sorted = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
			sorted[i]=arr[i];
		}
		Arrays.sort(sorted);
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				if(sorted[i]==arr[j]) {
					System.out.print(j+1+" ");
					j=N;
				}
			}
		}
			
		
	}

}
