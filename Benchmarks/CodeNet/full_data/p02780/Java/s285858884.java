import java.util.*;

class Main{
  public static double E(int s){
    double t=(double)(s);
    return (t+1)/2;
  }
  
  public static double sum(double[] s,int idxs,int idxe,int M){
    double ans=0.0;
    for(int i=idxs;i<idxe;i++){
      ans+=s[i];
    }
    return ans;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    double[] p=new double[N];
    
    for(int i=0;i<N;i++){
      p[i]=E(sc.nextInt());
    }
    
    double Answer=0.0;
    double summary=0.0;
    for(int i=0;i<K;i++){
      summary+=p[i];
    }
    Answer=summary;
    for(int i=0;i<N-K;i++){
      summary+=(p[K+i]-p[i]);
      if(summary>Answer) Answer=summary;
    }
    
    System.out.print(Answer);
  }
}
