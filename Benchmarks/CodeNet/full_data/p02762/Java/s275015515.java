import java.util.*;

class Main{
  static class UnFd{
    int[] parent;
    int[] size;
    int forest;
    UnFd(int n){
      parent=new int[n];
      size=new int[n];
      forest=n;
      for(int i=0;i<n;i++){
        parent[i]=i;
        size[i]=1;
      }
    }
    private boolean isRoot(int i){
      return parent[i]==i;
    }
    private int rootOf(int i){
      if(isRoot(i)){
        return i;
      }
      return parent[i]=rootOf(parent[i]);
    }
    public boolean same(int i,int j){
      return rootOf(i)==rootOf(j);
    }
    public void merge(int i,int j){
      i=rootOf(i);
      j=rootOf(j);
      if(i==j){
        return;
      }
      size[Integer.min(i,j)]+=size[Integer.max(i,j)];
      parent[Integer.max(i,j)]=Integer.min(i,j);
      forest--;
    }
    public int sizeOf(int i){
      return size[rootOf(i)];
    }
    public int[] parents(){
      return parent;
    }
    public int forest(){
      return forest;
    }
    public String toString(){
      return Arrays.toString(parent);
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    UnFd uf=new UnFd(n);
    int[] sub=new int[n];
    for(int i=0;i<m;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      sub[a]++;
      sub[b]++;
      uf.merge(a,b);
    }
    System.err.println(uf);
    System.err.println(Arrays.toString(sub));
    for(int i=0;i<k;i++){
      int c=sc.nextInt()-1;
      int d=sc.nextInt()-1;
      if(uf.same(c,d)){
        sub[c]++;
        sub[d]++;
      }
    }
    System.err.println(Arrays.toString(sub));
    for(int i=0;i<n-1;i++){
      System.out.print((uf.sizeOf(i)-sub[i]-1)+" ");
    }
    System.out.println((uf.sizeOf(n-1)-sub[n-1]-1));
  }
}