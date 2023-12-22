import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] d = new int[n];
		if(s.charAt(0)=='E')d[0] = 1;
		for(int i=1; i<n; i++){
			if(s.charAt(i)=='E')d[i] += d[i-1] + 1;
			else d[i] = d[i-1];
		}
		int min = d[n-1] - d[0];
		for(int i=1; i<n; i++){
			min = Math.min(min, i-d[i-1]+d[n-1]-d[i]);
		}
		System.out.println(min);
	}
}