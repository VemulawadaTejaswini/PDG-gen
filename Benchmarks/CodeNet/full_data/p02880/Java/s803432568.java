import java.util.*;
 
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String ans = "No";
    
    if (num <= 81){
      for (int dan = 1; dan < 10; dan++){    
        if (num <= 9*dan && num%dan == 0) {
        ans = "Yes";
        break;
        }
      }
    } 
    System.out.println(ans);
  }
}