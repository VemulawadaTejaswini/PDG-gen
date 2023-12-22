import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    if (a<=c){
      long d = a;
      a = 0;
      c -= d;
    }
    else{
      a -= c;
      c = 0;
    }
    b -= c;
    if (b<0){
      b=0;
    }

    System.out.println(a+" "+b);
  }
}
