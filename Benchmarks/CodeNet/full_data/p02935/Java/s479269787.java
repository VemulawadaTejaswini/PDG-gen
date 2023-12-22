import java.util.*;
class Main{
  static int f(int n){
    int a=1;
    for(int i=0;i<n;i++){
      a*=2;
    }
    return a;
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    Double[] v=new Double[N];
    for(int i=0;i<N;i++){
      v[i]=scan.nextDouble();
    }
    Arrays.sort(v,Collections.reverseOrder());
    double ans=0;
    for(int i=0;i<N;i++){
      if(i==N-2||i==N-1){
        ans+=(double)v[i]/f(N-1);
      }else{
        ans+=(double)v[i]/f(i+1);
      }
    }
    System.out.println(ans);
  }
}