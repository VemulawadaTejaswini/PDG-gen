import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			b.add(a[i]);
			Collections.reverse(b);
		}
		for(int i = 0; i < n - 1; i++) {
			System.out.print(b.get(i) + " ");
		}
		System.out.println(b.get(n-1));
	}
}