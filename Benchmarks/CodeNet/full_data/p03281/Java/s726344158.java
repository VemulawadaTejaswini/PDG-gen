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
		int ans = 0;
		
		for(int i = 1; i * 2 + 1 <= N; i++){
			int n = i * 2 + 1;
			int count = 0;
			for(int j = 1; j * 2 + 1 <= n; j++){
				if(n % (j * 2 + 1) == 0) count++;
				if(count > 7) break;
			}
			if(count == 7) ans++;
		}
		
		System.out.println(ans);
	}
}