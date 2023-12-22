import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
	int M = scan.nextInt();
    int a[] = new int[M];
    int b[] = new int[M];
    for (int i = 0; i < M; i++) {
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }
    int load[] = new int[N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if(a[i] == j+1 ) {
          load[j]++;
        }
        if (b[i] == j+1) {
          load[j]++;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      System.out.println(load[i]);
    }
  }
}