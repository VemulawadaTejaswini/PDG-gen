import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String ans = 'No';
    int a = sc.nextInt();
    
    String as = String.valueOf(a);
    String x = as.substring(0, 1);
    String y = as.substring(1, 2);
    String z = as.substring(2, 3);

    if (x == '7' || y == '7' || z == '7') {
      ans = 'Yes';
    }

    System.out.println(ans);
  }
}