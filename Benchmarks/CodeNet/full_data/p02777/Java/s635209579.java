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
		execute7_4();
	}
	
	private static void execute7_4() {
		try (Scanner sc = new Scanner(System.in)) {
			String A = sc.next();
			String B = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			String U = sc.next();
			
			if(U.equals(A)) {
				System.out.println((a-1)+" "+b);
			}else {
				System.out.println(a+" "+(b-1));
			}
		}
	}
}