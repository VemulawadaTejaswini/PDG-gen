/* Filename: AGC003C.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.TreeSet;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			TreeSet<Integer> even = new TreeSet<Integer>();
			TreeSet<Integer> odd = new TreeSet<Integer>();
			
			for(int i = 0; i < N; ++i){
				if(i % 2 == 0){
					even.add(input.nextInt());
				} else {
					odd.add(input.nextInt());
				}
			}
			
			Integer[] evenA = even.toArray(new Integer[0]);
			Integer[] oddA = odd.toArray(new Integer[0]);
			int[] A = new int[N];
			
			for(int i = 0; i < A.length; ++i){
				if(i % 2 == 0){
					A[i] = evenA[i / 2];
				} else {
					A[i] = oddA[i / 2];
				}
			}
			
			long swap2 = 0;
			for(int i = 0; i < A.length; ++i){
				for(int j = i + 1; j < A.length; ++j){
					if(A[j] < A[i]){
						++swap2;
					}
				}
			}
			
			System.out.println(swap2);
		}
	}

}
