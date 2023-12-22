//繰り返し二乗法 repow(b,p)(b,p,modder)
//ユークリッド互除法で最大公約数 gcd
//gcdで最小公倍数 lcm
//約数列挙divList(int)
//約数列挙divSet(int)
//素数判定iP(long)とtameshiwari(long)
//BSA()()()(List<T>,T,int,int,Comparator<T>)
//BSF()()()(List<T>,T,int,int,Comparator<T>)
//BSL()()()(List<T>,T,int,int,Comparator<T>)
//BSA()()()(T[],T,int,int,Comparator<T>)
//BSF()()()(T[],T,int,int,Comparator<T>)
//BSL()()()(T[],T,int,int,Comparator<T>)
//BSA()()()(int[],int,int,int,syojun)
//BSF()()()(int[],int,int,int,syojun)
//BSL()()()(int[],int,int,int,syojun)
//int kmp(String t,String p)
//文字列文字ソートStSort(String)
//二次元整数座標オブジェクトXy
////マンハッタン距離manht(Xy)
////toString
////偏角ソート用hencom
////偏角henkaku
////equals
//ユニオンファインドUnFd
////boolean isRoot(i)
////int rootOf(i)
////boolean ud(i,j)
////boolean marge(i,j)
////int[] roots()
//スキャナーScnr
////next nextBuilder nextInt nextLong nextDouble()
////nextAInt nextALong nextADouble(n)(a[],n)(a[],off,len)
////nextLInt nextLLong nextLDouble(n)
//static PrintWriter out = new PrintWriter(System.out);
import java.util.*;
import java.io.*;

