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
    while((count < K || b < N) && a < N){
      while((count < K || check) && b < N){
        now++;
        if(T.charAt(b) == '0'){
          if(b == N-1){
            count++;
          }else if(T.charAt(b+1) == '1'){
            count++;
          }
        }
        if(count == K && T.charAt(b) == '1'){
          if(b == N-1){
            check = false;
          }else if(T.charAt(b+1) == '0'){
            check = false;
          }
        }
        b++;
        max = now > max ? now : max;
      }
      
      now--;
      if(T.charAt(a) == '0'){
        if(a == N-1){
          count--;
          check = true;
        }else if(T.charAt(a+1) == '1'){
          count--;
          check = true;
        }
      }
      a++;
    }
          
    System.out.println(max);
  }
}