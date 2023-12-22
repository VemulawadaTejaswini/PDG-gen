import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;





public class Main {
	   static int N=200010;
	   
	  
	   static int[] fa1=new int[N];
	   static int[] fa2=new int[N];
	   
       public static void main(String[] args) {
    	   
          Scanner input=new Scanner( System.in);
         
          int n=input.nextInt();
          for(int i=1;i<=n;i++)
          {
        	  fa1[i]=i;
        	  fa2[i]=i;
          }
          int k=input.nextInt();
          int l=input.nextInt();
          
          for(int i=1;i<=k;i++)
          {
        	  int u=input.nextInt(),v=input.nextInt();
        	  merge1(u,v);
          }
          
          for(int i=1;i<=l;i++)
          {
        	  int u=input.nextInt(),v=input.nextInt();
        	  merge2(u,v);
          }
          HashMap<Node, Integer> map=new HashMap<Node, Integer>();
          for(int i=1;i<=n;i++)
          {
        	  Node temp=new Node(find1(i), find2(i));
        	  if(map.containsKey(temp))
        	  {
        		 map.put(temp, map.get(temp)+1); 
        	
        	  }
        	  else
        	  {
        		  map.put(temp, 1); 
        	  }
          }
          for(int i=1;i<=n;i++)
          {
        	  Node temp=new Node(find1(i), find2(i));
        	  System.out.print(map.get(temp)+" ");
          }
      
	}

       
       
	private static void merge1(int u, int v) {
		int fu=find1(u);
		
		int fv=find1(v);
		if(fu!=fv)
		{
			fa1[fv]=fu;
		}
		// TODO 自动生成的方法存根
		
	}

	private static int find1(int x) {
		// TODO 自动生成的方法存根
		if(x==fa1[x])
			return x;
		else 
			return fa1[x]=find1(fa1[x]);
		
	}
	private static void merge2(int u, int v) {
		int fu=find2(u);
		int fv=find2(v);
		if(fu!=fv)
		{
			fa2[fv]=fu;
		}
		// TODO 自动生成的方法存根
		
	}

	private static int find2(int x) {
		// TODO 自动生成的方法存根
		if(x==fa2[x])
			return x;
		else 
			return fa2[x]=find2(fa2[x]);
		
	}

}
class Node
{
	int x,y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}
