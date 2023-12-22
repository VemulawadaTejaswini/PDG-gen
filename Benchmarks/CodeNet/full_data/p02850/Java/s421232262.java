
import java.util.*;

public class Main{
		public static void main(String[] args){
			
			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();
			
			LinkedList <Integer>[] tree=new LinkedList [n+1];
			for(int i=0;i<n+1;i++){
				tree[i]=new LinkedList();
			}
			
			LinkedHashMap<Integer, String> order=new LinkedHashMap<Integer, String>();
			HashMap<String, Integer> answer=new LinkedHashMap<String, Integer>();
			
			for(int i=0;i<n-1;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				tree[a].add(b);
				tree[b].add(a);
				
				order.put(i, a+"-"+b);
				answer.put(a+"-"+b,i);
				
			}
	
			int deg=0;
			
			HashMap<Integer, ArrayList<Integer>> visited=new HashMap<Integer, ArrayList<Integer>>();
			
			LinkedList<Integer> que=new LinkedList<Integer>();
			que.add(1);
			
			int index=1;
			
			while(!que.isEmpty()){
				int v=que.pop();
				if(deg<tree[v].size())deg=tree[v].size();//最大次数の更新
				int curcolor=1;
				for(int u:tree[v]){
					if(visited.containsKey(u))continue;
					
					que.add(u);
					
					ArrayList<Integer> a= new ArrayList<Integer>();
					if(visited.containsKey(v)){
						a= visited.get(v);
						while(a.indexOf(curcolor)!=-1){
						curcolor++;
						}	
					}
					a.add(curcolor);
					visited.put(v,a);
					
					ArrayList<Integer> b= new ArrayList<Integer>();
					b.add(curcolor);
					visited.put(u,b);
					
					if(answer.containsKey(v+"-"+u)){
						answer.put(v+"-"+u, curcolor);
					}else{
						answer.put(u+"-"+v, curcolor);
					}
					
				}
			}
			
			System.out.println(deg);
			for(int i=0;i<n-1;i++){
				
				System.out.println(answer.get(order.get(i)));
				
			}
		
		}

  }




