import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =  sc.nextInt();
    int K =  sc.nextInt();
    long ans = 0;
    int cnt;
    for(int a= 1;a<=N;a++){
      int ak = a%K;
      int bk = (K-ak)%K;
      int ck = (K-ak)%K;
      if((bk+ck)%K ==0){
       int bc = (K-ak)%K;
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