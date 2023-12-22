import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int trainA = sc.nextInt();
    int trainB = sc.nextInt();
    int busA = sc.nextInt();
    int busB = sc.nextInt();
    System.out.println(Math.min(trainA, trainB) + Math.min(busA, busB));
  }
}