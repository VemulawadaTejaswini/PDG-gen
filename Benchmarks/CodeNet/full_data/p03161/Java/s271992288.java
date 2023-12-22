import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int len = inputs.nextInt();
		int dis = inputs.nextInt();
		int[] vals = new int[len];
		for(int i = 0;i<len;i++) {
			vals[i] = inputs.nextInt();
		}
		int[] stones = new int[len];
		stones[0] = 0;
		stones[1] = Math.abs(vals[0]-vals[1]);
		int cost = Integer.MAX_VALUE;
		for(int i=2;i<len;i++) {
			for(int k=1;k<dis;k++) {
				cost = Math.min(cost, Math.abs(vals[i-k]-vals[i])+stones[i-k]);
			}
			stones[i] = cost;
		}
		System.out.println(stones[len-1]);
	}
}
