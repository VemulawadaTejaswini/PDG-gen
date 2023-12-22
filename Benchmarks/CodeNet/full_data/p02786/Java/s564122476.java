import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();
    long count = 0;
    long n = h;
    long a = 1;


    for (int i = 1;n>0;i++ ) {
      if (n>1) {
        n=n/2;
        a = a*2;
        count+=2*a;
      }
      if (n==1) {
        n=0;

      }
    }

    System.out.println(count/2+1);
  }
}
