import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    String T = sc.nextLine();
    int a = 0, b = 0, count = 0, max = 0, now = 0;
    boolean check = true;
    while(a < N){
      while(count <= K && b < N){
        now++;
        if(b < N-1){
          if(T.charAt(b) == '0' && T.charAt(b+1) == '1'){
            count++;
          }
        }else{
          if(T.charAt(b) == '0'){
            count++;
            now--;
            b--;
          }
        }
        b++;
        max = max < now ? now : max;
      }
      
      now--;
      if(a < N-1){
          if(T.charAt(a) == '0' && T.charAt(a+1) == '1'){
            count--;
          }
        }else{
          if(T.charAt(a) == '0'){
            count--;
          }
        }
      a++;
      if(b == N-1 && count < K){
        break;
      }
    }   
    System.out.println(max);
  }
}