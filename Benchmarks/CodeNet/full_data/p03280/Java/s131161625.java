import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split("[\\s]+");
    int A = Integer.parseInt(input[0]);
    int B = Integer.parseInt(input[1]);
    System.out.println((A-1) * (B-1));
  }
}