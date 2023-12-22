import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),
        b = sc.nextInt(),
        c = sc.nextInt(),
        d = sc.nextInt(),
        e = sc.nextInt(),
        k = sc.nextInt();
    String res = "Yay!";    
    if (e - a > k){
        res = ":(";
    }
    System.out.println(res);

  }
}
