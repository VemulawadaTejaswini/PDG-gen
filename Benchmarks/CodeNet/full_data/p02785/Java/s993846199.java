import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int k = scn.nextInt();
		int[] h = new int[n];
		for(int i=0; i<n; i++){
			h[i] = scn.nextInt();
		}
      	Arrays.sort(h);
      	long att = 0;
      	for(int i=0; i<n-k; i++){
			att = att + h[i];
		}
      	System.out.println(att);
	}
}
