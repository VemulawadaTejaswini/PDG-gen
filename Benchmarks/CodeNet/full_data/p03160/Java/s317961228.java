import java.util.*;
public class Frog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] heights = new int[n];
		for(int i=0;i<n;i++) {
			heights[i] = in.nextInt();
		}
		
		int[] cost = new int[heights.length];
		
		for(int i=1;i<heights.length;i++) {
			if(i-2>=0) {
				cost[i] += Math.min(cost[i-1] + Math.abs(heights[i-1]-heights[i]),cost[i-2]+ Math.abs(heights[i-2]-heights[i]));
			}
			else if(i-1>=0) {
				cost[i] += cost[i-1] + Math.abs(heights[i-1]-heights[i]);
			}
		}
		System.out.println(cost[heights.length-1]);

	}

}
