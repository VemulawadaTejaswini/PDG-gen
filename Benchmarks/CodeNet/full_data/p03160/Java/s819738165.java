import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int len = inputs.nextInt();
		int[] vals = new int[len];
		for(int i = 0;i<len;i++) {
			vals[i] = inputs.nextInt();
		}
		int[] stones = new int[len];
		stones[0] = 0;
		stones[1] = Math.abs(vals[0]-vals[1]);
		for(int i=2;i<len;i++) {
			stones[i] = Math.min(Math.abs(vals[i-1]-vals[i])+stones[i-1], Math.abs(vals[i-2] - vals[i])+stones[i-2]);
		}
		System.out.println(stones[len-1]);
	}

}
