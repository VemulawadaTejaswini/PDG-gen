import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in); 
		HashMap<Integer,Integer> map = new HashMap<>(); 
		for(int i = 0; i<9; i++) {
		   int x = sc.nextInt(); 
		    map.put(x,x); 
		}
		int n = sc.nextInt(); 
		for(int i= 0; i<n; i++) {
			int x = sc.nextInt(); 
			if(!map.containsKey(x)) {
				System.out.println("No"); 
				return; 
			}
		}
		System.out.println("Yes"); 
	}
}