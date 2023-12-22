import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    sc.close();


    int all = A;
    int count = 1;

    while (all < B) {
      all = all - 1 + A;
      count++;
    }

    System.out.println(count);

  }

}