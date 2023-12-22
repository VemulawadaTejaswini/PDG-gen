import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		int M = Integer.parseInt(in.next());
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		int tmpa,tmpb;
		for(int i = 0; i<M; i++){
			tmpa=Integer.parseInt(in.next());
			tmpb=Integer.parseInt(in.next());
			if(tmpa==1)x.add(tmpb);
			if(tmpb==1)x.add(tmpa);
			if(tmpa==N)y.add(tmpb);
			if(tmpb==N)y.add(tmpa);
		}
		Collections.sort(x);
		Collections.sort(y);
		String ans = "IMPOSSIBLE";
		for(int i = 0;i<x.size();i++){
			if(y.contains(x.get(i))){
				ans="POSSIBLE";
				break;
			}
		}
		System.out.println(ans);
	}
}