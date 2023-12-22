import java.util.*;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    int steps = (x * y) / 3;
    if ((X*y)% 3 != 0){
      System.out.println("0");
    }else{
	  System.out.println(steps % (pow(10, 9) + 7));
    }
  }
}