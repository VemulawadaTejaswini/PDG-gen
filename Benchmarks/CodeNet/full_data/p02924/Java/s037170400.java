import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    long[] I = new long[N];

    long sum = 0;

    for (int i = 0; i < N; i++) {
      I[i] = i + 1;
      if (i != N -1){
        sum += I[i];
      }
    }

    System.out.println(sum);

  }

}