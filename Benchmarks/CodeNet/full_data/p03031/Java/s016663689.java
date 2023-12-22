import java.util.*;

class Main{
  static int n;
  static int m;
  static boolean[] sw;
  static int[][] a;
  static int[] p;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    a=new int[m][];
    for(int i=0;i<m;i++){
      int k=sc.nextInt();
      a[i]=new int[k];
      for(int j=0;j<k;j++){
        a[i][j]=sc.nextInt()-1;
      }
    }
    p=new int[m];
    for(int i=0;i<m;i++){
      p[i]=sc.nextInt();
    }
    sw=new boolean[n];
    System.out.println(calc(0));
  }
  static int calc(int fixed){
    if(fixed<n){
      int res=0;
      res+=calc(fixed+1);
      sw[fixed]=true;
      res+=calc(fixed+1);
      sw[fixed]=false;
      return res;
    }
    for(int i=0;i<m;i++){
      int cnt=0;
      for(int j=0;j<a[i].length;j++){
        if(sw[a[i][j]]){
          cnt++;
        }
      }
      if((cnt&1)!=p[i]){
        return 0;
      }
    }
    return 1;
  }
}