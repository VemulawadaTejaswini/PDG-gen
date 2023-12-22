import java.util.*;

public class ABC146C_Buy_an_Integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N - 1];
		int[] B = new int[N - 1];
		int[] vertex = new int[N];
		Arrays.fill(vertex, 0);
		for(int i = 0; i < N - 1; i++){
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			vertex[A[i]]++; 
			vertex[B[i]]++; 
		}
		int max = -1;
		for(int i = 0; i < N - 1; i++){
			max = Math.max(vertex[i], max);
		}
		System.out.println(max);
		int[] color = new int[N];
		boolean[] seen = new boolean[N];
		Arrays.fill(seen, false);
		color[0] = -1;
		int x = 0;
		for(int i = 0; i < N - 1; i++){
			
			if(!seen[A[i]]){
				seen[A[i]] = true;
				x = color[i];
			}
			x++;
			int next = (x % max);
			System.out.println(next + 1);
			color[B[i]] = next;
		}
	}
}