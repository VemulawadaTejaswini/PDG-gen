import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] p = new int[n];
    for(int i=0;i<n;i++)p[i]=sc.nextInt()-1;
    int[] parent = new int[n];
    for(int i=0;i<n;i++)parent[i]=i;
    for(int i=0;i<m;i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      union(parent,x-1,y-1);
    }
    int cnt = 0;
    for(int i=0;i<n;i++)
      if(find(parent,i)==find(parent,p[i]))cnt++;
    System.out.println(cnt);
  }
  static int find(int[] parent,int x){
    if(parent[x]==x)return x;
    else{
      parent[x]=find(parent,parent[x]);
      return parent[x];
    }
  }
  static void union(int[] parent,int x,int y){
    int xRoot = find(parent,x);
    int yRoot = find(parent,y);
    parent[xRoot]=yRoot;
  }
}