import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n= scn.nextInt();
		int x= scn.nextInt();
		int y =scn.nextInt();
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		res(n,x,y);

	}
	public static void res(int n,int x ,int y){
		ArrayList<ArrayList<Integer>>al = new ArrayList<>();
		for(int i=0;i<n;i++){
			ArrayList<Integer> al1 = new ArrayList<Integer>();
			al.add(al1);
		}
		for(int i=1;i<n;i++){
		   ArrayList<Integer> al1 = al.get(i-1);
		   ArrayList<Integer> al2 = al.get(i);
		   al1.add(i);
		   al2.add(i-1);
		   
		}
		ArrayList<Integer> al1 = al.get(x-1);
		al1.add(y-1);
		//al.add(al1);
		al1 =al.get(y-1);
		al1.add(x-1);
		
		HashMap<Integer,Integer> hm =new HashMap<>();
		for(int i=0;i<n;i++){
			bfs(i,al,hm);
		}
		for(int i=1;i<n;i++){
			if(hm.containsKey(i)){
			
				System.out.println(hm.get(i)/2);
			}else{
				System.out.println(0);
			}
		}
	
	}
	public static void bfs(int s,ArrayList<ArrayList<Integer>> al,HashMap<Integer,Integer> hm ){
		LinkedList<pair> q = new LinkedList<>();
		HashSet<Integer> hs = new HashSet<>();
		q.add(new pair(s,0));
		while(q.size()>0){
		     pair p1 =q.removeFirst();
			if(hs.contains(p1.val)){
				continue;
			}
			  if(hm.containsKey(p1.dis)){
				  hm.put(p1.dis,hm.get(p1.dis)+1);
			  }else{
				  hm.put(p1.dis,1);
			  }
			hs.add(p1.val);
			ArrayList<Integer> al1 = al.get(p1.val);
			for(int val : al1){
				q.addLast(new pair(val,p1.dis+1));
			}
		}
	}
	
	public static class pair{
		int val ;
		int dis;
		public pair(int val ,int dis){
			this.val=val;
			this.dis=dis;
		}
	}

}