//繰り返し二乗法 repow(b,p)(b,p,modder)
//ユークリッド互除法で最大公約数 gcd
//gcdで最小公倍数 lcm
//約数列挙divList(int)
//BSA()()()(List<T>,T,int,int,Comparator<T>)
//BSF()()()(List<T>,T,int,int,Comparator<T>)
//BSL()()()(List<T>,T,int,int,Comparator<T>)
//文字列文字ソートStSort(String)
//二次元整数座標オブジェクトXy
////マンハッタン距離manht(Xy)
////toString
////偏角ソート用hencom
////偏角henkaku
////equals
//スキャナーScnr
////next nextBuilder nextInt nextLong nextDouble()
////nextAint nextAlong nextAdouble(n)(a[],n)
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
  static <T extends Number> long gcd(T cc,T dd){
    long c=cc.longValue();
    long d=dd.longValue();
    while(true){
      long f=c%d;
      if(f==0){
        return d;
      }
      c=d;
      d=f;   
    }
  }
  static <T extends Number> long lcm(T cc,T dd){
    long c=cc.longValue();
    long d=dd.longValue();
    return c/gcd(c,d)*d;
  }
  static ArrayList<Integer> divList(int n){
    ArrayList<Integer> div=new ArrayList<Integer>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        div.add(i);
        div.add((int)(n/i));
      }
    }
    return div;
  }
  static <T extends Comparable> int BSA(List<T> l,T target){
    return BSA(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSA(List<T> l,T target,Comparator<T> c){
    return BSA(l,target,0,l.size(),c);
  }
  static <T extends Comparable> int BSA(List<T> l,T target,int left,int right){
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
  static <T extends Comparable> int BSF(List<T> l,T target){
    return BSF(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSF(List<T> l,T target,Comparator<T> c){
    return BSF(l,target,0,l.size(),c);
  }
  static <T extends Comparable> int BSF(List<T> l,T target,int left,int right){
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
  static <T extends Comparable> int BSL(List<T> l,T target){
    return BSL(l,target,0,l.size(),(s1,s2)->s1.compareTo(s2));
  }
  static <T> int BSL(List<T> l,T target,Comparator<T> c){
    return BSL(l,target,0,l.size(),c);
  }
  static <T extends Comparable> int BSL(List<T> l,T target,int left,int right){
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
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
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
      for(int i=0;i<n;i++){
        a[i] = nextInt();
      }
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      nextALong(a,n);
      return a;
    }
    public void nextALong(long[] a,int n){
      for(int i=0;i<n;i++){
        a[i] = nextLong();
      }
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      for(int i=0;i<n;i++){
        a[i] = nextDouble();
      }
      return a;
    }
    public void nextADouble(double[] a,int n){
      for(int i=0;i<n;i++){
        a[i] = nextDouble();
      }
    }
  }
  
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String args[]){
    int n=sc.nextInt();
    int sum=0;
    int har=n;
    while(har>0){
      sum+=har%10;
      har/=10;
    }
    out.println(n%sum==0?"Yes":"No");
    out.flush();
  }
}