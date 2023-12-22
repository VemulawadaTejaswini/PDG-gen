import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] ar = new int[n];
			int[] bin = new int[n];
			int[][] subar = new int[n][n];
 			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++){
				for(int j = i; j < n; j++){
					if(j > i){
						subar[i][j] = subar[i][j - 1] + ar[j];
					}else{
						subar[i][j] = ar[j];
					}
				}
			}
			ArrayList<Integer> hoge = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					hoge.add(subar[i][j]);
				}
			}
			Collections.sort(hoge);
			int[] max = new int[k];
			for (int i = 0; i < k; i++) {
				max[i] = hoge.get(hoge.size()-1-i);
			}
			int sum = max[0];
			for (int i = 0; i < k; i++) {
				sum = sum & max[i];
			}
			System.out.println(sum);

		    sc.close(); }
}
