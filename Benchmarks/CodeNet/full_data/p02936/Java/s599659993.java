import java.util.*;

public class Main {
	static int N=26;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int kati=sc.nextInt();
		Tree tree[] =new Tree[N+1];
		int data[] =new int[(N-1)*2];
		int kati1[]=new int[N+1];
		int parent[]=new int[N+1];
		for(int i=0;i<(N-1)*2;i++) {
			data[i]=sc.nextInt();
		}
		for(int i=0;i<kati;i++) {
			int j=sc.nextInt();
			kati1[j]+=sc.nextInt();
					
		}
		
		
		

		
	
		for(int i=0;i<N-1;i++) {
			int j=data[i*2];
			Tree t =new Tree();
			tree[j]=t;
			if(tree[j].right==0) {
			tree[j].right = data[i*2+1];
			parent[data[i*2+1]]=j;
			}else {
		    tree[j].left = data[i*2+1];
		    parent[data[i*2+1]]=j;
			}
			
			
		}
		for(int i=1;i<tree.length;i++) {
			kati1[i] += kati1[parent[i]];	
			System.out.println(kati1[i]);
		}
		
		
		
		
		

	}
	public static class Tree{
		int left=0;
		int right=0;
		int parent=0;
		
	}

}

