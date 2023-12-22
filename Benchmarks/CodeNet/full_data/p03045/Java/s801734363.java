import java.util.*;
class Main{
  public static main(String[] args){
    int n=sc.nextInt();
    UnionFind uf=new UnionFind(n);
    int m=sc.nextInt();
    for(int i=0;i<m;i++){
      uf.makeSame(sc.nextInt()-1,sc.nextInt()-1);
      sc.nextInt();
    }
    System.out.println(uf.length);
  }
}
class UnionFind{
  int length;
  int[] parent;
  int[] deep;
  UnionFind(int length){
    this.length=length;
    parent=new int[length];
    for(int i=0;i<length;i++){
      parent[i]=i;
    }
    deep=new int[length];
  }
  int getRoot(int x){
    if(parent[x]==x){
      return x;
    }else{
      return parent[x]=getRoot(x);
    }
  }
  void makeSame(int x,int y){
    rootX=getRoot(x);
    rootY=getRoot(y)
      if(rootX==rootY){
        return;
      }else if(deep[rootX]>deep[rootY]){
        parent[rootY]=parent[rootX];
      }else{
        parent[rootX]=parent[rootY];
        if(deep[rootX]==deep[rootY])deep[rootY]++;
      }
    length--;
  }
  boolean isSame(int x,int y){
    return getRoot(x)==getRoot(y);
  }
}