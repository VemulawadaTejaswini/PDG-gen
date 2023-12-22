import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());

    int in[] = new int[3];
    in[0] = A;
    in[1] = B;
    in[2] = C;
    Arrays.sort(in);

    System.out.println(in[2] * 10 + in[1] + in[0]);

  }
}