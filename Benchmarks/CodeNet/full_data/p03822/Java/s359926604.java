import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
		
		System.out.println(solve(win, 0));
		
	}
	
	public static int solve(ArrayList<Integer>[] win, int m){
		int len = win[m].size();
		int[] dlist = new int[len + 1];
		for(int i=0; i<len; i++){
			dlist[i] = solve(win, win[m].get(i));
		}
		dlist[len] = len+1;
		int max = 0;
		for(int i=0; i<len+1; i++){
			if(dlist[i] > max){
				max = dlist[i];
			}
		}
		Arrays.sort(dlist);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> maxlist = new HashMap<Integer, Integer>();
		int mi = 0;
		for(int i=0; i<len; i++){
			if(hm.containsKey(dlist[i])){
				hm.put(dlist[i], hm.get(dlist[i]) + 1);
			}else{
				hm.put(dlist[i], 1);
			}
			if(!maxlist.containsKey(dlist[i])){
				maxlist.put(mi, dlist[i]);
				mi++;
			}	
		}
		
		int ans = 0;
		int pos = 0;
		for(int i=0; i<mi; i++){
			if(maxlist.get(i) + hm.get(maxlist.get(i)) > ans){
				ans = maxlist.get(i) + hm.get(maxlist.get(i));
				pos = i;
			}
		}
/*		if(pos+1<mi){
			for(int i=pos+1; i<mi; i++){
				ans += hm.get(maxlist.get(i));
			}
		}*/
		
		return ans;
		
	}
}
