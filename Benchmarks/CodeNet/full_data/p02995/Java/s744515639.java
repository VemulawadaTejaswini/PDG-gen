import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong() - 1;
    long b = sc.nextLong();
    int c = sc.nextInt();
    int d = sc.nextInt();
    long na = a - (a / c) - (a / d) + (a / lcm(c,d));
    long nb = b - b / c - b / d + b / lcm(c,d);
    System.out.println(na);
    System.out.println(nb);
    System.out.println(nb - na);
  }
  public static long lcm(int c , int d){
    return c * d / gcd(c , d);
  }
  public static long gcd(int c , int d){
    if(c % d == 0){
      return d;
    }
    return gcd(d, c%d);
  }
}


