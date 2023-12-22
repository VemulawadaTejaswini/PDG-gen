import java.util.*;
class Main
{
    public static void topological(Stack<Integer> stack ,LinkedList<Integer> adj[],boolean visited[] , int v)
    {
        visited[v]=true;
        Iterator<Integer> iter =adj[v].iterator();
        while(iter.hasNext())
        {
            int value = iter.next();
            if(visited[value]==false)
            {
                topological(stack,adj,visited,value);
            }
        }
        stack.push(v);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        LinkedList<Integer> adj[] = new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<m;i++)
        {
            int src = sc.nextInt()-1;
            int dest = sc.nextInt()-1;    
            adj[src].add(dest);
        }
        boolean visited[]= new boolean[n];
        Arrays.fill(visited,false);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                topological(stack,adj,visited,i);
            }
        }
        int dist[]=new int[n];
        Arrays.fill(dist,0);
        int max = 0;
       while(!stack.isEmpty())
       {
           int val = stack.pop();
           Iterator<Integer> iter = adj[val].iterator();
           while(iter.hasNext())
           {
               int value = iter.next();
               if(dist[value]<dist[val]+1)
               {
                   dist[value]=dist[val]+1;
                   max = Math.max(dist[value],max);
               }
           }
       }
       System.out.println(max);
    }
}