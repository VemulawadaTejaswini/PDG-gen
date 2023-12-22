import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] N = sc.next().toCharArray();
    
    System.out.println(N[0] == N[2] ? "Yes" : "No");
  }
}