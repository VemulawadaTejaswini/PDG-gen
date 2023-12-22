import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
	}

	
	public static void D(Scanner sc) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
		for(int i=1;i<H+1;i++) {
			for(int j=1;j<W+1;j++) {
				map.put(sc.nextInt(),new int[] {i,j});
			}
		}
		int[] dist = makedist2(map,D,H*W);
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			out.println(dist[r]-dist[l]);
		}
		
	}
	
	//
	public static int[] makedist2(HashMap<Integer, int[]> map, int d, int hw) {
		int[] ret = new int[hw+1];
		for(int i=1;i<=d;i++) {
			for(int j=i+d;j<=hw;j++) {
				ret[j] = ret[j-d]+ Math.abs(map.get(j)[0]-map.get(j-d)[0]) + Math.abs(map.get(j)[1]-map.get(j-d)[1]);
			}
		}
		return ret;
	}

	
}