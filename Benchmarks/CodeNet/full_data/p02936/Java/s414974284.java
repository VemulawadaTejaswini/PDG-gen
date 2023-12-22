import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int Q=stdIn.nextInt();
		int ans[]=new int[N];
		ArrayList<ArrayList<Integer>> tree=new ArrayList<ArrayList<Integer>>();
		Deque<Integer> past=new ArrayDeque<Integer>();
		Deque<Integer> now=new ArrayDeque<Integer>();
		for(int i=0;i<N;i++){
			ArrayList<Integer> a=new ArrayList<Integer>();
			tree.add(a);
		}
		for(int i=0;i<N-1;i++){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt()-1;
			ArrayList<Integer> c=new ArrayList<Integer>();
			c=tree.get(a);
			c.add(b);
			tree.set(a,c);
			c=tree.get(b);
			c.add(a);
			tree.set(b,c);
		}
		for(int i=0;i<Q;i++){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt();
			ans[a]+=b;
		}
		for(int i=0;i<tree.get(0).size();i++){
			int a=tree.get(0).get(i);
			ans[a]+=ans[0];
			if(tree.get(a).size()>1){
				past.add(0);
				now.add(a);
			}
		}
		while(past.size()!=0){
			int a=past.poll();
			int b=now.poll();
			for(int i=0;i<tree.get(b).size();i++){
				int x=tree.get(b).get(i);
				if(x!=a){
					ans[x]+=ans[b];
					if(tree.get(x).size()>1){
						past.add(b);
						now.add(x);
					}
				}
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(ans[i]);
		}
	}
}
