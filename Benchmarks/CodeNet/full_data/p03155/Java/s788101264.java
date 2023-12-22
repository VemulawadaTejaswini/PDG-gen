import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int H = sc.nectInt();
    int W = sc.nextInt();
    
    System.out.println((N-W+1)*(N-H+1));
  }
}