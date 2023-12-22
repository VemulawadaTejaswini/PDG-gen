import java.util.*;

public class Main{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); int k = s.nextInt();
    int c = 1;
    while (n / k != 0){
      n/=k; c++;
    }
    System.out.println(c);
  }
}
      