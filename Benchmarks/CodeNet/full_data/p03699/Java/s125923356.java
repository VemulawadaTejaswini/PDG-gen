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
		int bitMax = (1 << N) - 1;
		int max = 0;
		int[] s = new int[N];
		for(int i = 0; i < N; i++) s[i] = in.nextInt();
		Arrays.sort(s);
		
		for(int bit = bitMax; bit >= 0; bit--){
			int sum = 0;
			for(int i = 0; i < N; i++){
				sum += s[i] * ((bit >> i) & 1);
			}
			
			if(sum % 10 != 0){
				max = sum;
				break;
			}
		}
		
		System.out.println(max);
	}
}
