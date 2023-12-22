import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		Integer[] tmep = new Integer[n];
		for(int i = 0; i < n; i++)
			tmep[i] = sc.nextInt();
		Arrays.sort(tmep);
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = tmep[i];
		
		long count = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				
				int max = array[i] + array[j];
				int min = Math.abs(array[i] - array[j]);
				
				int x = Arrays.binarySearch(array, min);
				int y = Arrays.binarySearch(array, max);
				
				if(x < 0)
					x = -(x + 1);
				else
					x++;
				
				if(y < 0)
					y = -(y + 1);
				y--;
				
				count += y - j;
			}
		}
		
		System.out.println(count);
	}
}