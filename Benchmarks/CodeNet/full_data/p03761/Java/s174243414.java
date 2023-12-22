import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[][] alp = new int[n][26];
		String str = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < n; i++){
			String S = in.next();
			for(int j = 0; j < S.length(); j++){
				alp[i][(S.charAt(j) - 'a')]++;
			}
		}
		
		for(int i = 0; i < 26; i++){
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < n; j++) min = Math.min(min, alp[j][i]);
			for(int j = 0; j < min; j++) System.out.print(str.charAt(i));
		}
	}
}