import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int go = 0;
    int seven = 0;
    int a = sc.nextInt();
    if(a == 5) go++;
    if(a == 7) seven++;
    int b = sc.nextInt();
    if(b == 5) go++;
    if(b == 7) seven++;
    int c = sc.nextInt();
    if(c == 5) go++;
    if(c == 7) seven++;
    String ans = "NO";
    if((go == 2) && (seven == 1)) ans = "YES";
    System.out.println(ans);
  }
}