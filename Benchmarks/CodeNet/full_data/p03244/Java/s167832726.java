import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] v1=new int[n/2];
    int[] v2=new int[n/2];
    for(int i=0;i<n/2;i++){
      v1[i]=sc.nextInt();
      v2[i]=sc.nextInt();
    }
    Arrays.sort(v1);
    int start=0;
    ArrayList<Pair> p1=new ArrayList<Pair>();
    for(int i=0;i<n/2;i++){
      if(i+1==n/2||v1[i]!=v1[i+1]){
        int v=v1[i];
        int m=i-start+1;
        p1.add(new Pair(v,m));
        start=i+1;
      }
    }
    p1.sort((s1,s2)->s2.m-s1.m);
    p1.add(new Pair(-1,0));
//    System.out.println(p1);
    Arrays.sort(v2);
    start=0;
    ArrayList<Pair> p2=new ArrayList<Pair>();
    for(int i=0;i<n/2;i++){
      if(i+1==n/2||v2[i]!=v2[i+1]){
        int v=v2[i];
        int m=i-start+1;
        p2.add(new Pair(v,m));
        start=i+1;
      }
    }
    p2.sort((s1,s2)->s2.m-s1.m);
    p2.add(new Pair(-2,0));
//    System.out.println(p2);
    if(p1.get(0).v!=p2.get(0).v){
      System.out.println(n-p1.get(0).m-p2.get(0).m);
    }else{
      System.out.println(
        Math.min(
          n-p1.get(0).m-p2.get(1).m,
          n-p1.get(1).m-p2.get(0).m
        )
      );
    }
  }
  static class Pair{
    int v;
    int m;
    Pair(int a,int b){
      v=a;
      m=b;
    }
    public String toString(){
      return "["+String.valueOf(v)+","+String.valueOf(m)+"]";
    }
  }
}