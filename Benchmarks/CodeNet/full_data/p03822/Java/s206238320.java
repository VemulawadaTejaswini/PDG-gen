import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		a[0] = 0;
		for(int i=1; i<n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		ArrayList<Integer>[] win = new ArrayList[n];
		for(int i=0; i<n; i++){
			win[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<n; i++){
			win[a[i]-1].add(i);
		}
		
		System.out.println(solve(win, 0) - 1);
		
	}
	
	public static int solve(ArrayList<Integer>[] win, int m){
		int len = win[m].size();
		int[] dlist = new int[len + 1];
		for(int i=0; i<len; i++){
			dlist[i] = solve(win, win[m].get(i));
		}
		dlist[len] = len;
		int max = 0;
		for(int i=0; i<len+1; i++){
			if(dlist[i] > max){
				max = dlist[i];
			}
		}
		if(m == 0 && max == len){
			return max;
		}else{
			return max + 1;
		}
	}
}