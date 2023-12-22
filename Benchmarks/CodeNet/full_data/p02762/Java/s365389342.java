import java.util.*;

class Main{
  static class UnFd{
    int n;
    int forest;
    int[] parent;
    int[] size;
    UnFd(int n){
      forest=this.n=n;
      parent=new int[n];
      size=new int[n];
      for(int i=0;i<n;i++){
        parent[i]=i;
        size[i]=1;
      }
    }
    boolean isRoot(int i){
      return i==parent[i];
    }
    int rootOf(int i){
      if(isRoot(i)){
        return i;
      }
      return parent[i]=rootOf(parent[i]);
    }
    int sizeOf(int i){
      return size[rootOf(i)];
    }
    boolean same(int i,int j){
      return rootOf(i)==rootOf(j);
    }
    void merge(int i,int j){
      i=rootOf(i);
      j=rootOf(j);
      if(i==j){
        return;
      }
      size[i]=size[j]=size[i]+size[j];
      parent[Integer.max(i,j)]=Integer.min(i,j);
      forest--;
    }
    int[] parents(){
      return parent;
    }
    int[] sizes(){
      return size;
    }
    int forest(){
      return forest;
    }
    int length(){
      return n;
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    UnFd uf=new UnFd(n);
    int[] minus=new int[n];
    for(int i=0;i<m;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      uf.merge(a,b);
      minus[a]++;
      minus[b]++;
    }
    for(int i=0;i<k;i++){
      int c=sc.nextInt()-1;
      int d=sc.nextInt()-1;
      if(uf.same(c,d)){
        minus[c]++;
        minus[d]++;
      }
    }
    for(int i=0;i<n-1;i++){
      System.out.print((uf.sizeOf(i)-minus[i]-1)+" ");
    }
    System.out.println((uf.sizeOf(n-1)-minus[n-1]-1));
  }
}