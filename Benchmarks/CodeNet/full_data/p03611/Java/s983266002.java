import java.io.*;
import java.util.*;

class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] freq = new int[(int)1e5 + 1];
    //10^5 = 100,000
    //~2e9
    for (int i = 0; i < N; i++)
    {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++)
    {
      freq[A[i]] += 1; //case do nothing:
      if (A[i] - 1 >= 0) freq[A[i] - 1] += 1;
      freq[A[i] + 1] += 1;
    }
    int count = 0;
    for (int i = 0; i< 1e5 + 1; i++)
    {
      count = Math.max(count, freq[i]);
    }
    System.out.println(count);
  }
}
