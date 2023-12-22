import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();

    int even = N / 2;
  
    int odd = N - even;
    
    System.out.println((double)odd / N);
    
  }

}