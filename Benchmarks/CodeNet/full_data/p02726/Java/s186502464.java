import java.util.*;
public class Main {
        static int minEdgeBFS(Vector <Integer> edges[], int u, 
                                  int v, int n) 
    { 
        // visited[n] for keeping track of visited 
        // node in BFS 
        Vector<Boolean> visited = new Vector<Boolean>(n); 
          
        for (int i = 0; i < n; i++) { 
            visited.addElement(false); 
        } 
       
        // Initialize distances as 0 
        Vector<Integer> distance = new Vector<Integer>(n); 
          
        for (int i = 0; i < n; i++) { 
            distance.addElement(0); 
        } 
       
        // queue to do BFS. 
        Queue<Integer> Q = new LinkedList<>(); 
        distance.setElementAt(0, u); 
       
        Q.add(u); 
        visited.setElementAt(true, u); 
        while (!Q.isEmpty()) 
        { 
            int x = Q.peek(); 
            Q.poll(); 
       
            for (int i=0; i<edges[x].size(); i++) 
            { 
                if (visited.elementAt(edges[x].get(i))) 
                    continue; 
       
                // update distance for i 
                distance.setElementAt(distance.get(x) + 1,edges[x].get(i)); 
                Q.add(edges[x].get(i)); 
                visited.setElementAt(true,edges[x].get(i)); 
            } 
        } 
        return distance.get(v); 
    } 
      
    // method for addition of edge 
    static void addEdge(Vector <Integer> edges[], int u, int v) 
    { 
       edges[u].add(v); 
       edges[v].add(u); 
    } 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt(); 
        int arr[] = new int[n];

        Vector <Integer> edges[] = new Vector[n]; 
          
        for (int i = 0; i < edges.length; i++) { 
            edges[i] = new Vector<>(); 
        } 

        for(int i = 0 ; i < n-1 ; i++)
        addEdge(edges, i, i+1); 

        addEdge(edges, x-1, y-1); 

        for(int i = 0 ; i < n ; i++)
        for(int j = i+1 ; j < n ; j++){
            int a = minEdgeBFS(edges, i, j, n);
            arr[a]++;
        }
        for(int i = 1 ; i < n ; i++)
        System.out.println(arr[i]);
        

    }
  
}
