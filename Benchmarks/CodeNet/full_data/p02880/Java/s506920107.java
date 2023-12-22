import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int c = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int m = i*j;
				if(m == n)
					c += 1;
			}
		}
		
		if(c >= 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}