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
		
		int x = in.nextInt();
		int y = in.nextInt();
		boolean ans = false;
		int[][] list = {{1,3,5,7,8,10,12},{4,6,9,11}};
		
		boolean tf1 = false, tf2 = false;
		for(int i = 0; i < list[0].length; i++){
			if(list[0][i] == x) tf1 = true;
			if(list[0][i] == y) tf2 = true;
		}
		if(tf1 && tf2) ans = true;
		
		tf1 = false; tf2 = false;
		for(int i = 0; i < list[1].length; i++){
			if(list[1][i] == x) tf1 = true;
			if(list[1][i] == y) tf2 = true;
		}
		if(tf1 && tf2) ans = true;
		
		System.out.println(ans ? "Yes" : "No");
	}
}
