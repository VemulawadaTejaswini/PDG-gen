import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int G = sc.nextInt();
		int[] prob = new int[D];
		int[] comp = new int[D];
		for(int i = 0; i < D; i++){
			prob[i] = sc.nextInt();
			comp[i] = sc.nextInt();
		}
		
		int ans = 0;
		
		int[] csum = new int[D];
		for(int i = 0; i < D; i++){
			csum[i] = (i + 1) * 100 * prob[i] + comp[i];
		}
		
		int[][] pcc = new int[D][3];
		for(int i = 0; i < D; i++){
			pcc[i][0] = i;
			pcc[i][1] = csum[i];
			pcc[i][2] = prob[i];
		}
		
		Arrays.sort(pcc, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	            return o2[1] / o2[2] - o1[1] / o1[2];
	        }
	    });
		
		
		/*
		for(int i = 0; i < D; i++){
			System.out.println(pcc[i][0] + " " + pcc[i][1] + " " + pcc[i][2]);
		}
		System.out.println();
		*/
		
		int count = 0;
		int index = 0;
		for(int i = 0; i < pcc.length; i++){
			count += pcc[i][1];
			ans += pcc[i][2];
			if(count > G){
				count -= pcc[i][1];
				ans -= pcc[i][2];
				break;
			}
			index++;
		}
		
		int[][] subpcc = new int[D-index][3];
		for(int i = 0; i < D-index; i++){
			subpcc[i][0] = pcc[i+index][0];
			subpcc[i][1] = pcc[i+index][1];
			subpcc[i][2] = pcc[i+index][2];
		}
		
		Arrays.sort(subpcc, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	            return o2[0] - o1[0];
	        }
	    });
	    
		/*
		System.out.println(count + " " + index + " " + ans + "\n");
		for(int i = 0; i < subpcc.length; i++){
			System.out.println(subpcc[i][0] + " " + subpcc[i][1] + " " + subpcc[i][2]);
		}
		*/
		
		ans += (G - count) / ((subpcc[0][0] + 1) * 100);
		
		System.out.println(ans);
	}
}