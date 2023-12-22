import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double H = sc.nextDouble();
    double W = sc.nextDouble();
    long s = (long)Math.ceil(H * W / 2);
    System.out.println(s);
  }
}
