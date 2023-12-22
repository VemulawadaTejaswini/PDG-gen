
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
static HashMap<Integer,Integer> set=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> weights = new HashMap<>();

		for (int i = 0; i < n-1; i++) {
			int u = scn.nextInt();
			int v = scn.nextInt();
			int w = scn.nextInt();
			if (hmap.containsKey(u)) {
				ArrayList<Integer> al=hmap.get(u);
				ArrayList<Integer> w1=weights.get(u);	
				w1.add(w);
				weights.put(u, w1);
				al.add(v);
				hmap.put(u,al);
			} else {
				ArrayList<Integer> al=new ArrayList<>();
				al.add(v);
				ArrayList<Integer> w1=new ArrayList<>();	
				w1.add(w);
				weights.put(u, w1);
				hmap.put(u,al);
			}
			if (hmap.containsKey(v)) {
				ArrayList<Integer> al=hmap.get(v);
				al.add(u);
				ArrayList<Integer> w1=weights.get(v);	
				w1.add(w);
				weights.put(v, w1);
				hmap.put(v,al);
			} else {
				ArrayList<Integer> al=new ArrayList<>();
				al.add(u);
				ArrayList<Integer> w1=new ArrayList<>();	
				w1.add(w);
				weights.put(v, w1);
				hmap.put(v,al);
			}
		}
		HashSet<Integer> visited =new HashSet<>();
		for(int i=1;i<=n;i++) {
			if(!visited.contains(i)) {
				solve(hmap,weights,visited,i,0);
			}
		}
		
		for(int x:set.keySet()) {
			System.out.println(set.get(x));
		}
	}
	
	public static void solve(HashMap<Integer, ArrayList<Integer>> hmap,HashMap<Integer, ArrayList<Integer>> weights, HashSet<Integer> visited, int ele, int color) {
		visited.add(ele);
		set.put(ele, color);
		//System.out.println(color+" "+ele);
		ArrayList<Integer> a=hmap.get(ele);
		ArrayList<Integer> w=weights.get(ele);
		for(int i=0;a!=null &&i<a.size();i++) {
			if(!visited.contains(a.get(i))) {
				if(w.get(i)%2==0)
					solve(hmap,weights,visited,a.get(i),color);
				else
					solve(hmap,weights,visited,a.get(i),color==1?0:1);
				
				//System.out.println("ret "+ele);
			}
		}
	}

}
