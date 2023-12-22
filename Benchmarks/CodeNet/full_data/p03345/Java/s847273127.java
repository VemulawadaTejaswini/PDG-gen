import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    long k = sc.nextLong();
    int out = (k%2 == 0) ? a-b : b-a;
    System.out.println(out);
  }
}
