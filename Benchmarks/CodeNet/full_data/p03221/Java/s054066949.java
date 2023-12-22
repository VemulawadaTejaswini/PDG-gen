import java.util.*;
public class Main {
	static int ans = 0;
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int[][] py = new int[m][3];
		int[] count = new int[n];
		for (int i = 0;i < m; ++i){
			py[i][0] = Integer.parseInt(scan.next());
			py[i][1] = Integer.parseInt(scan.next());
			py[i][2] = i;
		}

		Arrays.sort(py,(x,y)->Integer.compare(x[1], y[1]));
		for (int i = 0;i < m; ++i){
			py[i][1] = ++count[py[i][0]-1];
		}
		
		Arrays.sort(py,(x,y)-> Integer.compare(x[2], y[2]));
		for (int i =0;i < m; ++i){
			System.out.printf("%06d%06d\n", py[i][0], py[i][1]);
		}

	}

}


//end