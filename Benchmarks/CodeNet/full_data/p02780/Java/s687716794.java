import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    double p[] = new double[N];
    double E[] = new double[N]; //i番目のサイコロの期待値
    
    for(int i=0;i<N;i++){
      p[i]=sc.nextDouble();
    }
    
    for(int i=0;i<N;i++){
      E[i]=(p[i]+1)/2;
    }
    double Esum[] = new double[N+1];//E[1]は1個目、E[2]は2個目まで,E[i]はi個目までの累積和...
    Esum[0]=0;
    for(int i=0;i<N;i++){
      Esum[i+1]=Esum[i]+E[i];
    }
    
    double tmp=0;
    for(int i=0;i<N-K+1;i++){
      //i個目からi+K-1個目までの和がそこまでのmaxより大きかったら書き換え
      if(tmp<Esum[i+K]-Esum[i]){
        tmp=Esum[i+K]-Esum[i];
      }
    }

    System.out.println(tmp);
    
    
  }
  

  
}