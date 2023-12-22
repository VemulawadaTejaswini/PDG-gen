import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long N = sc.nextLong();
    Long [] X = new Long[6];
    X[0] = N;
    X[1] = 0L;
    X[2] = 0L;
    X[3] = 0L;
    X[4] = 0L;
    X[5] = 0L;
    Long [] between = new Long[5];
    for(int i =0;i<5;i++){
        between[i] = sc.nextLong();
    }
    int ans = 0;
    while(X[5] !=N){
      if(between[4]<=X[4]){
        X[4] -= between[4]; 
        X[5] += between[4];
      }else{
        X[5] += X[4];
        X[4] =0L;
      }
      if(between[3]<=X[3]){
        X[3] -= between[3]; 
        X[4] += between[3];
      }else{
        X[4] += X[3];
        X[3] =0L;
      }
      if(between[2]<=X[2]){
        X[2] -= between[2]; 
        X[3] += between[2];
      }else{
        X[3] += X[2];
        X[2] =0L;
      }
      if(between[1]<=X[1]){
        X[1] -= between[1]; 
        X[2] += between[1];
      }else{
        X[2] += X[1];
        X[1] =0L;
      }
      if(between[0]<=X[0]){
        X[0] -= between[0]; 
        X[1] += between[0];
      }else{
        X[1] += X[0];
        X[0] =0L;
      }


      ans++;
    }
    System.out.println(ans);    
  
  }
}


