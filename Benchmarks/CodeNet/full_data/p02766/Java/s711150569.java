import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int count = 0;
    while (a>0){
      int min = (int) Math.pow(b,count+1);
      int minus = (int) a%min;
      a -= minus;
      count++;
    }
    System.out.println(count);
  }
}
