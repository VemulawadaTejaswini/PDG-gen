import java.util.*;
//累積はプログラミングの世界での呼ばれ方
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int Q = s.nextInt();
    String S = s.next();
    int[] l1 = new int[Q] , r1 = new int[Q] , SR = new int[N];
    for(int i = 0; i < Q; i++){
      //System.out.println(N + " " + Q + " " + S);
      l1[i] = s.nextInt();
      r1[i] = s.nextInt();
    }

    SR[0] = 0;
    for(int i = 1; i < N; i++){
      if(S.charAt(i - 1) == 'A' && S.charAt(i) == 'C'){
        SR[i] = SR[i - 1] + 1;
      }
      else{
        SR[i] = SR[i - 1];
      }
    }
    /*
    for(int i = 0; i < N; i++) {
      System.out.print(SR[i]);
    }
    */
    //System.out.println("");
    for(int i = 0; i < Q; i++){
      System.out.println(SR[r1[i] - 1] - SR[l1[i] - 1]);
    }
  }
}
