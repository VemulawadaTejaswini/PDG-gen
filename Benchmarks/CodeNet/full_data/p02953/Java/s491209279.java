import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long H[] = new long[N];
    for(int i=0;i<N;i++){
      H[i]=sc.nextLong();
    }
    int reCnt=0;
    for(int i=0;i<N-1;i++){
      if(H[i]-H[i+1]>1){
        System.out.println("No");
        return;
        
      }else if(H[i]-H[i+1]==1){
        reCnt++;
        if(reCnt==2){
          System.out.println("No");
          return
      }else if(H[i]-H[i+1]==-1){
        reCnt=Math.max(reCnt-1,0);
      }else{
        continue;
      }
    }
    if(reCnt>1){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
      
  }
  

  
}
