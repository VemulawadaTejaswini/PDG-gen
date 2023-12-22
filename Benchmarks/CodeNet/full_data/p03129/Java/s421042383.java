import java.util.*;
public class Main {
  public static void main(String ... args) {
  	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int temp = n%2==0 ? n/2 : n/2 + 1;
    if(m>temp) System.out.println("NO");
    else System.out.println("YES");
  }
}
