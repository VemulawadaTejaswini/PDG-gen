import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int addAB = A + B;
    int subAB = A - B;
    int mulAB = A * B;

    System.out.println(Math.max(addAB, Math.max(subAB, mulAB)));
  }
}
