import java.util.*;

public class Main{

  public static int f(int n){
    if(n % 2 == 0){
      return n / 2;
    }else{
      return 3 * n + 1;
    }
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int n = 0;
    while(s != 4){
      s = f(s);
      n++;
    }
    n++;
    System.out.println(n + 3);
  }
}
