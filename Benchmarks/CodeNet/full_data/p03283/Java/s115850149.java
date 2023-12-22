

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int Q = scanner.nextInt();
		
		int[] output = new int[Q];
		
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = "";
		}
		
		for(int i=0; i<M; i++) {
			int L = scanner.nextInt();
			int R = scanner.nextInt();
			arr[L-1] = arr[L-1] + " " + Integer.toString(R);
		}
		
		for(int i=0; i<Q; i++) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			for(int m=p; m<=q; m++) {
				String[] temp = arr[m-1].split(" ");
				for(int k=0; k<temp.length; k++) {
					if(!temp[k].equals("") && Integer.parseInt(temp[k]) <= q) {
						output[i] += 1;
					}
				}
			}		
		}
		
		for(int i=0; i<Q; i++) {
			System.out.println(output[i]);
		}
		
		
		

	}

}
