import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int[] m = new int[N];
    int m_min = Integer.MAX_VALUE;
    int count = 0;
    for (int i = 0; i < N; i++) {
      m[i] = sc.nextInt();
      X -= m[i];
      count++;
      if (m[i] < m_min) {
        m_min = m[i];
      }
    }
    count += (X / m_min);
    System.out.println(count);
  }
}