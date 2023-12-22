import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    
    int[] l = new int[Q];
    int[] r = new int[Q];

    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    sc.close();

    String[] s = S.split("");

    int count = 0;

    // 累積和
    int[] ac = new int[N+1];
    ac[0] = 0;

    boolean hasA = false;

    for (int i = 0; i < N; i++){
      if (hasA){
        hasA = false;
        if (s[i].equals("C")) {
          ac[i+1] = ac[i] + 1; 
        } else {
          ac[i+1] = ac[i];
        }
      } else {
        if (s[i].equals("A")) {
          hasA = true;
        }
        ac[i+1] = ac[i];
      }
    }

    for (int i = 0; i < Q; i++){
      count = ac[r[i]] - ac[l[i]];
      System.out.println(count);
    }

  }

}