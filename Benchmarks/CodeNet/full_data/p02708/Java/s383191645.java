import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();

    long sum = 0;
    long check = 1000000007;

    for (int i=k; i<=n+1; i++){
      sum = (sum + 1 + ((long) i*(n-i+1)) ) % check;
    }

    System.out.println(sum % check);
  }
}
