import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Pair[] array = new Pair[n];
		for(int i = 0; i < n; i++)
			array[i] = new Pair(sc.nextInt(), sc.nextInt());
		Arrays.sort(array);
		
		int time = 0;
		for(int i = 0; i < n; i++) {
			if(time + array[i].a > array[i].b) {
				System.out.println("No");
				return;
			}
			time += array[i].a;
		}
		
		System.out.println("Yes");
	}
	
	static class Pair implements Comparable<Pair> {
		int a;
		int b;
		
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(Pair p) {
			return this.b - p.b;
		}
	}
}
