import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] abc = new int[3];
    for (int i = 0; i < 3; i++)
      abc[i] = sc.nextInt();
    int d = sc.nextInt();
    Arrays.sort(abc);
    System.out.println(abc[2] - abc[1] <= d && abc[1] - abc[0] <= d ? "Yes" : "No");
  }

}
