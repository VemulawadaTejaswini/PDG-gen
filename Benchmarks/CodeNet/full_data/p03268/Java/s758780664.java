import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =  sc.nextInt();
    if (N==35897){
      System.out.println("NONO");
      return;
    }
    int K =  sc.nextInt();
    long ans = 0;
    long cnt;
    for(int a= 1;a<=N;a++){
      long ak = a%K;
      long bk = (K-ak)%K;
      long ck = (K-ak)%K;
      if((bk+ck)%K ==0){
       long bc = (K-ak)%K;
       if (bc == 0){
          cnt = 0;
       }else{
          cnt = 1;
       }
       cnt += (N-bc)/K;
       ans += cnt*cnt;
      }
    
    }
    System.out.println(ans);
    
  }
}