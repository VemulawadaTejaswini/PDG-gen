

import java.util.*;

public class Main{
		public static void main(String[] args){
			
			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();
			
			LinkedList <Integer>[] tree=new LinkedList [n+1];
			for(int i=0;i<n+1;i++){
				tree[i]=new LinkedList();
			}
			
			LinkedHashMap<String, Integer> answer=new LinkedHashMap<String, Integer>();
			
			//LinkedList <Integer> A=new LinkedList();
			//LinkedList <Integer> B=new LinkedList();
			
			for(int i=0;i<n-1;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				tree[a].add(b);
				tree[b].add(a);
				
				answer.put(a+"-"+b, i);
				//A.add(a);
				//B.add(b);
				
			}
			/*for(int i=0;i<n+1;i++){
				for (int a : tree[i]) {
		            System.out.println(i+" "+a);//test
		        }
			}*/
			
			int deg=0;
			
			HashMap<Integer, ArrayList<Integer>> visited=new HashMap<Integer, ArrayList<Integer>>();
			
			LinkedList<Integer> que=new LinkedList<Integer>();
			que.add(1);
			
			//int[] anscolor=new int[n+1];
			//int[] parcolor=new int[n+1];
			
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
					//color[v][u]=curcolor;
					//parcolor[v]=curcolor;
					//parcolor[u]=curcolor;
					
				}
			}
			
			System.out.println(deg);
			for(int i=1;i<n;i++){
				Object key = answer.keySet().iterator().next();
				System.out.println(answer.get(key));
				answer.remove(key);
			}
		
		}

  }




