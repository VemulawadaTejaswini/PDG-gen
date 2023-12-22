import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp = n;
    int f = 0;
    while(tmp != 0){
      f += tmp % 10;
      tmp /= 10;
    }
    System.out.println(n % f == 0 ? "Yes" : "No");
  }
}