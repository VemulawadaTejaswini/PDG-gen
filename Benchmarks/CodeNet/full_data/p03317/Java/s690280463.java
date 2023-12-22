import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
 */

public class Main {

	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		int min = N + 1;
		int indexMin = 0;
		for(int i = 0; i < N; i++)
			if(A[i] < min){
				min = A[i];
				indexMin = i;
			}
		
		int left = indexMin;
		int right = N - left - 1;
		
		int numLeft = left / (K - 1);
		if(left % (K - 1) != 0) numLeft++;
		
		int numRight = right / (K - 1);
		if(right % (K - 1) != 0) numRight++;
		 
		System.out.println(numLeft + numRight);
	}
}