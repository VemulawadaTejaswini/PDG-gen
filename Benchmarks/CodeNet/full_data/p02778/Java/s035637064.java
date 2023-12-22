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
		execute7_3();
	}
	
	private static void execute7_3() {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			
			String ans = "";
			for(int i=0; i<s.length();i++) ans+="x";
			
			System.out.println(ans);
		}
	}
}