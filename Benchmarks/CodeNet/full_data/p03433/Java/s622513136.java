import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    N %= 500;
    System.out.println(A-N >=0 ? "Yes" : "No");
  }
}