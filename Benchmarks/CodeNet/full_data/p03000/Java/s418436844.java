import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int N = s.nextInt();
    int X = s.nextInt();
    int D = 0;
    int[] L = new int[N];
    int count = 1;
    for(int i = 0;i < N; i++){
      L[i] = s.nextInt();
    }
    for(int i = 0;i < N; i++){
      D = D + L[i];
      if(D <= X)count++;
    }
    System.out.println(count);
  }
}
