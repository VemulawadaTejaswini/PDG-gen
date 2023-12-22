import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		int robot[][] = new int[n][2];
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt(), l = sc.nextInt();
			robot[i][0] = x-l;
			robot[i][1] = x+l;
		}
		
		Arrays.sort(robot, Comparator.comparingInt(arr -> arr[1]));
		
		int cnt = 0;
		int r = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(robot[i][0] >= r) {
				cnt++;
				r = robot[i][1];
			}
		}
		
		System.out.println(cnt);
		
		
	}
 
}