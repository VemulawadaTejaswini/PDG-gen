import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int    A = sc.nextInt();
    int    B = sc.nextInt();
    int    C = sc.nextInt();
    long   K = sc.nextLong();

    System.out.println( K % 2 == 0 ? A - B  : B - A  );


  }
}
