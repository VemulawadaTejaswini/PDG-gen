import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int[] ls = new int[Q];
    int[] rs = new int[Q];
    for (int i = 0; i < Q; i++) {
      ls[i] = sc.nextInt();
      rs[i] = sc.nextInt();
    }
    int Slen = S.length();
    for (int i = 0; i < Q; i++) {
      String Si = S.substring(ls[i]-1,rs[i]);
      int count = 0;
      for (int j = 0; j < Si.length() - 1; j++) {
        if (Si.charAt(j) == 'A') {
          if (Si.charAt(j+1) == 'C') {
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }
}