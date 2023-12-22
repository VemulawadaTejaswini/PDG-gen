import java.util.*;

public class Main{
  static int[] ans;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int a = 0, b = 0, ab = 0;
    for(int i = 0; i < N; i++){
      String S = sc.nextLine();
      int s = S.length();
      for(int j = 0; j < s-1; j++){
        if(S.charAt(j) == 'A' && S.charAt(j+1) == 'B'){
          ab++;
        }
      }
      if(S.charAt(0) == 'B'){
        b++;
      }
      if(S.charAt(s-1) == 'A'){
        a++;
      }
    }
    int c = N == 1 ? 0 : Math.min(a, b);
    System.out.println(ab+c);
  }
}