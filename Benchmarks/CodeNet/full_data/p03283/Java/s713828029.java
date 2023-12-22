import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		
		int[][] LR = new int[M][2];
		for(int i = 0; i < M; i++){
			LR[i][0] = sc.nextInt();
			LR[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < Q; i++){
			int p = sc.nextInt();
			int q = sc.nextInt();
			int ans = 0;
			
			for(int j = 0; j < M; j++){
				if(LR[j][0] < p) continue;
				if(LR[j][1] > q) continue;
				ans++;
			}
			
			System.out.println(ans);
		}
	}
}