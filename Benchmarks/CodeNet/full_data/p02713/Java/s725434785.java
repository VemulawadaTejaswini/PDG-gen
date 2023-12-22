import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static long GCD(long x,long y){
    if (y == 0){return x;
    } else{
       return GCD(y, x % y);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N=sc.nextLong();
    long Sum=0;
    long temp=0;
      for(long a=1;a<=N;a++){
        for (long b=1;b<=N ;b++) {
           for(long c=1;c<=N;c++){

            Sum+=GCD(GCD(a,b),c);
          }
        }
      }





    System.out.println(Sum);

  }
}
