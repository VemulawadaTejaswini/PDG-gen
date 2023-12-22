import java.util.*;
//累積はプログラミングの世界での呼ばれ方
public class Main {
  public static void main(String[] args) {
    boolean[] isprime = new boolean[100010];
    for(int i = 0; i <= 100000 ; i++){
      isprime[i] = true;
    }

    isprime[0] = isprime[1] = false;

    for(int i = 2 ; i * i <= 100000 ; i++){
      int j = 2;
      while(i * j <= 100000){
        isprime[i*j] = false;
        j++;
      }
    }

    Scanner s = new Scanner(System.in);
    int Q = s.nextInt();
    int[] l1 = new int[Q] , r1 = new int[Q] , SR = new int[100010];
    for(int i = 0; i < Q; i++){
      //System.out.println(N + " " + Q + " " + S);
      l1[i] = s.nextInt();
      r1[i] = s.nextInt();
    }

    SR[0] = 0;
    for(int i = 1; i <= 100000; i++){
      if(isprime[i] && isprime[(i + 1) / 2])
        SR[i] = SR[i - 1] + 1;
      else
      SR[i] = SR[i - 1];
    }
    for(int i = 0; i < Q; i++){
      System.out.println(SR[ r1[i]] - SR[ l1[i] - 1]);
    }
  }
}
