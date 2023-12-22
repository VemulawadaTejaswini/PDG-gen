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
		int count = 0; 
		int n = sc.nextInt(); 
		for(int i= 0; i<n; i++) {
			int x = sc.nextInt(); 
			if(map.containsKey(x)) {
				count++; 
			}
		}
		if(count < 3) System.out.println("No"); 
		else System.out.println("Yes"); 
	}
}