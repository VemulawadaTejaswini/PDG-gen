import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] L = new int[N];
    int distance = 0, total =0, j =0;
    for (int i=0; i<N; i++) {
      L[i] = sc.nextInt();
    }
    while (distance <= X) {
      distance += L[j];
      j++;
    }
     System.out.println(j);
  }
}