import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    int train = N * A;
    int taxi = B;

    if (train < taxi){
      System.out.println(train);
    } else {
      System.out.println(taxi);
    }

  }
  
}