import java.util.*;
import java.io.*;

public class Main{
  static class SegTree<T>{
    int n;
    int m;
    java.util.function.BinaryOperator<T> op;
    int[] l;
    int[] r;
    T[] a;
    T ident;
    SegTree(int n,java.util.function.BinaryOperator<T> op,T ident){
      this.n=n;
      this.op=op;
      this.ident=ident;
      int ii=n-1;
      m=2;
      while(ii>0){
        ii/=2;
        m*=2;
      }
      m--;
      @SuppressWarnings("unchecked")
      T[] b=(T[])(new Object[m]);
      a=b;
      Arrays.fill(a,ident);
      l=new int[m];
      r=new int[m];
      for(int i=0;i<=m/2;i++){
        l[m/2+i]=i;
        r[m/2+i]=i+1;
      }
      for(int i=m/2-1;i>=0;i--){
        l[i]=l[lch(i)];
        r[i]=r[rch(i)];
      }
    }
    SegTree(int n,java.util.function.BinaryOperator<T> op,T ident,T[] ary){
      this.n=n;
      this.op=op;
      this.ident=ident;
      int ii=n-1;
      m=2;
      while(ii>0){
        ii/=2;
        m*=2;
      }
      m--;
      @SuppressWarnings("unchecked")
      T[] b=(T[])(new Object[m]);
      a=b;
      for(int i=0;i<n;i++){
        a[m/2+i]=ary[i];
      }
      for(int i=m/2+n;i<m;i++){
        a[i]=ident;
      }
      for(int i=m/2-1;i>=0;i--){
        a[i]=op.apply(a[lch(i)],a[rch(i)]);
      }
      l=new int[m];
      r=new int[m];
      for(int i=0;i<=m/2;i++){
        l[m/2+i]=i;
        r[m/2+i]=i+1;
      }
      for(int i=m/2-1;i>=0;i--){
        l[i]=l[lch(i)];
        r[i]=r[rch(i)];
      }
    }
    public T getAll(){
      return a[0];
    }
    public T get(int from,int to){
      if(from<0||n<to||from>=to){
        throw new IllegalArgumentException(String.valueOf(from)+","+String.valueOf(to));
      }
      return get(from,to,0);
    }
    private T get(int from,int to,int node){
      if(from==l[node]&&to==r[node]){
        return a[node];
      }else{
        if(to<=l[node]+(r[node]-l[node])/2){
          return get(from,to,lch(node));
        }else if(l[node]+(r[node]-l[node])/2<=from){
          return get(from,to,rch(node));
        }else{
          return op.apply(get(from,l[node]+(r[node]-l[node])/2,lch(node)),get(l[node]+(r[node]-l[node])/2,to,rch(node)));
        }
      }
    }
    public void set(T ob,int i){
      if(i<0||n<=i){
        throw new IndexOutOfBoundsException(String.valueOf(i)+"isOutFromLength "+String.valueOf(n));
      }
      int j=m/2+i;
      a[j]=ob;
      while(true){
        if(j==0){
          break;
        }
        j=prt(j);
        a[j]=op.apply(a[lch(j)],a[rch(j)]);
      }
    }
    static private int prt(int node){
      return (node-1)/2;
    }
    static private int lch(int node){
      return 2*node+1;
    }
    static private int rch(int node){
      return 2*node+2;
    }
    public String toString(){
      return Arrays.toString(a);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int q=sc.nextInt();
    
    CX[] cxa=new CX[n];
    for(int i=0;i<n;i++){
      cxa[i]=new CX(s.charAt(i));
    }
    
    SegTree<CX> seg=new SegTree<>(n,(s1,s2)->new CX(s1,s2),new CX(),cxa);
    
    for(int i=0;i<q;i++){
      if(sc.nextInt()==1){
        int idx=sc.nextInt()-1;
        seg.set(new CX(sc.next().charAt(0)),idx);
      }else{
        System.out.println(seg.get(sc.nextInt()-1,sc.nextInt()).count());
      }
    }
  }
  static class CX{
    boolean[] a;
    CX(){
      a=new boolean[26];
    }
    CX(char ch){
      a=new boolean[26];
      a[ch-'a']=true;
    }
    CX(CX x,CX y){
      a=new boolean[26];
      for(int i=0;i<26;i++){
        boolean exists=((x.a[i])||(y.a[i]));
        this.a[i]=exists;
      }
    }
    public int count(){
      int res=0;
      for(int i=0;i<26;i++){
        if(a[i]){
          res++;
        }
      }
      return res;
    }
  }
}
