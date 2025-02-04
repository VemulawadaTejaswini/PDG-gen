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
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    Scnr(){
      this(System.in);
    }
    Scnr(InputStream in){
      ins = in;
    }
    private boolean hasNextByte(){
      if(ptr<buflen){
        return true;
      }else{
        ptr = 0;
        try{
          buflen = ins.read(buffer);
        }catch(IOException e){
          e.printStackTrace();
        }
        if(buflen<=0){
          return false;
        }
      }
      return true;
    }
    private int readByte(){
      if(hasNextByte()){
        return buffer[ptr++];
      }else{
        return -1;
      }
    }
    private static boolean isPrintableChar(int c){
      return 33<=c&&c<=126;
    }
    public boolean hasNext(){
      while(hasNextByte()&&!isPrintableChar(buffer[ptr])){
        ptr++;
      }
      return hasNextByte();
    }
    public String next(){
      return nextBuilder().toString();
    }
    public StringBuilder nextBuilder(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb;
    }
    public double nextDouble(){
      return Double.parseDouble(next());
    }
    public long nextLong(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if(b=='-'){
        minus=true;
        b=readByte();
      }
      if(b<'0'||'9'<b){
        throw new NumberFormatException();
      }
      while(true){
        if('0'<=b&&b<='9'){
          n*=10;
          n+=b-'0';
        }else if(b==-1||!isPrintableChar(b)){
          return minus?-n:n;
        }else{
          throw new NumberFormatException();
        }
        b=readByte();
      }
    }
    public int nextInt(){
      long nl=nextLong();
      if(nl<Integer.MIN_VALUE||Integer.MAX_VALUE<nl){
        throw new NumberFormatException();
      }
      return (int) nl;
    }
    public int[] nextAInt(int n){
      int[] a = new int[n];
      nextAInt(a,n);
      return a;
    }
    public void nextAInt(int[] a,int n){
      nextAInt(a,0,n);
    }
    public void nextAInt(int[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextInt();
      }
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      nextALong(a,n);
      return a;
    }
    public void nextALong(long[] a,int n){
      nextALong(a,0,n);
    }
    public void nextALong(long[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextLong();
      }
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      nextADouble(a,n);
      return a;
    }
    public void nextADouble(double[] a,int n){
      nextADouble(a,0,n);
    }
    public void nextADouble(double[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextDouble();
      }
    }
    public List<Integer> nextLInt(int n){
      List<Integer> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextInt());
      }
      return l;
    }
    public List<Long> nextLLong(int n){
      List<Long> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextLong());
      }
      return l;
    }
    public List<Double> nextLDouble(int n){
      List<Double> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextDouble());
      }
      return l;
    }
  }
  
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] l=new int[m];
    int[] r=new int[m];
    int[] c=new int[m];
    Node[] ns=new Node[n];
    for(int i=0;i<n;i++){
      ns[i]=new Node(m);
    }
    for(int i=0;i<m;i++){
      l[i]=sc.nextInt()-1;
      r[i]=sc.nextInt()-1;
      c[i]=sc.nextInt();
      for(int j=l[i]+1;j<=r[i];j++){
        ns[j].fid.add(l[i]);
        ns[j].fco.add(c[i]);
      }
    }
    long[] dp=new long[n];
    long ans=calc(n-1,ns,dp);
    out.println(ans);
    out.flush();
  }
  static long calc(int h,Node[] ns,long[] dp){
    if(h==0){
      return 0;
    }
    if(dp[h]!=0){
      return dp[h];
    }
    if(ns[h].fid.size()==0){
      return -1;
    }
    long min=Long.MAX_VALUE;
    for(int i=0;i<ns[h].fid.size();i++){
      long are=calc(ns[h].fid.get(i),ns,dp);
      if(are==-1){
        return -1;
      }
      min=Math.min(are+ns[h].fco.get(i),min);
    }
    dp[h]=min;
    return dp[h];
  }
  static class Node{
    List<Integer> fid;
    List<Integer> fco;
    Node(int m){
      fid=new ArrayList<Integer>(m);
      fco=new ArrayList<Integer>(m);
    }
  }
}