import java.util.*;

class Main{
  static Map<Integer,Integer> pFacMap(int x){
    Map<Integer,Integer> res=new HashMap<>();
    for(int i=2;i*i<=x;i++){
      if(x%i==0){
        int p=0;
        while(x%i==0){
          x/=i;
          p++;
        }
        res.put(i,p);
      }
    }
    if(x!=1){
      res.put(x,1);
    }
    return res;
  }
  static long repow(int b,int p){
    long res=1;
    long a=b;
    while(p>0){
      if((p&1)==1){
        res=(res*a)%1000000007;
      }
      p=p>>1;
      a=(a*a)%1000000007;
    }
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    M[] ma=new M[n];
    for(int i=0;i<n;i++){
      ma[i]=new M();
      ma[i].m=pFacMap(a[i]);
    }
//    System.err.println(Arrays.deepToString(ma));
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<n;i++){
      for(Map.Entry<Integer,Integer> me:ma[i].m.entrySet()){
        if(mp.getOrDefault(me.getKey(),0)<me.getValue()){
          mp.put(me.getKey(),me.getValue());
        }
      }
    }
//    System.err.println(mp);
    long ans=0;
    for(int i=0;i<n;i++){
      long kk=1;
      for(Map.Entry<Integer,Integer> me:mp.entrySet()){
        kk=(kk*repow(me.getKey(),me.getValue()-ma[i].m.getOrDefault(me.getKey(),0)))%1000000007;
      }
      ans=(ans+kk)%1000000007;
    }
    System.out.println(ans);
  }
  static class M{
    Map<Integer,Integer> m;
    public String toString(){
      return m.toString();
    }
  }
}