import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (n%2 == 1){
      System.out.println((n+1)/2);
    }
    else{
      System.out.println(n/2);
    }
  }
}
