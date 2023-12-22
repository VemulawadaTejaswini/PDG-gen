import java.util.*;

public class Main {

  public static int N;
  public static int A;
  public static int B;
  public static int C;
  public static int[] l;
  public static int mp;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    N = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();

    l = new int[N];

    for (int i = 0; i < N; i++) {
      l[i] = sc.nextInt();
    }

    sc.close();

    mp = 99999999;

    dfs(0, 0, 0, 0, 0, 0, 0);

    System.out.println(mp);

  }

  public static void dfs (int i, int a, int b, int c, int acount, int bcount, int ccount) {

    if (i == N) {

      int mp_ = 0;

      if (a != 0 && b != 0 && c != 0) {

        if (acount != 0){
          mp_ += (acount - 1) * 10;
        }

        if (bcount != 0){
          mp_ += (bcount - 1) * 10;
        }

        if (ccount != 0){
          mp_ += (ccount - 1) * 10;
        }

        mp_ += Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C);

        mp = Math.min(mp, mp_);

      }

      return;
    }

    dfs(i+1, a, b, c, acount, bcount, ccount);

    dfs(i+1, a + l[i], b, c, acount+1, bcount, ccount);

    dfs(i+1, a, b + l[i], c, acount, bcount+1, ccount);

    dfs(i+1, a, b, c + l[i], acount, bcount, ccount+1);
    
    return;
    
  }

}