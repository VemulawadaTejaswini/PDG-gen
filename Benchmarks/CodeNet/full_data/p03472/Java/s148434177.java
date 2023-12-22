import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H = sc.nextInt();
    Integer[] a = new Integer[N];
    Integer[] b = new Integer[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    sc.close();
  
    Arrays.sort(a, Comparator.reverseOrder());
    Arrays.sort(b, Comparator.reverseOrder());

    int answer = 0;

    for (int i = 0; i < N; i++) {
      if (a[0] <= b[i] && 0 < H) {
        answer++;
        H -= b[i];
      } else {
        break;
      }
    }

    if (0 < H) {
      answer += Math.ceil((double) H / a[0]);
    }

    System.out.println(answer);

  }

}