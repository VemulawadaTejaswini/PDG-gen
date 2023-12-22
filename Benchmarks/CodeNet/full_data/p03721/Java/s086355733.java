import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long k=sc.nextLong();
    Pair[] ps=new Pair[n];
    for(int i=0;i<n;i++){
      ps[i]=new Pair(sc.nextInt(),sc.nextInt());
    }
    Arrays.sort(ps,(s1,s2)->s1.a-s2.a);
    long c=0;
    int ans=0;
    for(int i=0;i<n;i++){
      if(c<k&&k<=c+ps[i].b){
        ans=ps[i].a;
        break;
      }
      c+=ps[i].b;
    }
    System.out.println(ans);
  }
  static class Pair{
    int a;
    int b;
    Pair(int a,int b){
      this.a=a;
      this.b=b;
    }
  }
}