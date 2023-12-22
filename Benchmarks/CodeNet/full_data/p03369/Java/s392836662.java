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
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		
		//Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int n = 0;
		for(int i = 0; i < 3; i++)
			if(S.charAt(i) == 'o') n++;
			
		System.out.println(700+100*n);
	}
}