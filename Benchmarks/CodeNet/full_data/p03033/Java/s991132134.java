import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		ArrayList<State> list=new ArrayList<>();
		for(int i=0; i<n; i++){
			int s=sc.nextInt();
			int t=sc.nextInt();
			int x=sc.nextInt();
			list.add(new State(s-x,x,-2));
			list.add(new State(t-x,x,-1));
		}
		for(int i=0; i<q; i++){
			list.add(new State(sc.nextInt(),0,i));
		}
		Collections.sort(list);
		int[] ans=new int[q];
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0; i<list.size(); i++){
			State s=list.get(i);
			if (s.v == -2) {
				set.add(s.d);
			}else if (s.v == -1) {
				set.remove(s.d);
			}else {
				ans[s.v] = set.isEmpty() ? -1 : set.first();
			}
		}
		for(int i=0; i<q; i++){
			System.out.println(ans[i]);
		}
	}
	static class State implements Comparable<State>{
		int t,d,v;
		State(int t,int d,int v){
			this.t=t;
			this.d=d;
			this.v=v;
		}
		public int compareTo(State s){
			return this.t-s.t;
		}
	}
}


