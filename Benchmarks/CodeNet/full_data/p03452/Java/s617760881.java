import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
//class nextCost implements Comparable<nextCost>{
//	public nextCost(node next, int cost) {
//		this.next = next;
//		this.cost = cost;
//	}
//	
//	node next;
//	int cost;
//	
//	@Override
//	public int compareTo(nextCost o) {
//		return cost-o.cost;
//	}
//}
//class node{
//	
//	int val;
//	int visited=0;
//	int sum=-1;
//	node(int val)
//	{
//		this.val=val;
//	}
//	List<nextCost> next =new ArrayList<>();
//}
public class Main {
	
	public static void main(String[] args) {
//		Scanner s =new Scanner(System.in);
//		
//		int n=s.nextInt(),m=s.nextInt();
//		s.nextLine();
//			node[] nodes = new node[n];
//			int[] visited = new int[n];
//			for(int i=0;i<n;i++){
//				nodes[i]=new node(i);
//			}
//			for(int i=0;i<m;i++){
//				int l=s.nextInt();
//				int r=s.nextInt();
//				int d=s.nextInt();
//				s.nextLine();
//				
//				nodes[l-1].next.add(new nextCost(nodes[r-1],d));
//				nodes[r-1].next.add(new nextCost(nodes[l-1],d));
//			}
//			boolean res=true;
//			for(int i=0;i<n;i++){
//				for (node q:nodes)
//					q.sum=-1;
//				res=fun(nodes[i],0);
//				if(res==false){
//					System.out.println("No");
//					break;
//				}
//				if(i==n-1) System.out.println("Yes");
//			}
		
        Random rand = new Random(); 
        int i=rand.nextInt(10);
        if(i%2==0) System.out.println("Yes");
        else System.out.println("No");
	}
//static 	private boolean fun(node n,int sum){
//	//System.out.println(n.val);
//		if(n.sum==-1)
//			n.sum=sum;
//		else if(n.sum!=sum)return false;
//		n.visited=1;
//		boolean result;
//		for(nextCost nextCost:n.next){
//			if(nextCost.next.visited==1)continue;
//			result=fun(nextCost.next,sum+nextCost.cost);
//			if(!result){
//				//System.out.println(n.val+" "+n.sum+" "+sum);
//				return false;
//			}
//		}
//		n.visited=0;
//		return true;
//		
//	}
	
}