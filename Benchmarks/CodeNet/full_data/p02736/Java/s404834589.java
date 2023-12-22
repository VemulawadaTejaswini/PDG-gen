import java.util.*;
import java.math.*;

public class Main {
	public static long mod = 1000000007;
	public static int[] a = new int[1000010];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String s = cin.next();
        for(int i = 1; i <= n; i++){
        	a[i] = Integer.parseInt(String.valueOf(s.charAt(i-1)));;
        }
        int ans = solve(n, 1);
        System.out.print(ans);
    }
    public static int solve(int x, int y){
    	if(x == 1) return a[y];
    	else{
    		return Math.abs(solve(x-1,y)-solve(x-1,y+1));
    	}
    }
}