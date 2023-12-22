import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		long r = Long.parseLong(sc.next());
		long D = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		for(int i=0;i<10;i++){
			x = r*x-D;
			System.out.println(x);
			
		}
		
		
		
	}
	
	
	
}