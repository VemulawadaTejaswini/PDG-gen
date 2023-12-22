import java.util.*;

public class Main {
  public static void main(String[] args) {
    long mod=1000000000+7;
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String S1=sc.next();
    String S2=sc.next();
    long ans=1;
    
    for(int i=0;i<N;i++){
      if(S1.charAt(i)==S2.charAt(i)){
        if(i==0){
          ans*=3;
        }else if(S1.charAt(i-1)==S2.charAt(i-1)){
          ans*=2;
        }
        ans%=mod;
      }
      if(i<N-1 && S1.charAt(i)==S1.charAt(i+1)){
        if(i==0){
          ans*=6;
        }else{
          if(S1.charAt(i-1)!=S2.charAt(i-1)){
            ans*=3;
          }else{
            ans*=2;
          }
        }
        ans%=mod;
      }
    }
    System.out.println(ans);
  }
}

        
        