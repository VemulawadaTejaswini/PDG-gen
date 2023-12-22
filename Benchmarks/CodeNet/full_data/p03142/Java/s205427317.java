import java.io.*;
import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		int n=s.nextInt(),m=s.nextInt();
		int[] in=new int[n];
		int[] r=new int[n];
		ArrayList<ArrayList<Integer>> g=new ArrayList<>(n);
		for(int i=0;i<n;i++)
			g.add(new ArrayList<>());
		for(int i=0;i<n-1+m;i++){
			int f=s.nextInt()-1;
			int t=s.nextInt()-1;
			in[t]++;
			g.get(f).add(t);
		}
		
		int root=0;
		
		for(int i=0;i<n;i++){
			if(in[i]==0) root=i;
		}
		
		ArrayDeque<Integer> q=new ArrayDeque<>();
		q.add(root);
		while(!q.isEmpty()){
			int p=q.poll();
			for(int h:g.get(p)){
				if(--in[h]==0){
					r[h]=p+1;
					q.add(h);
				}
			}
		}
		
		Arrays.stream(r).forEach(System.out::println);
	}
}