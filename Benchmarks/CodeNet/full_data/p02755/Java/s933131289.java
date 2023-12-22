import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		int y = sc.nextInt();
		for(int i = 0; i<2000; i++) {
			if((int)(i*0.08) == x && (int)(i * 0.1) == y) {
				System.out.println(i);
				return; 
			}
		}
		System.out.println(-1); 
	}
}