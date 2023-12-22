import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int check =0, total =0;
    for (int i =0; i<N; i++) {
      int a = sc.nextInt();
      if (a * N % 2 != 0 || a >= N) {
        check++;
        break;
      }
      total += a;
    }
    if (total != N * N / 2) check++;
    
    if (check != 0) {
      System.out.println(0);
    } else {
      System.out.println((int)Math.pow(2,N/2) % 1000000007);
    }
  } 
}