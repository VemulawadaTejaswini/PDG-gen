import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x[] = sc.next().split("");
    String y[] = sc.next().split("");
    int ans = 0;
    if ((x[0].equals(y[2]) && x[1].equals(y[1])) && x[2].equals(y[0])){
      ans++;
    }
    System.out.println(ans == 0 ? "NO" : "YES");
  }
}
