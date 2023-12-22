import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[M][2];
		List<Integer> cut = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (x,y) -> x[0]-y[0]);
		for(int i = 0; i < M; i++) {
			if(a[i][0] == 1)
				cut.add(a[i][1]);
			else
				break;
		}
		Arrays.sort(a, (x,y) -> x[1]-y[1]);
		for(int i = M-1; i >= 0; i--) {
			if(a[i][1] == N)
				if(cut.contains(a[i][0])){
					System.out.println("POSSIBLE");
					return;
				}
			else
				break;
		}
		System.out.println("IMPOSSIBLE");
	}

}