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
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] s = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++){
			s[i] = in.nextInt();
			sum += s[i];
		}
		Arrays.sort(s);
		
		if(sum % 10 != 0) System.out.println(sum);
		else{
			for(int i = 0; i < N; i++){
				if(s[i] % 10 != 0){
					System.out.println(sum-s[i]);
					return;
				}
			}
			System.out.println(0);
		}
	}
}
