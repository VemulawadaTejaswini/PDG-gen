import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute12_2();
	}
	
	private static void execute12_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] box = new int[n];
			for(int i=0; i<n;i++) box[i] = 1;
			int[][] a = new int[m][2];
			Set<Integer> possible = new HashSet<>();
			possible.add(1);
			
			for(int i=0; i<m ;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(possible.contains(x)) {
					possible.add(y);
					box[x-1]--;
					box[y-1]++;
					if(box[x-1]==0) possible.remove(x);
				}
				
			}
			
			System.out.println(possible.size());
			
		}
	}
}