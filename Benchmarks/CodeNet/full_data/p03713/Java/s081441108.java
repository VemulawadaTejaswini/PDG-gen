
import java.util.*;

public class Main {
	public static void main(String[] args) {
		 
               Scanner sc = new Scanner(System.in);
                                            
               int N = 13;
               
               UnionFind uf = new UnionFind(N);
               
               uf.union(1 ,3);
               uf.union(3 ,5);
               uf.union(5 ,7);
               uf.union(7 ,8);
               uf.union(8 ,10);
               uf.union(10,12);
               
               uf.union(4,6);
               uf.union(6,9);
               uf.union(9,11);

               int x = sc.nextInt();
               int y = sc.nextInt();
               
               if(uf.same(x,y)){
                   System.out.println("Yes");
               }else{
                   System.out.println("No");   
               }
               
        }
        
        private static class UnionFind{
              
             int [] parent;
             int []   rank;
             
             UnionFind(int n){
                 parent = new int[n];
                 rank   = new int[n];
                 for(int i = 0;i < n;i++){
                     parent[i] = i;
                       rank[i] = 0;
                 }                 
             }
                
             int find(int x){
                 if(parent[x] == x){
                      return x;   
                 }else{
                      return parent[x] = find(parent[x]);
                 }                 
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
             
             int count(){
                    int ret = 0;
                                        
                    for(int i = 0;i < parent.length;i++){
                        if(find(i) == i){
                            ret++;
                        }    
                    }
                    
                    return ret;
             }      
             
             
        }                        
}
