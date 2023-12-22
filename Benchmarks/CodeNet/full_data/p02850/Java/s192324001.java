import java.util.*;

public class Main{
		public static void main(String[] args){
			
			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();
			
			LinkedList <Integer>[] tree=new LinkedList [n+1];
			for(int i=0;i<n+1;i++){
				tree[i]=new LinkedList();
			}
			
			for(int i=0;i<n-1;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				tree[a].add(b);
				tree[b].add(a);
				
			}
			/*for(int i=0;i<n+1;i++){
				for (int a : tree[i]) {
		            System.out.println(i+" "+a);//test
		        }
			}*/
			
			int deg=0;
			
			HashMap<Integer, Integer> visited=new HashMap<Integer, Integer>();
			
			LinkedList<Integer> que=new LinkedList<Integer>();
			que.add(1);
			
			int[] anscolor=new int[n+1];
			int[] parcolor=new int[n+1];
			
			int index=1;
			
			while(!que.isEmpty()){
				int v=que.pop();
				  //System.out.println("v is: "+v+" v size is:  "+tree[v].size());//test
				if(deg<tree[v].size())deg=tree[v].size();//最大次数の更新
				  //System.out.println("deg is: "+deg);
				int curcolor=1;
				for(int u:tree[v]){
					//System.out.println("now u is: "+u);//test
					if(visited.containsKey(u))continue;
					
					que.add(u);
					visited.put(v,u);
					
					if(curcolor==parcolor[v])curcolor++;
					
					anscolor[index]=curcolor;index++;
					parcolor[v]=curcolor;
					parcolor[u]=curcolor;
					
				}
			}
			
			System.out.println(deg);
			for(int i=1;i<n;i++){
				System.out.println(anscolor[i]);
			}
		
		}

  }


