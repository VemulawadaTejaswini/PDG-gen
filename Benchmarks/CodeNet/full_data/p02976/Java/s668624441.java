import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numNode = sc.nextInt();
		int numEdge = sc.nextInt();
		int edge[][] = new int[numEdge][2];
		for(int i = 0; i < numEdge; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edge[i][0] = Math.min(a, b);
			edge[i][1] = Math.max(a, b);
		}
		Arrays.sort(edge, (a, b) -> Integer.compare(a[1], b[1]));
		Arrays.sort(edge, (a, b) -> Integer.compare(a[0], b[0]));
		if(numEdge % 2 != 0) {
			System.out.println("-1"); return;
		}
		long begin[] = new long[numNode];
		for(int i = 0; i < numNode; i ++) {
			begin[i] = 0;
		}
		int tmpStart;
		int prvStart = -1;
		for(int i = 0; i < numEdge; i ++) {
			tmpStart = edge[i][0];
			if(begin[tmpStart] % 2 != 0) {
				tmpStart = -1;
				System.out.println((edge[i][0] + 1)+" "+(edge[i][1] + 1));
				begin[edge[i][0]] ++;
			}
			if(tmpStart == prvStart && tmpStart != -1) {
				tmpStart = -1;
				System.out.println((edge[i - 1][0] + 1)+" "+(edge[i - 1][1] + 1));
				System.out.println((edge[i][0] + 1)+" "+(edge[i][1] + 1));
				begin[edge[i][0]] += 2;
			}else if(prvStart != -1) {
				System.out.println((edge[i - 1][1] + 1)+" "+(edge[i - 1][0] + 1));
				begin[edge[i - 1][1]] ++;
			}
			prvStart = tmpStart;
		}
		if(begin[edge[numEdge - 1][0]] % 2 != 0) {
			System.out.println((edge[numEdge - 1][0] + 1)+" "+(edge[numEdge - 1][1] + 1));
		}
		if(begin[edge[numEdge - 1][1]] % 2 != 0) {
			System.out.println((edge[numEdge - 1][1] + 1)+" "+(edge[numEdge - 1][0] + 1));
		}
	}
}