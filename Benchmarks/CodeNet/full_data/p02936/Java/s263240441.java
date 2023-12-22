
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int q=scn.nextInt();
		int []arr=new int[n+1];
		HashMap<Integer, ArrayList<Integer>> hmap=new HashMap<>();
		//HashMap<Integer,Integer> sum =new HashMap<>();
		for(int i=0;i<n-1;i++) {
			int x=scn.nextInt();
			int y=scn.nextInt();
			if(hmap.containsKey(x)) {
				ArrayList<Integer> a=hmap.get(x);
				a.add(y);
				hmap.put(x,a);
			}else{
				ArrayList<Integer> a=new ArrayList<>();
				a.add(y);
				hmap.put(x,a);

			}
			if(hmap.containsKey(y)) {
				ArrayList<Integer> a=hmap.get(y);
				a.add(x);
				hmap.put(y,a);

			}else{
				ArrayList<Integer> a=new ArrayList<>();
				a.add(x);
				hmap.put(y,a);

			}
		}
		for(int i=0;i<q;i++) {
			int x=scn.nextInt();
			arr[x]+=scn.nextInt();
		}
		solve(hmap,arr,n);
		for(int i=1;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void solve(HashMap<Integer, ArrayList<Integer>> hmap,int []arr,int n) {
		HashSet<Integer> set =new HashSet<>();
		for(int i=1;i<=n;i++) {
			if(!set.contains(i)) {
				recurse(hmap,arr,set,i,0);
			}
		}
	}
	public static void recurse(HashMap<Integer, ArrayList<Integer>> hmap,int []arr,HashSet<Integer> set,int x,int move) {
		ArrayList<Integer> a=hmap.get(x);
		set.add(x);
		arr[x]+=move;
		move=arr[x];
		for(int i=0;i<a.size();i++) {
			if(!set.contains(a.get(i))) {
				recurse(hmap,arr,set,a.get(i),move);
			}
		}
	}
}
