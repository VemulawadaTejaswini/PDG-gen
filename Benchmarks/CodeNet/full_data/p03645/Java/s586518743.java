import java.util.*;

public class Main { 
    
    public static class UnionFind{
            
               int parent[];
               int rank[];
            
               public UnionFind(int n){
                   parent = new int[n];
                   rank   = new int[n];
                   for(int i = 0 ;i < n;i++){
                         parent[i] = i;
                           rank[i] = 1;
                   }                   
               }
            
               int find(int x){
                   if(parent[x] == x)
                        return x;
                   return parent[x] = find(parent[x]);
               }
                              
               boolean same(int x,int y){
                   return find(x) == find(y);
               }
               
               void union(int x,int y){
                    x = find(x);
                    y = find(y);
                    
                    if(x != y){
                            if(rank[x] > rank[y]){
                                parent[y] = x;
                            }else{
                                parent[x] = y; 
                                if(rank[x] == rank[y]){
                                      rank[y]++;
                                }
                            }                               
                    }
                   
                    return;
               }   
    }
    
    public static void main(String[] args) {		        
        Scanner sc = new Scanner(System.in);                               
                               
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        UnionFind uft = new UnionFind(N);        
        
        int connect[][] = new int[N][N];
        
        for(int i = 0;i < M;i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            uft.union(a,b);
            connect[a][b] = 1;
        }        
        
      for(int i = 1;i <= N-2;i++){  
        if(uft.same(0,N-1) && connect[0][i] + connect[i][N-1] == 2){
            System.out.println("POSSIBLE");
            return;
        }            
      }
        
      System.out.println("IMPOSSIBLE");
      
    }                 
}