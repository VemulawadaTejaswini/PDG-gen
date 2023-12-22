import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double x = n/1.08;
    int y = (int)Math.round(x);
    double m = y * 1.08;
    // System.out.println(m);
    int l = (int)m;
    if(n == l){
      System.out.println(y);
    }else{
      System.out.println(":(");
    }
  }
}
