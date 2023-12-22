import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    int p[] =new int[N];
    int t =0;
    int u =0;
    for(int i=0;i<N;i++){
      p[i]=sc.nextInt();
      if(i<K-1){t =t+p[i];}
      else if(i==K-1){t=t+p[i]; u=Math.max(u,t);}
      else{t =t+p[i]-p[i-K];u =Math.max(u,t);}}
    double e =(u+K)/2;
    System.out.println(e);
  }
}