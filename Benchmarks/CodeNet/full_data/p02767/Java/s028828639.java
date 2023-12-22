import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] X=new int[N];
    int ANS=100000000;
    int ans=0;
    
    for(int i=0;i<N;i++){
      X[i]=sc.nextInt();
    }
    
    for(int i=0;i<=100;i++){
      for(int j=0;j<N;j++){
        ans+=(X[j]-i)*(X[j]-i);
      }
      if(ANS>ans) ANS=ans;
      ans=0;
    }
    
    System.out.println(ANS);
  }
}