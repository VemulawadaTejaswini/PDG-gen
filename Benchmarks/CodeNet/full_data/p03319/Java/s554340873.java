import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		
		tmpArray = br.readLine().split(" ");
		
		int[] array = new int[n];
		
		int left = 0;
		int right = 0;
		for(int i = 0; i < n; i++){
			array[i] = Integer.parseInt(tmpArray[i]);
			if(array[i] == 1){
				left = i;
				right = i;
			}
		}
		
		int count = 0;
		while(left > 0){
			count++;
			left -= k - 1;
//			System.out.println("left "+left);
		}
		
		while(right < n - 1){
			count++;
			right += k - 1;
//			System.out.println("right "+right);
		}
		
		System.out.println(count);
	}
	
}