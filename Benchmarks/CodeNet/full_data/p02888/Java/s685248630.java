import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = sc.nextInt();
    }
    sc.close();

    Arrays.sort(L);
    
    int answer = 0;

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        int d = L[i] + L[j];
        int r = binary_search(L, d);
        int l = j + 1;
        answer += Math.max(0, r - l);
      }
    }

    System.out.println(answer);

  }

  public static int binary_search(int[] v, int x) {

    int l = -1;
    int r = v.length;

    while(r - l > 1) {

      int i = (l + r) / 2;

      if(x <= v[i]) {
        r = i;
      } else {
        l = i;
      }

    }

    return r;

  }

}