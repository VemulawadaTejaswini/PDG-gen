import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int x = 0;
    int y = 0;
    int z = 0;
    if(n % 2 == 0){
      x = n/2;
      System.out.println(x * m);
      z++;
    }
    else{
      x = n/2 + 1;
      if(m % 2 == 0){
        y = m/2;
        int a = (x * y) + ((x-1) * y);
        System.out.println(a);
      }
      else{
        y = m/2 + 1;
        int a = (x * y) + ((x-1) * (y-1));
        System.out.println(a);
      }
    }
  }
}