import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int sum_l = 0;
		int sum_r = 0;
		for(int i = 0; i < M; i++){
			int A = sc.nextInt();
			if(A < X) sum_l++;
			else sum_r++;
		}
		System.out.println(Math.min(sum_l, sum_r));
	}
}