class Main{
  static int repow(int b,int p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return (int)res;
  }
  static int repow(int b,int p,int modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return (int)res;
  }
  static long repow(long b,long p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return res;
  }
  static long repow(long b,long p,long modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return res;
  }
  static long gcd(long c,long d){
    while(true){
      long f=c%d;
      if(f==0){
        return d;
      }
      c=d;
      d=f;
    }
  }
  static long lcm(long c,long d){
    return c/gcd(c,d)*d;
  }
  static ArrayList<Integer> divList(int n){
    ArrayList<Integer> div=new ArrayList<Integer>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        if(i*i!=n){
          div.add((int)(n/i));
        }
      }
    }
    return div;
  }
  static HashSet<Integer> divSet(int n){
    HashSet<Integer> div=new HashSet<Integer>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        div.add((int)(n/i));
      }
    }
    return div;
  }
  static boolean iP(long n){
    if(n==2){
      return true;
    }
    if((n&1)==0||n==1){
      return false;
    }
//    if(n>3037007383L){
    if(n>Integer.MAX_VALUE){
      return tameshiwari(n);
    }
    long d=n-1;
    int s=0;
    while((d&1)==0){
      d/=2;
      s++;
    }
    int[] aa = {2,3,5,7,11,13,17};
    for(int i=0;i<7&&aa[i]<n;i++){
      int a = aa[i];
      long t = d;
      long y=repow(a,t,n);
      while(t!=n-1&&y!=1&&y!=n-1){
        y = (y*y)%n;
        t=t<<1;
      }
      if(y!=n-1&&(t&1)==0){
        return false;
      }
    }
    return true;
  }
  static boolean tameshiwari(long n){
    for(long i=2;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  static <T extends Comparable<T>> int BSA(List<T> l,T target){
    return BSA(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(List<T> l,T target,Comparator<T> c){
    return BSA(l,target,0,l.size(),c);
  }
  static <T extends Comparable<T>> int BSA(List<T> l,T target,int left,int right){
    return BSA(l,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(List<T> l,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=l.get(lt+(rt-lt)/2);
      if(c.compare(gaze,target)<0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>0){
        rt=lt+(rt-lt)/2-1;
      }else{
        return lt+(rt-lt)/2;
      }
    }
    return -1;
  }
  static <T extends Comparable<T>> int BSF(List<T> l,T target){
    return BSF(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(List<T> l,T target,Comparator<T> c){
    return BSF(l,target,0,l.size(),c);
  }
  static <T extends Comparable<T>> int BSF(List<T> l,T target,int left,int right){
    return BSF(l,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(List<T> l,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=l.get(lt+(rt-lt)/2);
      if(c.compare(gaze,target)<0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>=0){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static <T extends Comparable<T>> int BSL(List<T> l,T target){
    return BSL(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(List<T> l,T target,Comparator<T> c){
    return BSL(l,target,0,l.size(),c);
  }
  static <T extends Comparable<T>> int BSL(List<T> l,T target,int left,int right){
    return BSL(l,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(List<T> l,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=l.get(lt+(rt-lt)/2);
      if(c.compare(gaze,target)<=0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>0){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static <T extends Comparable<T>> int BSA(T[] a,T target){
    return BSA(a,target,0,a.length,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(T[] a,T target,Comparator<T> c){
    return BSA(a,target,0,a.length,c);
  }
  static <T extends Comparable<T>> int BSA(T[] a,T target,int left,int right){
    return BSA(a,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(T[] a,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=a[lt+(rt-lt)/2];
      if(c.compare(gaze,target)<0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>0){
        rt=lt+(rt-lt)/2-1;
      }else{
        return lt+(rt-lt)/2;
      }
    }
    return -1;
  }
  static <T extends Comparable<T>> int BSF(T[] a,T target){
    return BSF(a,target,0,a.length,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(T[] a,T target,Comparator<T> c){
    return BSF(a,target,0,a.length,c);
  }
  static <T extends Comparable<T>> int BSF(T[] a,T target,int left,int right){
    return BSF(a,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(T[] a,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=a[lt+(rt-lt)/2];
      if(c.compare(gaze,target)<0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>=0){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static <T extends Comparable<T>> int BSL(T[] a,T target){
    return BSL(a,target,0,a.length,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(T[] a,T target,Comparator<T> c){
    return BSL(a,target,0,a.length,c);
  }
  static <T extends Comparable<T>> int BSL(T[] a,T target,int left,int right){
    return BSL(a,target,left,right,(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(T[] a,T target,int left,int right,Comparator<T> c){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      T gaze=a[lt+(rt-lt)/2];
      if(c.compare(gaze,target)<=0){
        lt=lt+(rt-lt)/2+1;
      }else if(c.compare(gaze,target)>0){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static int BSA(int[] a,int target){
    return BSA(a,target,0,a.length,true);
  }
  static int BSA(int[] a,int target, boolean syojun){
    return BSA(a,target,0,a.length,syojun);
  }
  static int BSA(int[] a,int target,int left,int right){
    return BSA(a,target,left,right,true);
  }
  static int BSA(int[] a,int target,int left,int right,boolean syojun){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      int gaze=a[lt+(rt-lt)/2];
      if((syojun&&gaze<target)||(!syojun&&gaze>target)){
        lt=lt+(rt-lt)/2+1;
      }else if((syojun&&gaze>target)||(!syojun&&gaze<target)){
        rt=lt+(rt-lt)/2-1;
      }else{
        return lt+(rt-lt)/2;
      }
    }
    return -1;
  }
  static int BSF(int[] a,int target){
    return BSF(a,target,0,a.length,true);
  }
  static int BSF(int[] a,int target,boolean syojun){
    return BSF(a,target,0,a.length,syojun);
  }
  static int BSF(int[] a,int target,int left,int right){
    return BSF(a,target,left,right,true);
  }
  static int BSF(int[] a,int target,int left,int right,boolean syojun){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      int gaze=a[lt+(rt-lt)/2];
      if((syojun&&gaze<target)||(!syojun&&gaze>target)){
        lt=lt+(rt-lt)/2+1;
      }else if((syojun&&gaze<=target)||(!syojun&&gaze>=target)){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static int BSL(int[] a,int target){
    return BSL(a,target,0,a.length,true);
  }
  static int BSL(int[] a,int target,boolean syojun){
    return BSL(a,target,0,a.length,syojun);
  }
  static int BSL(int[] a,int target,int left,int right){
    return BSL(a,target,left,right,true);
  }
  static int BSL(int[] a,int target,int left,int right,boolean syojun){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      int gaze=a[lt+(rt-lt)/2];
      if((syojun&&gaze<=target)||(!syojun&&gaze>=target)){
        lt=lt+(rt-lt)/2+1;
      }else if((syojun&&gaze>target)||(!syojun&&gaze<target)){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static int BSA(long[] a,long target){
    return BSA(a,target,0,a.length,true);
  }
  static int BSA(long[] a,long target, boolean syojun){
    return BSA(a,target,0,a.length,syojun);
  }
  static int BSA(long[] a,long target,int left,int right){
    return BSA(a,target,left,right,true);
  }
  static int BSA(long[] a,long target,int left,int right,boolean syojun){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      long gaze=a[lt+(rt-lt)/2];
      if((syojun&&gaze<target)||(!syojun&&gaze>target)){
        lt=lt+(rt-lt)/2+1;
      }else if((syojun&&gaze>target)||(!syojun&&gaze<target)){
        rt=lt+(rt-lt)/2-1;
      }else{
        return lt+(rt-lt)/2;
      }
    }
    return -1;
  }
  static int BSF(long[] a,long target){
    return BSF(a,target,0,a.length,true);
  }
  static int BSF(long[] a,long target,boolean syojun){
    return BSF(a,target,0,a.length,syojun);
  }
  static int BSF(long[] a,long target,int left,int right){
    return BSF(a,target,left,right,true);
  }
  static int BSF(long[] a,long target,int left,int right,boolean syojun){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      long gaze=a[lt+(rt-lt)/2];
      if((syojun&&gaze<target)||(!syojun&&gaze>target)){
        lt=lt+(rt-lt)/2+1;
      }else if((syojun&&gaze<=target)||(!syojun&&gaze>=target)){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static int BSL(long[] a,long target){
    return BSL(a,target,0,a.length,true);
  }
  static int BSL(long[] a,long target,boolean syojun){
    return BSL(a,target,0,a.length,syojun);
  }
  static int BSL(long[] a,long target,int left,int right){
    return BSL(a,target,left,right,true);
  }
  static int BSL(long[] a,long target,int left,int right,boolean syojun){
    int lt = left;
    int rt = right-1;
    while(lt<=rt){
      long gaze=a[lt+(rt-lt)/2];
      if((syojun&&gaze<=target)||(!syojun&&gaze>=target)){
        lt=lt+(rt-lt)/2+1;
      }else if((syojun&&gaze>target)||(!syojun&&gaze<target)){
        rt=lt+(rt-lt)/2-1;
      }
    }
    return lt;
  }
  static int kmp(String t,String p){
    int[] f=new int[p.length()+1];
    int i=0;
    int j=1;
    f[1]=0;
    while(j<p.length()){
      if(i==0||p.charAt(i-1)==p.charAt(j-1)){
        i++;
        j++;
        f[j]=i;
      }else{
        i=f[i];
      }
    }
    i=1;
    j=1;
    while(i<=p.length()&&j<=t.length()){
      if(i==0||p.charAt(i-1)==t.charAt(j-1)){
        i++;
        j++;
      }else{
        i=f[i];
      }
    }
    return i==(p.length()+1)?j-i:-1;
  }
  static String StSort(String s){
    StringBuilder sb = new StringBuilder(s);
    int lg = sb.length();
    int l;
    int r;
    int gaze;
    for(int i=1;i<lg;i++){
      l=0;
      r=i-1;
      while(l<=r){
        gaze=(l+r)/2;
        if(sb.charAt(gaze)<=sb.charAt(i)){
          l=gaze+1;
        }else if(sb.charAt(gaze)>sb.charAt(i)){
          r=gaze-1;
        }
      }
      sb.insert(l,sb.charAt(i));
      sb.deleteCharAt(i+1);
    }
    return sb.toString();
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
    public int manht(Xy o){
      return Math.abs(x-o.x)+Math.abs(y-o.y);
    }
    public String toString(){
      return "["+x+","+y+"]";
    }
    public double henkaku(){
      return Math.atan2(y,x);
    }
    public static int hencom(Xy s1,Xy s2){
      return (int)Math.signum(s1.henkaku()-s2.henkaku());
    }
    public boolean equals(Object o){
      return x==((Xy)o).x&&y==((Xy)o).y;
    }
  }
  static class UnFd{
    int n;
    int[] a;
    int forest;
    UnFd(int n){
      forest=this.n=n;
      a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = i;
      }
    }
    boolean isRoot(int i){
      return a[i]==i;
    }
    int rootOf(int i){
      if(isRoot(i)){
        return i;
      }
      return a[i] = rootOf(a[i]);
    }
    boolean ud(int i,int j){
      return rootOf(i)==rootOf(j);
    }
    boolean marge(int i,int j){
      if(ud(i,j)){
        return false;
      }
      i=rootOf(i);
      j=rootOf(j);
      a[Integer.max(i,j)]=Integer.min(i,j);
      forest-=1;
      return true;
    }
    int[] roots(){
      int[] rs = new int[forest];
      int p=0;
      for(int i=0;i<n;i++){
        if(isRoot(i)){
          rs[p]=i;
          p++;
        }
      }
      return rs;
    }
  }
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int b=sc.nextInt();
    out.println((n<=b)?n:n-1);
    out.flush();
  }
}