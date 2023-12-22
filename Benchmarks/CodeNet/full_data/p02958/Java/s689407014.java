import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int[] p = new int[N];
    for (int i = 0; i < N; i++) {
      p[i] = Integer.parseInt(sc.next());
    }

    for (int i = 0; i < N; i++) {
      if (p[i] != i+1 && p[p[i]-1] != i+1) {
        System.out.println("NO");
        return;
      }       
    }
    System.out.println("YES");
  }
}