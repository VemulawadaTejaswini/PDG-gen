import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int D = sc.nextInt();
    int N = sc.nextInt();

    sc.close();
    
    System.out.println(N * (int)Math.pow(100,D));
    
  }

}