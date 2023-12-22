import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.nextLine();

    int[] list = new int[M];

    for(int i = 0; i < M; i++) {
      list[i] = sc.nextInt();
    }

    for(int i : list) {
      N -= i;
    }

    if(N <= -1) {
      N = -1;
    }

    System.out.println(N);
    sc.close();
  }
}