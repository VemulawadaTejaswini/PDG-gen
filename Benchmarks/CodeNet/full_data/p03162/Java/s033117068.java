import java.util.*;
import java.io.*;
public class Main
{
    public static int solve(List<ArrayList<Integer>> l, int prev, int i){
        if(i >= l.size()){
            return 0;
        }
        int ans = 0;
        if(prev != 0){
            ans = Math.max(ans, l.get(i).get(0) + solve(l, 0, i+1));
        }
        if(prev != 1){
            ans = Math.max(ans, l.get(i).get(1) + solve(l, 1, i+1));
        }
        if(prev != 2){
            ans = Math.max(ans, l.get(i).get(2) + solve(l, 2, i+1));
        }
        return ans;
    }
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    List<ArrayList<Integer>> l = new ArrayList<>();
	    for(int i = 0; i < n; i++){
	        String[] s = br.readLine().split(" ");
	        ArrayList<Integer> ll = new ArrayList<>();
	        for(String k : s){
	            ll.add(Integer.parseInt(k));
	        }
	        l.add(new ArrayList<>(ll));
	        ll.clear();
	    }
	    System.out.println(solve(l, -1, 0));
	}
}
