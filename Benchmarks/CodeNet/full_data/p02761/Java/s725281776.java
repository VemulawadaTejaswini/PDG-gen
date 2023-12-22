import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int s[] = new int[M];
    int c[] = new int[M];
    for(int i=0;i<M;i++){
      s[i]=sc.nextInt();
      c[i]=sc.nextInt();
    }
    int answer = -1;
    if(N==1){
      for(int n=0;n<=9;n++){
        if(isOK(n,s,c,M,N)){
          System.out.println(n);
          return;
        }
      }
    }
    if(N==2){
      for(int n=10;n<=99;n++){
        if(isOK(n,s,c,M,N)){
          System.out.println(n);
          return;
        }
      }
    }
    if(N==3){
      for(int n=100;n<=999;n++){
        if(isOK(n,s,c,M,N)){
          System.out.println(n);
          return;
        }
      }
    }
    System.out.println(answer);
  }
  
  public static boolean isOK(int n,int[] s,int[] c,int M,int keta){
    boolean res = false;
    for(int i=0;i<M;i++){
      if(keta==1){
        if(n==c[i]){
          continue;
        }else{
          return false;
        }
      }else if(keta==2){
        if((s[i]==1&&n/10==c[i])||(s[i]==2&&n%10==c[i])){
          continue;
        }else{
          return false;
        }
      }else{
        if((s[i]==1&&n/100==c[i])||(s[i]==2&&(n/10)%10==c[i])||(s[i]==3&&n%10==c[i])){
          continue;
        }else{
          return false;
        }
      }
    }
    return true;
    
    
  }
  

  
}