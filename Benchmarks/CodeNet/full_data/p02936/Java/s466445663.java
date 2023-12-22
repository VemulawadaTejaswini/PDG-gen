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
		int z=0;
		ArrayList<ArrayList<Integer>> tree=new ArrayList<ArrayList<Integer>>();
		Deque<Integer> s1=new ArrayDeque<Integer>();
		Deque<Integer> s2=new ArrayDeque<Integer>();
		while(z<N){
			ArrayList<Integer> a=new ArrayList<Integer>();
			tree.add(a);
			z++;
		}z=0;
		while(z<N-1){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt()-1;
			ArrayList<Integer> c=new ArrayList<Integer>();
			c=tree.get(a);
			c.add(b);
			tree.set(a,c);
			c=tree.get(b);
			c.add(a);
			tree.set(b,c);
			z++;
		}z=0;
		while(z<Q){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt();
			ans[a]+=b;
			z++;
		}z=0;
		while(z<tree.get(0).size()){
			int a=tree.get(0).get(z);
			ans[a]+=ans[0];
			if(tree.get(a).size()>1){
				s1.add(0);
				s2.add(a);
			}
			z++;
		}z=0;
		while(true){
			int a=s1.poll();
			int b=s2.poll();
			while(z<tree.get(b).size()){
				int x=tree.get(b).get(z);
				if(x!=a){
					ans[x]+=ans[b];
					if(tree.get(x).size()>1){
						s1.add(b);
						s2.add(x);
					}
				}
				z++;
			}z=0;
			if(s1.size()==0)
				break;
		}z=0;
		while(z<N){
			System.out.println(ans[z]);
			z++;
		}
	}
}