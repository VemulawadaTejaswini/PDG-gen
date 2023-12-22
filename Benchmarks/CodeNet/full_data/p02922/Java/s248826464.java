import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int num = b/a;
    int result = 0;
    result = num + ((b - (a*num-num-1))/a);
    System.out.println(result);
  }
}