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
		
		String n = sc.next();
		String ans = "";
		for(int i = 0; i < n.length(); i++){
			if(n.charAt(i) == '1') ans += "9";
			else if(n.charAt(i) == '9') ans += "1";
			else ans += n.charAt(i);
		}
		
		System.out.println(ans);
	}
}