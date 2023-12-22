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
		int T = sc.nextInt();
		int cc = 1001;
		
		for(int i = 0; i < N; i++){
			int c = sc.nextInt();
			int t = sc.nextInt();
			if(t > T) continue;
			if(c < cc) cc = c;
		}
		
      	if(cc == 1001) System.out.println("TLE");
		else System.out.println(cc);
	}
}